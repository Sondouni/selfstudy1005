package day0110;


public class InterfaceEx02 {

	public static void main(String[] args) {
		NomalCar nc = new NomalCar();
		AutoDriveCar adc = new AutoDriveCar();
		
		OperateCar oc = new AutoDriveCar();
		oc.start();
		nc.start();
		nc.stop();
		nc.setSpeed(100);
		nc.turn(30);
		adc.start();
		adc.stop();
		adc.setSpeed(100);
		adc.turn(30);
	}
}	
class Car{
	int speed;
	int degree;
	
}
interface OperateCar{
	void start();
	void stop();
	void setSpeed(int speed);
	void turn(int degree);
}
class NomalCar extends Car implements OperateCar{
	@Override
	public void start() {
		System.out.println("시동 켜집니다");
	}
	@Override
	public void stop() {
		System.out.println("시동이 꺼집니다");
	}
	@Override
	public void setSpeed(int speed) {
		System.out.printf("자동차의 속도를 %d에서 %d로 바꿉니다\n",this.speed,speed);
		this.speed = speed;
	}
	@Override
	public void turn(int degree) {
	}
}
class AutoDriveCar extends Car implements OperateCar{
	@Override
	public void start() {
		System.out.println("AI가 시동을 켭니다");
	}
	@Override
	public void stop() {
		System.out.println("AI가 시동을 끕니다");
	}
	@Override
	public void setSpeed(int speed) {
		System.out.printf("자동차의 속도를 %d에서 %d로 바꿉니다\n",this.speed,speed);
		this.speed = speed;
	}
	@Override
	public void turn(int degree) {
	}
}