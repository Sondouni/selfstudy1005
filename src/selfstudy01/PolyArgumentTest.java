package selfstudy01;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		b.buy(tv);
		b.buy(new Computer());
		b.buy(tv);
		b.buy(new Computer());
		b.buy(tv);
		b.buy(new Computer());
		b.buy(tv);
		
		
		System.out.println("���� �������� "+ b.money + "���� �Դϴ�");
		System.out.println("���� ���ʽ� ������ "+b.myBonus + "�� �Դϴ�.");
	}

}
class Product{
	int price;
	int Bonus = price/10;
	Product(int x){
		this.price = x;
	}
}
//�ڽ�Ŭ�������� �����ڸ� ȣ���ϸ� �θ�Ŭ������ �����ڸ� �ڵ������� ȣ���ϴ°�????�ƴϴ�
//�ڽ�Ŭ�������� super() �ϸ� �θ�Ŭ������ �����ڸ� ȣ���ϴ°�
class Tv extends Product{
	Tv(){
	super(100);
	System.out.println("TV�� �����ϼ̽��ϴ�");
	}
}
class Computer extends Product{
	Computer(){
	super(200);
	System.out.println("Computer�� �����ϼ̽��ϴ�");
	}
}
class Buyer{
	int money = 1000;
	int myBonus = 0;
	void buy(Product p) {
		if(this.money<=0) {
			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�.");
			System.out.println("���� ��ǰ ���");
			return;
		}
		this.money -= p.price;
		this.myBonus += p.price/10;
		
	}
}