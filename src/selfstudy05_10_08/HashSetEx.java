package selfstudy05_10_08;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		/*
		 * hashset
		 * set�������̽��� ������ ���� ��ǥ���� �÷���
		 * set�� Ư¡��� �ߺ��� ��Ҹ� �������� �ʴ´�.
		 * list�� ������ �÷���Ŭ������� �޸� ������ �������� �ʴ´�
		 */
		HashSet hset = new HashSet();
		hset.add(new Integer(100));
		hset.add("100");
		hset.add(200);
		hset.add(300);
		System.out.println(hset);
		
		hset.add(300);
		hset.add(400);
		hset.add(500);
		System.out.println(hset);
		
	}
}
/*
 * ������� ���� �ߺ��� ���� ������� ����
 * add�޼���� �̹� ���� ��ü�� ������ �ߺ����� �����ϰ� �������, �׸��� �۾������� �ǹ̷� false�� ����
 * 100�� 2�� ��µǴ� ���� : �ϳ��� String��, �ϳ��� Integer��
 */
