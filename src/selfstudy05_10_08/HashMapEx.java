package selfstudy05_10_08;
import java.util.*;
/*
 * HashMap
 * Map의 특징인 키 (Key)와 값(Value)를 묶어서 하나의 데이터(entry)로 저장
 * Key는 하나만 가질수 있지만 Key의 value값은 덮어씌어짐
 * 많은양의 데이터를 검색하는데 좋은성는
 */

public class HashMapEx {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId","1234");
		map.put("asdf","1111");
		map.put("asdf","1234");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id와 Password를 입력해주세요");
			System.out.print("id: ");
			String id = sc.next().trim();
			
			System.out.print("password: ");
			String password = sc.next().trim();
			System.out.println();
			if(!map.containsKey(id)) {
				System.out.println("입력한 ID는 존재하지 않습니다 다시 입력해");
			}else {
				if(!(map.get(id).equals(password))) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시입력해");
				}else {
					System.out.println("ID와 비밀번호가 일치");
					break;
				}
			}
		}
	}

}
