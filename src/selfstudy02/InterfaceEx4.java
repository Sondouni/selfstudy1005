package day0110;

public class InterfaceEx4 {

	public static void main(String[] args) {
		// Aa a = new Aa(); -> �����Ұ�
		Aa[] ap = new Aa[3];//�迭�� Ÿ�����δ� ��밡��
		ap[0]=new Bb();
		ap[1]=new Cc();
		//ap[2]=new Aa();   -> �����Ұ�
	}

}
interface Aa{}
class Bb implements Aa{}
class Cc implements Aa{}