package day1009;

public class Anonymous2 {
	public static void main(String[] args) {
		Inter1 it = new Inter1() {

			@Override
			public void f1() {
				System.out.println("Inter1 imple f1()");
			}
			
		};
		it.f1();
		Inter1Impl im = new Inter1Impl();
		im.f1();
	}

}
interface Inter1{
	void f1();
}
//일반클래스
class Inter1Impl implements Inter1{

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}
	
}