package day0914;

public class Exception1 {

	public static void main(String[] args) {
		try {
			int []a= {2,0,0};
			int b=4;
			int c=b/a[2];//�迭�� �ε����� [0],[1]�ۿ�����
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("������� �߻�");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭���� �����߻�");
		}
		System.out.println("����ó�� ���� ��");
	}

}
