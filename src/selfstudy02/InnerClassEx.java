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
//		InstanceInner ii2 = new InstanceInner(); ����ƽ �޼���� �ν��Ͻ� ����� ���ٺҰ�
	}
	void InstanceMethod() {
		StaticInner st3 = new StaticInner();
		InstanceInner ii3 = new InstanceInner();
		//�ν��Ͻ� �޼��忡���� ����ƽ,�ν��Ͻ� ��� ���ٰ���
	}
}