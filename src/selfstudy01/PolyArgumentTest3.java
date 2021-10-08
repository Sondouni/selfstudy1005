package selfstudy01;

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
		System.out.println("Tv�� �����ϼ˽��ϴ�.");
	}
}
class Computer extends Product{
	Computer(){
		super(300);
		System.out.println("Computer�� �����ϼ˽��ϴ�.");
	}
}
class Air extends Product{
	Air(){
		super(100);
		System.out.println("�������� �����ϼ˽��ϴ�.");
	}
}
class Bed extends Product{
	Bed(){
		super(500);
		System.out.println("Bed�� �����ϼ˽��ϴ�.");
	}
}
class Buyer{
	int myMoney = 1000;
	int totalMoney;
	Buyer(){
	}
	int buy(Product p){
		if(myMoney<p.money) {
			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�.");
			System.out.println("���� ���");
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
	String[] str = { "Tv","������","��ǻŸ","ħ��"};
	int charge;
	int[] listNum=new int[str.length];
	Scanner sc = new Scanner(System.in);
	void selectProduct() {
		while(true) {
			System.out.println("������ �����ϼ���.>> 1.Tv(200) 2.������(100) 3.��ǻ��(300) 4.ħ��(500) 5.�����ϱ� 6 ������");
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
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
				continue;
			}
		}
	}
	void charging() {
		System.out.printf("������ �ݾ��� �Է��Ͻʼ� : (���� �ݾ��� %d�Դϴ�) : ",b.myMoney);
		b.myMoney += sc.nextInt();
		System.out.printf("�����Ϸ�! (���� �ݾ��� %d�Դϴ�) : \n",b.myMoney);
	}
	void print() {
		System.out.println("---------������--------");
		System.out.printf("Tv : %d\n",listNum[0]);
		System.out.printf("������ : %d\n",listNum[1]);
		System.out.printf("��ǻ�� : %d\n",listNum[2]);
		System.out.printf("ħ�� : %d\n",listNum[3]);
		System.out.printf("�� �ݾ� : %d\n",b.totalMoney);
		System.out.printf("�ܾ� : %d\n",b.myMoney);
		System.out.printf("���ʽ� ����Ʈ : %d\n",b.totalMoney/10);
		System.out.println("������ ��Ĩ�ϴ�!");
	}
}