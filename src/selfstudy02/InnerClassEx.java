package day1009;

public class InnerClassEx {

	public static void main(String[] args) {

	}

}
class OuterClassEX{
	static class StaticInner{}
	class InstanceInner{}
	
	StaticInner st1 = new StaticInner();
	InstanceInner ii1 = new InstanceInner();
	
	static void StaticMethod() {
		StaticInner st2 = new StaticInner();
//		InstanceInner ii2 = new InstanceInner(); 스테틱 메서드는 인스턴스 멤버에 접근불가
	}
	void InstanceMethod() {
		StaticInner st3 = new StaticInner();
		InstanceInner ii3 = new InstanceInner();
		//인스턴스 메서드에서는 스테틱,인스턴스 멤버 접근가능
	}
}