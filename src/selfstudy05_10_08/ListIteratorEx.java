package selfstudy05_10_08;
import java.util.*;
public class ListIteratorEx {

	public static void main(String[] args) {
/*
 * ListIterator
 * Iterator의 단점인 단방향 이동을 극복하기위해 만듬
 * 양방향 이동이 가능하지만 list 인터페이스를 구현한 컬렉션에서만 사용가능
 */
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it = list.listIterator();
		
		System.out.println("순방향=====");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		System.out.println("역방향=====");
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		System.out.println();
		
	}

}
