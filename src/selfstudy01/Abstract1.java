package selfstudy;

import java.util.Arrays;

public class Abstract1 {

	public static void main(String[] args) {
		Buyer1 b = new Buyer1();
		
		b.buy(new Tv1());
		b.buy(new Computer1());
		b.buy(new Audio1());
		b.summary();
	}
}
class Product1{
	int price;
	String productName;
	Product1(int x,String str){
		price = x;
		productName = str;
	}
}
class Computer1 extends Product1{
	Computer1(){
		super(200,"Computer");
		System.out.println("��ǻ�͸� �����ϼ̽��ϴ�.");
	}
}
class Tv1 extends Product1{
	Tv1(){
		super(100,"TV");
		System.out.println("Tv�� �����ϼ̽��ϴ�.");
	}
}
class Audio1 extends Product1{
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
	void buy(Product1 p) {
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