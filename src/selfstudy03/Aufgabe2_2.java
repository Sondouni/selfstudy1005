package java2008;

import java.util.Scanner;

public class Aufgabe2_2 {

	public static void main(String[] args) {

		
		final int target_Sales = 1000;
		int mySales;
		int bonus;
		String result;
		
		Scanner input= new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�(����:����)");
		mySales = input.nextInt();
		
		if(mySales>=target_Sales) {
			result = "�����޼�";
			bonus = (mySales - target_Sales) /10;		
		}else {
			result = "���� �޼� ����";
			bonus = 0;	
		}
	

		System.out.println(result + "\n"+ "���ʽ�" + bonus);
	}
	
	
}
