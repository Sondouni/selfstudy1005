package selfstudy04;

public class ExceptionEx4 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch(Exception e) { //ArithmeticException��� Exception�� ����Ѵ� 
			System.out.println(5); //���ܰ� �߻����� �ʾ� ������ �ȵ�
		}
		System.out.println(6);
	}
}
//������ Exception�� ����ϰ� �ȴٸ� � ������ ���ܰ� �߻��ƴ��� Ȯ���Ҽ� ����