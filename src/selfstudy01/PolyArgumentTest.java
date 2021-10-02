package day20210928;

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
		
		
		System.out.println("현재 남은돈은 "+ b.money + "만원 입니다");
		System.out.println("현재 보너스 점수는 "+b.myBonus + "점 입니다.");
	}

}
class Product{
	int price;
	int Bonus = price/10;
	Product(int x){
		this.price = x;
	}
}
//자식클래스에서 생성자를 호출하면 부모클래스의 생성자를 자동적으로 호출하는가????아니다
//자식클래스에서 super() 하면 부모클래스의 생성자를 호출하는것
class Tv extends Product{
	Tv(){
	super(100);
	System.out.println("TV를 구매하셨습니다");
	}
}
class Computer extends Product{
	Computer(){
	super(200);
	System.out.println("Computer를 구매하셨습니다");
	}
}
class Buyer{
	int money = 1000;
	int myBonus = 0;
	void buy(Product p) {
		if(this.money<=0) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			System.out.println("구매 물품 취소");
			return;
		}
		this.money -= p.price;
		this.myBonus += p.price/10;
		
	}
}