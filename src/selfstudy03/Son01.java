package java2008;

import java.util.Scanner;

public class Son01 {

	public static void main(String[] args) {

		System.out.println("숫자를 하나 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		/*
		if(input == 0) {
			 System.out.println("입력 하신 숫자는 0 입니다");
		} else {
			System.out.println("입력 하신 숫자는 0이 아닙니다.");
		}
		*/
		
		if(input == 0) {
			System.out.println("입력 하신 숫자는 0 입니다");
		}else if(input == 1) {
			System.out.println("입력 하신 숫자는 1 입니다");
		}else if(input == 2) {
			System.out.println("입력 하신 숫자는 2 입니다");
		}else  {
			System.out.println("입력 하신 숫자는 0,1,2 가 아닙니다");
		
	}

}
}
