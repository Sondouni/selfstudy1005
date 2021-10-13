package selfstudy05_10_08;

import java.util.HashMap;
import java.util.*;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", new Integer(90));
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(90));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));
		//set entrySet() : HashMap에 저장된 키와 값을 엔트리(키와 값의 결합)의 형태로 Set에 저장해서 반환
		Set set = map.entrySet();
		Iterator it = set.iterator(); //Iterator를 쓰고싶어서 Set으로 형변환
		
		while(it.hasNext()) {
			Map.Entry e =(Map.Entry)it.next();
			System.out.println("이름: "+e.getKey()+"점수: "+e.getValue());
		}
		
		set = map.keySet(); //HashMap에 저장된 모든키가 저장된 Set을 반환
		System.out.println("참가자 명단 : "+set);
		
		Collection values = map.values();//Iterator()를 쓰려하니 Map에는 없어서 Collection으로 형변환
		it = values.iterator(); //Iterator는 재사용 불가
		
		int total=0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+(float)total/set.size());
		System.out.println("최고점수 : "+Collections.max(values));
		System.out.println("최저점수 : "+Collections.max(values));
		
	}

}
