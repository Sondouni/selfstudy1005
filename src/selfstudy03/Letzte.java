package java2008;

import java.util.Scanner;

public class Letzte {

	public static void main(String[] args) {

		System.out.println("����� �ֹε�Ϲ�ȣ�� �Է��Ͻʼ�.(011231-1111222) ���� ����帳�ϴ� �װ�>");
		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		sc.close();
		char gender = regNo.charAt(7);
		
		switch (gender) {
		case '1': case'3' :
			System.out.println("����� �����Դϴϱ�?????");
			break;
		case '2': case'4' :
			System.out.println("����� �����Դϱ� �޸�");
			break;
		default :
			System.out.println("��ȿ�����ʴµ���");
			
			
		}
		
	}

}
