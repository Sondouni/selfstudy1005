package selfstudy05_10_08;

public class IntegerClass {

	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i==i2?"+(i==i2));
		//Wrapper클래스들은 모두 equals()가 오버라이딩 되어있어서 주소값이 아닌 객체가 가지고있는 값을 비교
		System.out.println("i.equals(i2) ?"+i.equals(i2));
		System.out.println("i.compareTo(i2) ?"+i.compareTo(i2));
	
		System.out.println("i.toString()= "+i.toString());
		
		System.out.println("MAX_VALUE = "+Integer.MAX_VALUE);
		System.out.println("MIN_VALUE = "+Integer.MIN_VALUE);
		System.out.println("SIZE = "+Integer.SIZE+"bits");
		System.out.println("BYTES = "+Integer.BYTES+"bits");
		System.out.println("TYPE = "+Integer.TYPE);
	
	
	}
	
	

}
