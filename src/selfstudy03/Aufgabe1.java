package java2008;

import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {

		
		System.out.println("첫번째 정수를 입력하시오.");
		System.out.println("두번째 정수를 입력하시오.");
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x>y) {
			System.out.println(x);
		}else 
		{System.out.println(y);
				
		
	}
		System.out.println("프로그램 종료");
	

}
}