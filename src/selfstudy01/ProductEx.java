package day20210928;

public class ProductEx {
	public static void main(String[] args) {
	Product1 p1 = new Tv1();
	Product1 p2 = new Computer1();
	Product1 p3 = new Radio1();
	
	Product1[] p = new Product1[3];//다형성 배열
	p[0]=new Tv1();
	p[1]=new Computer1();
	p[2]=new Radio1();
	}

}
class Product1{}
class Tv1 extends Product1{}
class Computer1 extends Product1{}
class Radio1 extends Product1{}