package selfstudy01;
/*
 * ���� Ŭ������ ����� ��������� ���� �̸��� �ν��Ͻ� ������ �ڼ� Ŭ������ �ߺ����� ����������,
 * �޼����� ��� �׻� ���� �ν��Ͻ��� �޼���(�������̵��� �޼���)�� ȣ�������,
 * �ɹ������� ���, ���������� Ÿ�Կ� ���� �޶�����.....
 */
public class BindingTest {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = "+ p.x);
		p.method();
		
		System.out.println("c.x = "+ c.x);
		c.method();
	}

}
class Parent{
	int x = 100;
	public  void method() {
		System.out.println("Parent Method");
	}
}
class Child extends Parent{
	int x = 200;
	public  void method() {
		System.out.println("Child Method");
	}
}