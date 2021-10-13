package selfstudy05_10_08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//<>�� �Ѵ� ������ �ƹ��ų� �� ������ ����.
		list.add("ī��"); // ArrayList�� ��ü�� �߰�
		list.add("�ҳ�ô�"); 
		list.add("�����ɽ�"); 
		list.add(new String("��ȣ"));
		System.out.println(list);
		
		//contains�� ������ �˻�
		if(list.contains("ī��")) {//true or false����
			System.out.println("�����մϴ�.");
		}
		//�����͸� �ϳ��� �������ϴ�
		for(int i = 0; i<list.size();i++) {
			String str = (String)list.get(i); //list�� i��° ��Ҹ� �����´�
			System.out.println(i + " :"+str);
		}
		//�����͸� ����
		list.remove(2);
		System.out.println("remove �� : "+list);
		//Ư����ġ�� �����͸� �����´�get
		System.out.println("index 2��° ��ġ�� ��ü: "+list.get(2));
		//Ư����ġ�� �����͸� �߰�
		list.add(1,"BTS");
		System.out.println("1��° ��ġ�� BTS�߰���: "+list);
		
		//ArrayList�� ũ�⸦ �о����
		System.out.println("list�� ũ��: "+list.size());
		
		//���� ArrayList�� ��������
		ArrayList alist = new ArrayList();
		alist = (ArrayList)list.clone();
		System.out.println("������ list: "+alist);
		
		//ArrayList�� ������ �������
		list.clear();
		System.out.println("clear()������: "+list);
		
		ArrayList list2 = new ArrayList();
		list2.add(1);
		list2.add(4);
		list2.add(6);
		list2.add(2);
		list2.add(5);
		
		System.out.println("���� ��: "+list2.toString());
		list2.sort(Comparator.naturalOrder()); //list2.sort(null)�� ����
		System.out.println("��������: "+list2.toString());
		list2.sort(Comparator.reverseOrder());
		System.out.println("��������: "+list2.toString());
	}

}
