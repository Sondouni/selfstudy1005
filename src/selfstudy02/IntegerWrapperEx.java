package day0917;

public class IntegerWrapperEx {

	public static void main(String[] args) {
		Integer ii = 30;//auto Boxing
		System.out.println(ii.intValue());//integer��ü�� int�� �ٲ�
		System.out.println(ii.doubleValue());//integer��ü�� double�� �ٲ�
		System.out.println(ii.floatValue());//integer��ü�� float�� �ٲ�
		System.out.println(ii.toString()+3);//integer��ü�� String���� �ٲٰ� 3�� ����
		System.out.println(ii);
	}

}
