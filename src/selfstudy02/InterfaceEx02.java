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
		System.out.println("�õ� �����ϴ�");
	}
	@Override
	public void stop() {
		System.out.println("�õ��� �����ϴ�");
	}
	@Override
	public void setSpeed(int speed) {
		System.out.printf("�ڵ����� �ӵ��� %d���� %d�� �ٲߴϴ�\n",this.speed,speed);
		this.speed = speed;
	}
	@Override
	public void turn(int degree) {
	}
}
class AutoDriveCar extends Car implements OperateCar{
	@Override
	public void start() {
		System.out.println("AI�� �õ��� �մϴ�");
	}
	@Override
	public void stop() {
		System.out.println("AI�� �õ��� ���ϴ�");
	}
	@Override
	public void setSpeed(int speed) {
		System.out.printf("�ڵ����� �ӵ��� %d���� %d�� �ٲߴϴ�\n",this.speed,speed);
		this.speed = speed;
	}
	@Override
	public void turn(int degree) {
	}
}