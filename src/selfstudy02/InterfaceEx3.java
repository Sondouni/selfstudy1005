package day0110;

public class InterfaceEx3 {
	public static void main(String[] args) {
		/*
		 * �߻�Ŭ������ �κ������� �ϼ��� '�̿ϼ� ���赵'
		 * �������̽��� �����Ȱ� ���� �ر׸��� �׷����ִ� '�⺻ ���赵'
		 * �߻�޼���� ������� ����� �������ִ�.
		 * 
		 */
		
		/* 1.8���� static(����),defualt�޼ҵ带 ��������??
		 * -> �� �������� �ʾƵ� �Ǵ� �޼ҵ带 �ְ�;
		 */
		//class extends interface, class implements interface, interface extends interface
		//interface �̸��� �ڿ��� able�� �ٴ°� ����������,,,,,,�� �˾Ƽ� �ض�
	}

}
interface PlayingCard1{
	//�������̽����� ����� �����Ҽ� �ִ�.(final static�� ����(��������))
	public static final int Spade = 4;
	final int DIAMOND = 3;
	static int HEART = 2;
	int CLOVER = 1;
	//��� �޼���� abstract�̾���ϰ�, ���������ϴ�
	public abstract String getCardNumber();
	String getCardKind();
	
	static void setCardNumber() {}
	default void setCardKind() {}
	
}
