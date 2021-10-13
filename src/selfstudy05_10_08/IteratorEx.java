package selfstudy05_10_08;

import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		/*
		 * Iterator
		 * �÷��ǿ� ����� �� ��ҿ� �����ϴµ� ���Ǵ� �������̽�
		 * List�� Set�� Collection�������̽��� �ڼ��̹Ƿ� �ٷ� ��밡��
		 * Map�� ���� �ڼ��� �ƴϹǷ� Set�� ���·� ���� �Ŀ� ȣ��
		 * �ܹ������θ� �̵��� ����. �÷����� ������ ��ҿ� �ٴٸ��� ���̻� ���Ұ�
		 * Enumeration�� Interator�� ������//ȣȯ�����ؼ��� ���ܳ���
		 */
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator(); //Iterator�� ���� list��ҿ� ����
		while(it.hasNext()) {		   //�о�� ��Ұ� �����ִ��� Ȯ��, ������ true,������ false 
			Object obj = it.next();	   //������Ҹ� �о�´�. next()ȣ���� hasNext()�� ȣ���ؼ� 		
									   //�о�� ��Ұ��ִ��� Ȯ���ϴ°��� ����
			System.out.println(obj);
		}
	}

}
/*
 * ListŬ�������� ��������� �����ϱ� ������Iterator�� �̿��ؼ� �о�� ��� ���� ��������� ����
 * SetŬ�������� �� ��Ұ��� ������ �������� �ʱ� ������ Iterator�� �̿��ؼ� ����� ��Ҹ� �о�͵�
 * ó���� ����� ������ �����ʴ�.
 */
