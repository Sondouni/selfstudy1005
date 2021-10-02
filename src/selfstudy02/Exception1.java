package day0914;

public class Exception1 {

	public static void main(String[] args) {
		try {
			int []a= {2,0,0};
			int b=4;
			int c=b/a[2];//배열의 인덱스가 [0],[1]밖에없음
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("산술오류 발생");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열길이 오류발생");
		}
		System.out.println("예외처리 공부 중");
	}

}
