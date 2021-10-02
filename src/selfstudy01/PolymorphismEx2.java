package day20210928;
/*
 * 다형적 표현에서 맴버에 대한 접근규정들
 * 부모 클래스가 가지고있는 모든 맴버에 접근가능
 * 단 자식클래스에서 오버라이딩을 했다면 오버라이딩이 된 자식에게 접근이된다..????
 * 맴버필드의 경우 부모클래스의 맴버필드에만 접근할수 있다 (필드는 속성, 변수들을 의미)
 * 자식 클래스 맴버필드는 오버라이딩이 된 자식 클래스의 메서드에 의해서만 접근할수 있다.
 * 변수는 오버라이딩이 안된다 ((상속과 다양성은 따로봐야함))
 */
public class PolymorphismEx2 {
	public static void main(String[] args) {
		Parent4 p = new Child4();
		System.out.println("x= "+ p.x);
//		System.out.println("x= "+ p.x);	자식을 부모에 넣으면 부모클래스 안에 있는것들만 접근이 가능하다
//		System.out.println("y= "+ p.y); 컴파일 에러 발생
		//자손타입(sub)->조상(super):형변환 생략 가능
		//자손타입(sub)<-조상(super):형변환 생략 불가능
		System.out.println("y = "+ ((Child4)p).y);
	}
}
class Parent4{
	int x = 100;
//	int y = 200;
}
class Child4 extends Parent4{
	int x = 200;
	int y = 400;
}