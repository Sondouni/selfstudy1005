package java2008;

import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {

		int x;
		System.out.println("������ �Է��Ͻÿ�(����:����)");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		if(x>1000) {
			System.out.println("�����޼�");
			System.out.println((x-1000)/10);
			
		}else {
			System.out.println("�����޼� ����");
		}
			
		
		
	}

}
