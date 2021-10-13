package selfstudy06_10_13;
import java.util.Scanner;

public class Traficlight2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("��ȣ�� ���α׷�");
		System.out.println("��ȣ�� �Է��ϼ���~");
		System.out.println("������:1 �Ķ���:2 �����:3");
		int sign = sc.nextInt();
		String result = sign==1?"�����ϼ���~":sign==2?"����ϼ���":"������";
		System.out.println(result);
		
	}

}
