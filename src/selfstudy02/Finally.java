package day0914;

public class Finally {

	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		try {
			System.out.println("�ܺη� ����");
			int c =b/a;
		}
		catch(ArithmeticException e ) {
			System.out.println("������ �߻��߽��ϴ�");
		}
		finally {
			System.out.println("������ ��������");
		}
	}

}
