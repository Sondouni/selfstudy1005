package selfstudy04;

import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		try{
			System.out.println(readString());
		}catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	public static String readString() throws IOException {
//		try {
		byte[] buf = new byte[100];
		System.out.println("���ڿ��� �Է��Ͻÿ�: ");
		System.in.read(buf);
		return new String(buf);
//		}catch(Exception ioe) {
//			System.out.println("�����߻�");
//			return "Error";
//		}
	}

}
