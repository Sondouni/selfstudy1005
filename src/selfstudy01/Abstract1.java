package selfstudy01;

import java.util.Arrays;

public class Abstract1 {

	public static void main(String[] args) {
		Buyer1 b = new Buyer1();
		
		b.buy(new Tv13());
		b.buy(new Computer12());
		b.buy(new Audio1());
		b.summary();
	}
}
class Product12{
	int price;
	String productName;
	Product12(int x,String str){
		price = x;
		productName = str;
	}
}
class Computer12 extends Product12{
	Computer12(){
		super(200,"Computer");
		System.out.println("��ǻ�͸� �����ϼ̽��ϴ�.");
	}
}
class Tv13 extends Product12{
	Tv13(){
		super(100,"TV");
		System.out.println("Tv�� �����ϼ̽��ϴ�.");
	}
}
class Audio1 extends Product12{
	Audio1(){
		super(50,"Audio");
		System.out.println("������� �����ϼ̽��ϴ�.");
	}
}
class Buyer1{
	int sumMoney;
	String buyName;
	int productNum=0;
	String[] list=new String[3];
	void buy(Product12 p) {
		sumMoney += p.price;
		buyName=p.productName;
		list[productNum] = buyName;
		productNum++;
	}
	void summary() {
		System.out.printf("�����Ͻ� ��ǰ�� �� �ݾ��� %d���� �Դϴ�.\n",sumMoney);
		System.out.print("�����Ͻ� ��ǰ��");
		for(int i =0;i<list.length;i++){
			System.out.print(list[i]+", ");
		}
		System.out.println(Arrays.toString(list));
		System.out.print("�Դϴ�");
	}
}
//���ѹ迭