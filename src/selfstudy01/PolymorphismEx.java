package day20210928;
/**
 * 다형성? 
 * 여러개의 개별적인 클래스를 하나의 부모 클래스 객체로 통합관리하여 효율성을 높인것
 * 이 개념의 시작은 반드시 각 클래스의 부모는 같아야 한다
 * 다형성에서 가장 중요한 것은 부모 객체에 자식 클래스의 인스턴스를 대입했을때 어떤 멤버를 사용할수 있고
 * 어떤 데이터에 접근 가능한지를 판별해 내는것
 */
/*
 * class A{...}
 * class B extends A{..}
 * class C extends A{..}
 * B와 C 클래스는 A라는 클래스부터 상속받았다.
 * A ap = new A(); //일반적 클래스 생성방법
 * A ap = new B(); //다형적 표현 업케스팅??????
 * A ap = new C(); //다형적 표현
 * 자신의 클래스 객체가 아니지만 자신의 부모 클래스라면 인스턴스를 부모객체에 담을수 있다.
 */
public class PolymorphismEx {

	public static void main(String[] args) {
		/*
		 * A3 ap = new A3();
		 * B3 bp = new B3();
		 * System.out.println("ap= " +ap);
		 * System.out.println("bp= " +bp);
		 */
		Object[] obj = new Object[2];//모든 클래스는 Object클래스를 상속 
		obj[0] = new A3();
		obj[1] = new B3();
		for(int i =0;i<obj.length;i++) {
			System.out.println("obj["+i+"]="+obj[i]); //obj[i].toString()이 생략
		}
		
	}
}	
class A3 {//extends Object를 생략한것
	public String toString() {//오버라이딩
		return "A3클래스";
	}
}
class B3{
	public String toString() {//오버라이딩
		return "B3클래스";
	}
}
