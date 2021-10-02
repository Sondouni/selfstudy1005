package selfstudy;

public class InstanceOf {

	public static void main(String[] args) {
		A ap = new B();
		B bp = null;
		
		if(ap instanceof B) { //형식 : 인스턴스 instanceof 변환할 클래스
			bp = (B)ap;
			System.out.println("형 변환이 가능합니다");
		}
		else {
			System.out.println("형 변환이 불가능 합니다.");
		}
	}

}
class A{}
class B extends A{}