package selfstudy05_10_08;

public class StringClass {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc"; // str1,str2는 둘다 "abc"객체를 가리키고있음 (얕은복사)
		
		if(str1 == str2) {
			System.out.println(" str1 == str2? true");
		}else {
			System.out.println(" str1 == str2? false");
		}
		if(str1.equals(str2)) {
			System.out.println(" str1.equals(str2)? true");
		}else {
			System.out.println(" str1.equals(str2)? false");
		}
		System.out.println();
		String str3 = new String("abc"); // 같은 값을 가지지만, 다른 메모리에 저장된다
		String str4 = new String("abc");
		if(str3 == str4) {
			System.out.println(" str3 == str4? true");
		}else {
			System.out.println(" str3 == str4? false");
		}
		if(str3.equals(str4)) {
			System.out.println(" str3.equals(str4)? true");
		}else {
			System.out.println(" str3.equals(str4)? false");
		}
	}
}
//equals메서드는 모두 true를 리턴했다 그래서 문자열 비교시 equals메서드를 권장
