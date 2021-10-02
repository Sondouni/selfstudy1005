package day0110;

public class InterfaceEx4 {

	public static void main(String[] args) {
		// Aa a = new Aa(); -> 생성불가
		Aa[] ap = new Aa[3];//배열의 타입으로는 사용가능
		ap[0]=new Bb();
		ap[1]=new Cc();
		//ap[2]=new Aa();   -> 생성불가
	}

}
interface Aa{}
class Bb implements Aa{}
class Cc implements Aa{}