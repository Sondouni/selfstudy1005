package day30;

import java.util.Scanner;

public class PolyArgumentTest3 {

	public static void main(String[] args) {
		new Shopping().selectProduct();
	}
}
class Product{
	int money;
	Product(int x){
		money = x;
	}
}
class Tv extends Product{
	Tv(){
		super(200);
		System.out.println("Tv를 구입하셧습니다.");
	}
}
class Computer extends Product{
	Computer(){
		super(300);
		System.out.println("Computer를 구입하셧습니다.");
	}
}
class Air extends Product{
	Air(){
		super(100);
		System.out.println("에어컨을 구입하셧습니다.");
	}
}
class Bed extends Product{
	Bed(){
		super(500);
		System.out.println("Bed를 구입하셧습니다.");
	}
}
class Buyer{
	int myMoney = 1000;
	int totalMoney;
	Buyer(){
	}
	int buy(Product p){
		if(myMoney<p.money) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			System.out.println("구매 취소");
			return -1;
		}
		myMoney-=p.money;
		totalMoney +=p.money;
		return 0;
	}
}
class Shopping{
	Buyer b = new Buyer();
	int putNum=0;
	String[] str = { "Tv","에어컨","콤퓨타","침대"};
	int charge;
	int[] listNum=new int[str.length];
	Scanner sc = new Scanner(System.in);
	void selectProduct() {
		while(true) {
			System.out.println("물건을 선택하세요.>> 1.Tv(200) 2.에어컨(100) 3.컴퓨터(300) 4.침대(500) 5.충전하기 6 나가기");
			putNum =sc.nextInt();
			if(putNum==1) {
				if(b.buy(new Tv())!=-1) {
				listNum[0]++;}
			}else if(putNum==2) {
				if(b.buy(new Air())!=-1) {;
				listNum[1]++;}
			}else if(putNum==3) {
				if(b.buy(new Computer())!=-1) {;
				listNum[2]++;}
			}else if(putNum==4) {
				if(b.buy(new Bed())!=-1) {
				listNum[3]++;}
			}else if(putNum==5) {
				charging();
			}else if(putNum==6) {
				print();
				break;
			}else {
				System.out.println("잘못 입력하셨습니다");
				continue;
			}
		}
	}
	void charging() {
		System.out.printf("충전할 금액을 입력하십쇼 : (현재 금액은 %d입니다) : ",b.myMoney);
		b.myMoney += sc.nextInt();
		System.out.printf("충전완료! (현재 금액은 %d입니다) : \n",b.myMoney);
	}
	void print() {
		System.out.println("---------영수증--------");
		System.out.printf("Tv : %d\n",listNum[0]);
		System.out.printf("에어컨 : %d\n",listNum[1]);
		System.out.printf("컴퓨터 : %d\n",listNum[2]);
		System.out.printf("침대 : %d\n",listNum[3]);
		System.out.printf("총 금액 : %d\n",b.totalMoney);
		System.out.printf("잔액 : %d\n",b.myMoney);
		System.out.printf("보너스 포인트 : %d\n",b.totalMoney/10);
		System.out.println("쇼핑을 마칩니다!");
	}
}