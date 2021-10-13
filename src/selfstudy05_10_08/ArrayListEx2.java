package selfstudy05_10_08;

import java.util.*;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("ī��"); 
		list.add("�ҳ�ô�"); 
		list.add("�����ɽ�"); 
		list.add(new String("��ȣ"));
		
		//subList(int fromIndex, int toIndex) -> from���� to������ ��ü�� ��ȯ
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		print(list,list2);
		//containsAll(Collection c)������ Collection(c)�� ����Ұ� ArrayList�� ���ԵǾ��ִ��� Ȯ��
		boolean b = list.containsAll(list2);
		System.out.println(b);
		System.out.println();
		
		list2.add("B");
		list2.add("C");
		list2.add("A");
		print(list,list2);
		System.out.println();
		
		list2.set(3, "AA");//3���� ���� AA�� ����
		print(list,list2);
		
		System.out.println("retainAll�ϱ��� list1: "+list);
		list.retainAll(list2);//list����list2�� ��ġ�� �κи� ����� ������ ����
		print(list,list2);
		
		//�ڿ������� �����ؾ��� 0���� �������ȴ�.((removeƯ��))
		for(int i=list.size()-1;i>=0;i--) {
			if(list.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list,list2);
	}
	static void print(ArrayList l1, ArrayList l2) {
		
			System.out.println("list : "+ l1);
			System.out.println("list2 : "+ l2);
			System.out.println();
			
		
	}

}
