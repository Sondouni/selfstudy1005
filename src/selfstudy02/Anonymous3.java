package day1009;

public class Anonymous3 {
	public static void main(String[] args) {
		Abstract ab = new Abstract() {
			@Override
			void f2() {
				System.out.println("Abstract extend f2()½ÇÇà");
			}
		};
		ab.f2();
	}
}
abstract class Abstract{
	abstract void f2();
}