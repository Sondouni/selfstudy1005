package selfstudy01;

public class AnimalStaticEx {

	public static void main(String[] args) {
		
		Animal ani = new Cat();
		ani.eat();
		ani.sound();
		
	}
	//static�� ���� �޼ҵ�� �ڽĿ��� ����� �ص� �θ��� ������ �����´� 
	//��???????

}
class Animal{
	public static void eat() {
		System.out.println("Animal�� �����޼ҵ� eat()");
	}
	public void sound() {
		System.out.println("Animal�� �ν��Ͻ� �޼ҵ� sound()");
	}
}
class Cat extends Animal{
	public static void eat() {
		System.out.println("��");
	}
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
}