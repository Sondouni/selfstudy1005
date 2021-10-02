package java2008;

import java.util.Scanner;

public class Aufgabe7 {

	public static void main(String[] args) {

		System.out.println("현재 월을 입력하세용>");
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		
		switch(month) {
		    case 3:
		    case 4:
		    case 5:
		    	System.out.println("봄");
		    	break;
		    case 6: case 7: case 8:
		    	System.out.println("여름");
		    	break;
		    case 9: case 10: case 11:
		    	System.out.println("가울");
		    	break;
		    case 12: case 1: case 2:
		    	System.out.println("겨울");
		    	break;
		    default :
		    	System.out.println("1~12사이의 숫자를 입력하세요용ㅇ");
		    	
		    	
		    	
		}	
		
		
		
		
		
		
		
		
		
		
		
	}

}
