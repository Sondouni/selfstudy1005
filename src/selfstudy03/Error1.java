package java2008;

import java.util.Scanner;


public class Error1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		scanner.nextInt();
		
		int number = 0;
		if( number > 0 ) {
			System.out.println("양수입니다.");
		}else
		{System.out.println("0이거나 음수입니다");
	}

	}
}
