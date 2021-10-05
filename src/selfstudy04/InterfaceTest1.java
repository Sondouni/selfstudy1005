package selfstudy04;

public class InterfaceTest1 {

	public static void main(String[] args) {
		A a = new A();
		
		a.method(new B());
		a.method(new C());
	}
}
interface I{
	void play();
}
class A{
	void method(I i) {
		i.play();
	}
}
class B implements I{
	public void play() {
		System.out.println("methodB()");
	}
}
class C implements I{
	public void play() {
		System.out.println("methodC()");
	}
}
//�Ʊ� �����̶� �ٸ���, �������̽��� ��ӹ޴� �� Ŭ�������� �ٸ������ �����Ѵ�
//�̷����� Ŭ������ �ϳ� ����� �����ϴ� �޼ҵ�(�Ű������� �������̽��� �ް�, ��ü�� �޼ҵ带 �����ϴ�)�� �����
//���ο��� new __�� �־� �ٷ� �����Ҽ� �ְ� �������Ѵ�.