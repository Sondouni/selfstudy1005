package java2008;

import java.util.Scanner;

public class Aufgabe1_1 {

	public static void main(String[] args) {

		int x, y, max;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("ù��° ������ �Է��Ͻÿ�.");
		x = sc.nextInt();

		System.out.println("�ι�° ������ �Է��Ͻÿ�.");
		y = sc.nextInt();

		
					
		if (x>y) {
			max = x;
		}else {
			max = y;
		}
		
		System.out.println("ū ����" + max);
	
		
		
		
	}
}