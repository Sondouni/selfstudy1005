package day0110;

public class InterfaceEx01 {

	public static void main(String[] args) {
		Television tv = new Television();
		tv.turnOn();
		tv.turnOff();
	
	}
}
interface ReomoteControl{
	public void turnOn();
	public void turnOff();
}
class Television implements ReomoteControl{

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}
	
}