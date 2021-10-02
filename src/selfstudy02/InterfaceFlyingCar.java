package day0110;

public class InterfaceFlyingCar {

	public static void main(String[] args) {
		FlyingCar fc = new FlyingCar();
		fc.drive();
		fc.fly();
	}

}
interface Drivable{
	void drive();
}
interface Flyable{
	void fly();
}
class FlyingCar implements Drivable,Flyable{
	@Override
	public void fly() {
		System.out.println("I`m Flying");
	}
	@Override
	public void drive() {
		System.out.println("I`m Driving");
		
	}
}