package selfstudy01;

public class InstanceOf {

	public static void main(String[] args) {
		A ap = new B();
		B bp = null;
		
		if(ap instanceof B) { //���� : �ν��Ͻ� instanceof ��ȯ�� Ŭ����
			bp = (B)ap;
			System.out.println("�� ��ȯ�� �����մϴ�");
		}
		else {
			System.out.println("�� ��ȯ�� �Ұ��� �մϴ�.");
		}
	}

}
class A{}
class B extends A{}