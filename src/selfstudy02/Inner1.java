package day1009;

public class Inner1 {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println("OuterClasss의 a의 값 : "+oc.a);
		System.out.println("OuterClasss의 b의 값 : "+OuterClass.b);
		
		System.out.println("InnerClass접근하기");
		OuterClass oc2 = new OuterClass();
		OuterClass oc3= new OuterClass();
		OuterClass.Inner i=oc2.new Inner();
		OuterClass.Inner i1 = new OuterClass().new Inner();
		
		System.out.println("Inner의 c의값"+i.c);
		i.innerMethod();
		
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println("StaticInner의 d의 값 : "+si.d);
//		si.staticMethod(); static를 사용시 객체생성보다 다이렉트로 하는것이 좋음
		OuterClass.StaticInner.staticMethod();
	}

}
class OuterClass{
	int a = 3;
	static int b =4;
	
	class Inner{
		int c =5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	static class StaticInner{
		int d = 6;
		static int stat =10;
		public static void staticMethod() {
			System.out.println("<Static Class>");
		}
	}
}