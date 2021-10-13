package selfstudy05_10_08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//<>가 둘다 없으면 아무거나 다 받을수 있음.
		list.add("카라"); // ArrayList에 객체를 추가
		list.add("소녀시대"); 
		list.add("원더걸스"); 
		list.add(new String("야호"));
		System.out.println(list);
		
		//contains로 데이터 검색
		if(list.contains("카라")) {//true or false리턴
			System.out.println("존재합니다.");
		}
		//데이터를 하나씩 꺼내봅니다
		for(int i = 0; i<list.size();i++) {
			String str = (String)list.get(i); //list의 i번째 요소를 가져온다
			System.out.println(i + " :"+str);
		}
		//데이터를 삭제
		list.remove(2);
		System.out.println("remove 후 : "+list);
		//특정위치의 데이터를 가져온다get
		System.out.println("index 2번째 위치한 객체: "+list.get(2));
		//특정위치에 데이터를 추가
		list.add(1,"BTS");
		System.out.println("1번째 위치에 BTS추가후: "+list);
		
		//ArrayList의 크기를 읽어오자
		System.out.println("list의 크기: "+list.size());
		
		//원본 ArrayList를 복사하자
		ArrayList alist = new ArrayList();
		alist = (ArrayList)list.clone();
		System.out.println("복제된 list: "+alist);
		
		//ArrayList를 완전히 비워보자
		list.clear();
		System.out.println("clear()실행후: "+list);
		
		ArrayList list2 = new ArrayList();
		list2.add(1);
		list2.add(4);
		list2.add(6);
		list2.add(2);
		list2.add(5);
		
		System.out.println("정렬 전: "+list2.toString());
		list2.sort(Comparator.naturalOrder()); //list2.sort(null)와 같다
		System.out.println("오름차순: "+list2.toString());
		list2.sort(Comparator.reverseOrder());
		System.out.println("내림차순: "+list2.toString());
	}

}
