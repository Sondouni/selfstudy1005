package java2008;

import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {

		int score;
		System.out.println("성적을 입력하십시오");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		if(score>=97) {
			System.out.println("A+");
		}else if(score>=93){
			System.out.println("A");
		}else if(score>=89){
			System.out.println("A-");
		}else if(score>=85){
			System.out.println("B+");
		}else if(score>=81){
			System.out.println("B");
		}else if(score>=76){
			System.out.println("B-");
		}else if(score>=72){
			System.out.println("C+");
		}else if(score>=68){
			System.out.println("C");
		
		}else {
			System.out.println("F");
		}
		
		
	}

}