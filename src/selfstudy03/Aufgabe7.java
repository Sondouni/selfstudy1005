package java2008;

import java.util.Scanner;

public class Aufgabe7 {

	public static void main(String[] args) {

		System.out.println("���� ���� �Է��ϼ���>");
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		
		switch(month) {
		    case 3:
		    case 4:
		    case 5:
		    	System.out.println("��");
		    	break;
		    case 6: case 7: case 8:
		    	System.out.println("����");
		    	break;
		    case 9: case 10: case 11:
		    	System.out.println("����");
		    	break;
		    case 12: case 1: case 2:
		    	System.out.println("�ܿ�");
		    	break;
		    default :
		    	System.out.println("1~12������ ���ڸ� �Է��ϼ���뤷");
		    	
		    	
		    	
		}	
		
		
		
		
		
		
		
		
		
		
		
	}

}