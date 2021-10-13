package selfstudy05_10_08;

public class WrappeEx2 {

	public static void main(String[] args) {
		int i = new Integer("100").intValue();
		int i2 = Integer.parseInt("100");
		Integer i3 = Integer.valueOf("100");
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		//문자열이 10진수가 아닌 다른진법으로도 변환가능
		//("숫자",radix(진수)) radix를 생략하면 10진수로 인식
		//static int parseInt(String s, int radix)
		//static Integer valueOf(String s, int radix) ->실제 메소드
		int i4 = Integer.parseInt("100",2);
		int i5 = Integer.parseInt("100",8);
		int i6 = Integer.parseInt("100",16);
//		int i7 = Integer.parseInt("FF",2);
		int i8 = Integer.parseInt("ff",16);
//		int i9 = Integer.parseInt("FF"); -> 문자열에 숫자가 아니라면 예외가 발생, 16진법은 알파벳이 있으니괜찮다
		
		System.out.println("100(2) ->"+i4);
		System.out.println("100(8) ->"+i5);
		System.out.println("100(16) ->"+i6);
		System.out.println("FF(16) ->"+i8);
		
		Integer i9 = Integer.valueOf("100",2);
		Integer i10 = Integer.valueOf("100",8);
		Integer i11 = Integer.valueOf("100",16);
		Integer i12 = Integer.valueOf("FF",16);
//		Integer i13 = Integer.valueOf("ff",2); ->예외
		
		System.out.println("100(2) ->"+i9);
		System.out.println("100(8) ->"+i10);
		System.out.println("100(16) ->"+i11);
		System.out.println("FF(16) ->"+i12);
				
	}

}
