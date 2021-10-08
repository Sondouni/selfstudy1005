package selfstudy01;

public class InstanceOfEx2 {

	public static void main(String[] args) {
		Car7 fe = new FireEngine7();
		Car7 am = new Ambulance7();
		Car7 c7 = new Car7();
		
		Work w = new Work();
		w.doWork(fe);
		w.doWork(am);
		w.doWork(c7);
	}

}
class Work{
	void doWork(Car7 c) {
		if(c instanceof FireEngine7) {
			FireEngine7 fe = (FireEngine7) c; //�θ� -> �ڼ����� ����ȯ�̴� ����� Ÿ���� �����־����(�ٿ�ĳ����)
			fe.water();
		}else if(c instanceof Ambulance7) {
			Ambulance7 a = (Ambulance7) c;
			a.siren();
		}else {
			System.out.println("����ȯ �ȵ�");
		}
	}
}
class Car7{
	
}
class FireEngine7 extends Car7{
	void water(){
		System.out.println("���Ѹ���");
	}
}
class Ambulance7 extends Car7{
	void siren() {
		System.out.println("��������");
	}
}