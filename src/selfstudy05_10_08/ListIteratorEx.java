package selfstudy05_10_08;
import java.util.*;
public class ListIteratorEx {

	public static void main(String[] args) {
/*
 * ListIterator
 * Iterator�� ������ �ܹ��� �̵��� �غ��ϱ����� ����
 * ����� �̵��� ���������� list �������̽��� ������ �÷��ǿ����� ��밡��
 */
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it = list.listIterator();
		
		System.out.println("������=====");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		System.out.println("������=====");
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		System.out.println();
		
	}

}
