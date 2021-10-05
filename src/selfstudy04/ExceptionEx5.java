package selfstudy04;

public class ExceptionEx5 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch(ArithmeticException ae) { //���⼭ ���ܸ� ��´ٸ�, ���� catch���� ������ �ȵȴ�
			if(ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		}catch(Exception e) {//ArithmeticException�� ������ ��� ���ܰ� ó��
			System.out.println("Exception");
		}
		System.out.println(6);
	}
}
