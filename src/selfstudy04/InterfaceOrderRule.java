package selfstudy04;
/*
 * �� Ŭ������ ��Ӱ� �������̽��� �Ѵ� �޾Ұ� ���� �̸��� �޼ҵ尡 �ִٸ�
 * "���"������ �޼ҵ尡 �켱�õȴ�.
 */
public class InterfaceOrderRule {
	public static void main(String[] args) {
		Child c = new Child();
		Parent p1 = new Child();
		c.method1();
		c.method2();
		p1.method2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
}
class Child extends Parent implements MyInterface, MyInterface2{
	//@Override
	public void method1() {
		System.out.println("method1() in child");
	}
	//@Override
	public void method2() {
		System.out.println("method2() in child");
	}
}
class Parent{
	public void method2() {
		System.out.println("method2() in parents");
	}
}
interface MyInterface{
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}
interface MyInterface2{
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}
