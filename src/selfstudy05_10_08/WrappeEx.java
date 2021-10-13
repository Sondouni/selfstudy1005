package selfstudy05_10_08;

public class WrappeEx {

	public static void main(String[] args) {
		byte b = Byte.parseByte("100");
		short s = Short.parseShort("100");
		int i = Integer.parseInt("100");
		long l = Long.parseLong("100");
		float f = Float.parseFloat("3.14");
		double d = Byte.parseByte("3.14");
		
		byte b1 = Byte.valueOf("100");
		short s2 = Short.valueOf("100");
		int i3 = Integer.valueOf("100");
		long l4 = Long.valueOf("100");
		float f5 = Float.valueOf("3.14");
		double d6 = Byte.valueOf("3.14");
	}
}
