package selfstudy06_10_13;

import java.util.Scanner;

public class If_if {

	public static void main(String[] args) {
		String id,password;
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է����ּ���");
		id=sc.nextLine();
		
		
		
		
		
		if(id.equals("Java")){
			System.out.println("ID��ġ!");
			System.out.println("��й�ȣ�� �Է����ּ���");
			password=sc.nextLine();
			if(password.equals("abc123")) {
				System.out.println("password��ġ!");
				System.out.println("�α��� ����!");
			}else {
				System.out.println("���� ��");
			}
		}else {
			System.out.println("�̻��� �������̳�");
		}
		
		
		
		
		
	}

}
