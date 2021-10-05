package selfstudy04;

public class InterfaceTest2 {

	public static void main(String[] args) {
		A3 a = new A3();
		a.methodA();
	}
}
class A3{
	void methodA() {
		//��3�� Ŭ������ �޼��带 ���ؼ� �������̽� I3�� ������ Ŭ������ �ν��Ͻ��� ���´�.
		I3 i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());//i�� ObjectŬ������ �޼��带 ȣ�Ⱑ��
	}
}
interface I3{
	public abstract void methodB();
}
class B3 implements I3{
	@Override
	public void methodB() {
		System.out.println("methodB in B3 class");
	}
	public String toString() {
		return "classB3";
	}
}
class InstanceManager{
	//����Ÿ���� I3�̸� �������̽� I3�� �����ϴ°��� �ƴ� I3�� ������ Ŭ������ �����Ѵٴ°�
	public static I3 getInstance() {
		return new B3();//�ٸ� �������̽��� �ٲٷ��� ���⸸ �����ϸ� ����
	}
}