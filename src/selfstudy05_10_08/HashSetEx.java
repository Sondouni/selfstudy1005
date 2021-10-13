package selfstudy05_10_08;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		/*
		 * hashset
		 * set인터페이스를 구현한 가장 대표적인 컬렉션
		 * set의 특징대로 중복된 요소를 저장하지 않는다.
		 * list를 구현한 컬렉션클래스들과 달리 순서를 유지하지 않는다
		 */
		HashSet hset = new HashSet();
		hset.add(new Integer(100));
		hset.add("100");
		hset.add(200);
		hset.add(300);
		System.out.println(hset);
		
		hset.add(300);
		hset.add(400);
		hset.add(500);
		System.out.println(hset);
		
	}
}
/*
 * 결과값을 보면 중복된 값은 저장되지 않음
 * add메서드는 이미 같은 객체가 있으면 중복으로 간주하고 저장안함, 그리고 작업실패의 의미로 false를 리턴
 * 100이 2번 출력되는 이유 : 하나는 String값, 하나는 Integer값
 */
