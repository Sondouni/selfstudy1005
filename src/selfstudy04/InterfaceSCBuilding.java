package selfstudy04;

public class InterfaceSCBuilding {
}
class Building{}
interface Flyable{
	void liftOff();
	void move();
	void stop();
	void land();
}
class LiftAbleImpl implements Flyable{
	@Override
	public void liftOff() {	}
	@Override
	public void move() {	}
	@Override
	public void stop() {	}
	@Override
	public void land() {	}
}
class Academy extends Building{}
class Barrack extends Building implements Flyable{
	LiftAbleImpl l = new LiftAbleImpl();
	@Override
	public void liftOff() {l.liftOff();}
	@Override
	public void move() {l.move();}
	@Override
	public void stop() {l.stop();}               //�������̽��� �ٷ� �������̵��Ҽ� ������,
	@Override								     //�������̽��� �޼ҵ尡 �ʹ� �������� ������
	public void land() {l.land();}				//�������̽��� ������ ä���ִ� Ŭ������ �ϳ� �����Ͽ�								
}												//Ŭ���� �ȿ��� ��ü������ ���شٸ� �����ߺ��� ���Ҽ� �ִ�.
class Factory extends Building implements Flyable{
	LiftAbleImpl l = new LiftAbleImpl();
	@Override
	public void liftOff() {l.liftOff();}					//Ŭ���� �ȿ��� ��ü������ ���شٸ� �����ߺ��� ���Ҽ� �ִ�. 
	@Override
	public void move() {l.move();}
	@Override
	public void stop() {l.stop();}
	@Override
	public void land() {l.land();}
}
class Bunker extends Building{}