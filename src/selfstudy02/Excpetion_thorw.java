package day0914;

public class Excpetion_thorw {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("���ǿ���");
			throw e;//���������� ���ڸ� �߻���Ű�ڴ�
		}
		catch(Exception e) {
			System.out.println("���ܹ߻�");
			System.out.println(e.getMessage());
		}
	}

}
