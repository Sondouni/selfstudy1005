package java2008;

import java.util.Scanner;

public class Letzte {

	public static void main(String[] args) {

		System.out.println("당신의 주민등록번호를 입력하십쇼.(011231-1111222) 성을 맞춰드립니다 닝겐>");
		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		sc.close();
		char gender = regNo.charAt(7);
		
		switch (gender) {
		case '1': case'3' :
			System.out.println("당신은 남자입니니까?????");
			break;
		case '2': case'4' :
			System.out.println("당신은 여자입니까 휴먼");
			break;
		default :
			System.out.println("유효하지않는뎁쇼");
			
			
		}
		
	}

}
