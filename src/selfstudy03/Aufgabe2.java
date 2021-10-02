package java2008;

import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {

		int x;
		System.out.println("실적을 입력하시오(단위:만원)");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		if(x>1000) {
			System.out.println("실적달성");
			System.out.println((x-1000)/10);
			
		}else {
			System.out.println("실적달성 실패");
		}
			
		
		
	}

}
