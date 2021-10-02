package selfstudy;

public class BindingTest2 {

	public static void main(String[] args) {
		Parent2 p = new Child2();
		Child2 c = new Child2();
		
		System.out.println("p.x = "+p.x);
		p.method();
		System.out.println("c.x = "+c.x);
		c.method();
	}	
}
class Parent2{
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}
class Child2 extends Parent2{}//아무것도 정의되어있지 않고 단순히 조상으로 부터 멤버들을 상속
							  //참조 변수의 타입에 관계없이 조상의 멤버들을 사용
