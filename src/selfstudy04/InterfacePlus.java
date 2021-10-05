package selfstudy04;

public class InterfacePlus {

	public static void main(String[] args) {
		MyInterface1.print("Java8");
	}

}
/*
 * interface Comparable -> �޼ҵ� ����� ��ũ�⿡���� -1,0,1 ����
 * interface ActionListener -> ��ư�� �̺�Ʈ�� �߻����� �̺�Ʈ�� ó���Ҵ��� �԰��� �������̵��ؼ� ��������  
 * 
*/
interface MyInterface1{
	static void print(String msg) {
		System.out.println(msg + ":�������̽��� �����޼ҵ� ȣ��");
	}
}
