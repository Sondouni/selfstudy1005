package selfstudy01;

public class PolymorphismEx3 {

	public static void main(String[] args) {
		Parent6 p = new Child6();//������ ǥ��
		p.aaa();
		p.bbb();
//		p.ccc(); �ڽ�Ŭ�������� �����Ƿ� �θ�Ŭ������ ��ü�� p�� �ҷ��ü� ����
		
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
 * ������
 * 1.�ʵ�� ������ ����Ŭ������ �ʵ常 ��밡��
 * 2.�޼��嵵 ���� Ŭ������ �޼��常 ����Ҽ� �ִµ�, �������̵��� �Ǿ��ٸ� ���� Ŭ������ �޼��尡 ����ȴ�.
 */
