package java2008;

import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {

		int score;
		System.out.println("������ �Է��Ͻʽÿ�");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80){
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		
		
	}

}
