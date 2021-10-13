package selfstudy05_10_08;

import java.util.*;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("카라"); 
		list.add("소녀시대"); 
		list.add("원더걸스"); 
		list.add(new String("야호"));
		
		//subList(int fromIndex, int toIndex) -> from부터 to사이의 객체를 반환
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		print(list,list2);
		//containsAll(Collection c)지정된 Collection(c)의 모든요소가 ArrayList에 포함되어있는지 확인
		boolean b = list.containsAll(list2);
		System.out.println(b);
		System.out.println();
		
		list2.add("B");
		list2.add("C");
		list2.add("A");
		print(list,list2);
		System.out.println();
		
		list2.set(3, "AA");//3번의 값을 AA로 변경
		print(list,list2);
		
		System.out.println("retainAll하기전 list1: "+list);
		list.retainAll(list2);//list에서list2와 겹치는 부분만 남기고 나머지 삭제
		print(list,list2);
		
		//뒤에서부터 삭제해야지 0까지 삭제가된다.((remove특성))
		for(int i=list.size()-1;i>=0;i--) {
			if(list.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list,list2);
	}
	static void print(ArrayList l1, ArrayList l2) {
		
			System.out.println("list : "+ l1);
			System.out.println("list2 : "+ l2);
			System.out.println();
			
		
	}

}
