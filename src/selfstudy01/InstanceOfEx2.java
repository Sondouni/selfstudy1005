package day20210928;

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
			FireEngine7 fe = (FireEngine7) c; //부모 -> 자손으로 형변환이니 명시적 타입을 적어주어야함(다운캐스팅)
			fe.water();
		}else if(c instanceof Ambulance7) {
			Ambulance7 a = (Ambulance7) c;
			a.siren();
		}else {
			System.out.println("형변환 안됨");
		}
	}
}
class Car7{
	
}
class FireEngine7 extends Car7{
	void water(){
		System.out.println("물뿌리기");
	}
}
class Ambulance7 extends Car7{
	void siren() {
		System.out.println("위잉위잉");
	}
}