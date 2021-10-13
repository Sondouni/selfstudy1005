package selfstudy06_10_13;

import java.util.Scanner;

public class If_else_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("����:");
		age=sc.nextInt();
		
		if(age>19) {
			System.out.println("�����Դϴ�");
			System.out.println("���ο���� ����");
		}else if(age>13) {
			System.out.println("û�ҳ��Դϴ�");
			System.out.println("û�ҳ���");
		}else if(age>8) {
			System.out.println("�� �ʵ�");
			System.out.println("��¥");
		}
			System.out.println("���� ��");
		
		
		
		
	}

}
