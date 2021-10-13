package selfstudy05_10_08;

import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		/*
		 * Iterator
		 * 컬렉션에 저장된 각 요소에 접근하는데 사용되는 인터페이스
		 * List와 Set은 Collection인터페이스의 자손이므로 바로 사용가능
		 * Map의 경우는 자손이 아니므로 Set의 형태로 얻어온 후에 호출
		 * 단방향으로만 이동이 가능. 컬렉션의 마지막 요소에 다다르면 더이상 사용불가
		 * Enumeration은 Interator의 구버젼//호환을위해서만 남겨놓음
		 */
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator(); //Iterator를 통해 list요소에 접근
		while(it.hasNext()) {		   //읽어올 요소가 남아있는지 확인, 있으면 true,없으면 false 
			Object obj = it.next();	   //다음요소를 읽어온다. next()호출전 hasNext()를 호출해서 		
									   //읽어올 요소가있는지 확인하는것이 안전
			System.out.println(obj);
		}
	}

}
/*
 * List클래스들은 저장순서를 유지하기 때문에Iterator를 이용해서 읽어온 결과 역시 저장순서와 동일
 * Set클래스들은 각 요소간의 순서가 유지되지 않기 때문에 Iterator를 이용해서 저장된 요소를 읽어와도
 * 처음에 저장된 순서와 같지않다.
 */
