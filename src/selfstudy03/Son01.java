package java2008;

import java.util.Scanner;

public class Son01 {

	public static void main(String[] args) {

		System.out.println("���ڸ� �ϳ� �Է��ϼ���.>");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		/*
		if(input == 0) {
			 System.out.println("�Է� �Ͻ� ���ڴ� 0 �Դϴ�");
		} else {
			System.out.println("�Է� �Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		}
		*/
		
		if(input == 0) {
			System.out.println("�Է� �Ͻ� ���ڴ� 0 �Դϴ�");
		}else if(input == 1) {
			System.out.println("�Է� �Ͻ� ���ڴ� 1 �Դϴ�");
		}else if(input == 2) {
			System.out.println("�Է� �Ͻ� ���ڴ� 2 �Դϴ�");
		}else  {
			System.out.println("�Է� �Ͻ� ���ڴ� 0,1,2 �� �ƴմϴ�");
		
	}

}
}
