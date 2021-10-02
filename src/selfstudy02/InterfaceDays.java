package day0110;

public class InterfaceDays implements Days{

	public static void main(String[] args) {
		System.out.println("¿œø‰¿œ: "+SUNDAY);
	}
}
interface Days {
	int SUNDAY = 1, MONDAY = 2, TUESDAY =3,
	WEDNESDAY = 4, THURSDAY = 5, FRIDAY = 6,
	SATURDAY = 7;
}
	
