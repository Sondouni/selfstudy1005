package selfstudy;

public class PolymorphismEx3 {

	public static void main(String[] args) {
		Parent6 p = new Child6();//다형적 표현
		p.aaa();
		p.bbb();
//		p.ccc(); 자식클래스에만 있으므로 부모클래스의 객체인 p는 불러올수 없다
		
		((Child6)p).ccc();
	}

}
class Parent6{
	public void aaa() {
		System.out.println("Parent aaa");
	}
	public void bbb() {
		System.out.println("Parent bbb");
	}
}
class Child6 extends Parent6{
	public void bbb() {
		System.out.println("Child bbb1");
		
	}
	public void ccc() {
		System.out.println("Child ccc");
	}
}
/*
 * 다형성
 * 1.필드는 무조건 상위클래스의 필드만 사용가능
 * 2.메서드도 상위 클래스의 메서드만 사용할수 있는데, 오버라이딩이 되었다면 하위 클래스의 메서드가 실행된다.
 */
