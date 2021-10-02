package java2008;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		
		if(a%2 != 0) {
		   System.out.println("홀수입니다.");
		}else {
			System.out.println("짝수입니다.");
		}
		
		System.out.println("프로그램이 종료되었습니다");
		
	}

}
