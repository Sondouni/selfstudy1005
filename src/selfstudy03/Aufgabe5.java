package java2008;

import java.util.Date;

public class Aufgabe5 {

	public static void main(String[] args) {

		
		Date date = new Date();
		int currentHour = date.getHours();
	
		System.out.println("����ð���"+date);
		if(currentHour<11) {
			System.out.println("Good Morning");
		}else if(currentHour <15) {
			System.out.println("Good afternoon");
		}else if(currentHour <20) {
			System.out.println("good evening");
		}else {
			System.out.println("Good night");
		}
	
	
	
	
	
	}

}
