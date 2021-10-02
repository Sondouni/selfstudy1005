package day0917;

public class StringEx1 {

	public static void main(String[] args) {
		String str="hello";
		System.out.println(str.concat("world"));
		System.out.println(str);
		System.out.println(str.substring(3));
		System.out.println(str.substring(2, 4));
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println("TEST".toLowerCase());
		
		System.out.println(str.charAt(4));
		System.out.println("hello world".indexOf("world"));
		System.out.println(str.equals("hell"));
		
		System.out.println(" test ".trim());
		System.out.println("hello world".replace('l','2'));
		System.out.println("hello world".replaceAll("hello ", "bye"));
	}

}
