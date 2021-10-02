package day0914;

public class Excpetion_thorw {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의에외");
			throw e;//고의적으로 예뢰를 발생시키겠다
		}
		catch(Exception e) {
			System.out.println("예외발생");
			System.out.println(e.getMessage());
		}
	}

}
