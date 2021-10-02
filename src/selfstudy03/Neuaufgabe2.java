package son0819;

public class Neuaufgabe2 {

	public static void main(String[] args) {
		
		char ch = ' ';
		
		ch = '1';
		System.out.printf("%b%n", '0' <= ch && ch<='9');
		
		ch = 'a';
		System.out.printf("%b%n", 'a' <= ch && ch<='z');
		
		ch = 'A';
		System.out.printf("%b%n", 'A' <= ch && ch<='Z');
		
		ch = 'q';
		System.out.printf("%b%n", ch=='q'  || ch == 'Q');
		
		
		
		

	}

}
