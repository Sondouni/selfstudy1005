package day1009;

public class Anonymous1 {

	public static void main(String[] args) {
		AusClass1 o = new AusClass1() {
			void a() {
				System.out.println("���Ӱ� ���ǵ� �͸�Ŭ���� �޼����Դϴ�");
			}
		};
		o.a();
		AusClass1 ok = new AusClass1();
		ok.a();//�͸�Ŭ������ 1ȸ��
	}

}
class AusClass1{
	void a() {System.out.println("method a");}
	void b() {}
}