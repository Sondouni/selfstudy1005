package son0819;

public class Neuaufgabe4 {

	public static void main(String[] args) {
		int x = 0;
		System.out.printf("x=%d 일때, 참인 것은 %n", x);
		if(x == 0) System.out.println("x == 0");
		if(x != 0) System.out.println("x ! = 0");
		if(!(x == 0)) System.out.println("!(x == 0)");
		if(!(x != 0)) System.out.println("!(x !=0)");
		
		if(x == 1) {
			System.out.println("참");
			System.out.println("참");
			}else {
            System.out.println("거짓");
            System.out.println("거짓");
	}

   }
}