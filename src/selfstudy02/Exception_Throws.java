package day0914;

public class Exception_Throws {

	public static void main(String[] args) {
		try {
			methodA();
		}
		catch(Exception e) {
			System.out.println("메인에서 처리");
		}
	}
	public static void methodA() throws Exception{
		methodB();
	}
	public static void methodB() throws Exception{
		methodC();
	}
	public static void methodC() throws Exception{
		Exception e = new Exception();
		throw e;//예외발생
	}
	

}
