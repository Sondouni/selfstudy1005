package java2008;

import java.util.Scanner;

public class Aufgabe6 {

	public static void main(String[] args) {

		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하십시오");
		number = sc.nextInt();
		sc.close();
	
		switch(number){
		case 0:
			System.out.println("없음");
			break;
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			
		default:
			System.out.println("많음");
			break;
		
		
		
		}
	
	
	
	
	
	}
	

}
