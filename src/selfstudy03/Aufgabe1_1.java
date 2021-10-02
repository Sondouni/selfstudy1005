package java2008;

import java.util.Scanner;

public class Aufgabe1_1 {

	public static void main(String[] args) {

		int x, y, max;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 정수를 입력하시오.");
		x = sc.nextInt();

		System.out.println("두번째 정수를 입력하시오.");
		y = sc.nextInt();

		
					
		if (x>y) {
			max = x;
		}else {
			max = y;
		}
		
		System.out.println("큰 수는" + max);
	
		
		
		
	}
}