package day1009;

public class Inner1 {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println("OuterClasss�� a�� �� : "+oc.a);
		System.out.println("OuterClasss�� b�� �� : "+OuterClass.b);
		
		System.out.println("InnerClass�����ϱ�");
		OuterClass oc2 = new OuterClass();
		OuterClass oc3= new OuterClass();
		OuterClass.Inner i=oc2.new Inner();
		OuterClass.Inner i1 = new OuterClass().new Inner();
		
		System.out.println("Inner�� c�ǰ�"+i.c);
		i.innerMethod();
		
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println("StaticInner�� d�� �� : "+si.d);
//		si.staticMethod(); static�� ���� ��ü�������� ���̷�Ʈ�� �ϴ°��� ����
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