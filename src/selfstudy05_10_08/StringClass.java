package selfstudy05_10_08;

public class StringClass {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc"; // str1,str2�� �Ѵ� "abc"��ü�� ����Ű������ (��������)
		
		if(str1 == str2) {
			System.out.println(" str1 == str2? true");
		}else {
			System.out.println(" str1 == str2? false");
		}
		if(str1.equals(str2)) {
			System.out.println(" str1.equals(str2)? true");
		}else {
			System.out.println(" str1.equals(str2)? false");
		}
		System.out.println();
		String str3 = new String("abc"); // ���� ���� ��������, �ٸ� �޸𸮿� ����ȴ�
		String str4 = new String("abc");
		if(str3 == str4) {
			System.out.println(" str3 == str4? true");
		}else {
			System.out.println(" str3 == str4? false");
		}
		if(str3.equals(str4)) {
			System.out.println(" str3.equals(str4)? true");
		}else {
			System.out.println(" str3.equals(str4)? false");
		}
	}
}
//equals�޼���� ��� true�� �����ߴ� �׷��� ���ڿ� �񱳽� equals�޼��带 ����
