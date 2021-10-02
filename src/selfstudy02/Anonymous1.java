package day1009;

public class Anonymous1 {

	public static void main(String[] args) {
		AusClass1 o = new AusClass1() {
			void a() {
				System.out.println("새롭게 정의된 익명클래스 메서드입니다");
			}
		};
		o.a();
		AusClass1 ok = new AusClass1();
		ok.a();//익명클래스는 1회성
	}

}
class AusClass1{
	void a() {System.out.println("method a");}
	void b() {}
}