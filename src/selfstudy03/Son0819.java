package son0819;

public class Son0819 {

	public static void main(String[] args) {

		int i = 91234567;    //8자리의 10진수
  	    float f = (float)i;  //int를 float로 형변환
  	    int i2 = (int)f;     //float를 int로 형변환
  	    	
  	    double d = (double)i;   //int를 double로 형변화
  	    int i3 = (int)d;        //double을 다시 int로 형변환
    	    
  	    float f2 = 1.123456789f;
  	    double d2 = 1.123456789;
  	    
  	    
		
		
		
		System.out.printf("i=%d\n", f, i2);            //i2가 91234567이 아닌 912345678이 된 이유는 반올림!
		System.out.printf("f=%f i2=%d\n", f, i2);     
		System.out.printf("d=%f i3=%d\n", d, i3);
		System.out.printf("%f%n", f2);                 //float는 소수점 6자리까지 표현할수 있으며 6->7이된 이유는 반올림
		System.out.printf("%.10f%n, f2");              //float는 소수점 6자리까지 유효값이다.
		System.out.printf("%.10f", d2);               //double는 소수점 14자리까지 유효값이다.
	
	}

}
