package day0110;

public class InterfaceEx3 {
	public static void main(String[] args) {
		/*
		 * 추상클래스는 부분적으로 완성된 '미완성 설계도'
		 * 인터페이스는 구현된게 없고 밑그림만 그려져있는 '기본 설계도'
		 * 추상메서드와 상수만을 멤버로 가질수있다.
		 * 
		 */
		
		/* 1.8에서 static(정적),defualt메소드를 넣은이유??
		 * -> 꼭 구현하지 않아도 되는 메소드를 넣고싶어서
		 */
		//class extends interface, class implements interface, interface extends interface
		//interface 이름의 뒤에는 able이 붙는게 국룰이지만,,,,,,뭐 알아서 해라
	}

}
interface PlayingCard1{
	//인터페이스에서 상수를 정의할수 있다.(final static만 가능(생략가능))
	public static final int Spade = 4;
	final int DIAMOND = 3;
	static int HEART = 2;
	int CLOVER = 1;
	//모든 메서드는 abstract이어야하고, 생략가능하다
	public abstract String getCardNumber();
	String getCardKind();
	
	static void setCardNumber() {}
	default void setCardKind() {}
	
}
