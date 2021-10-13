package selfstudy05_10_08;

import java.util.HashMap;
import java.util.*;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("���ڹ�", new Integer(90));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(90));
		map.put("���ڹ�", new Integer(80));
		map.put("���ڹ�", new Integer(90));
		//set entrySet() : HashMap�� ����� Ű�� ���� ��Ʈ��(Ű�� ���� ����)�� ���·� Set�� �����ؼ� ��ȯ
		Set set = map.entrySet();
		Iterator it = set.iterator(); //Iterator�� ����; Set���� ����ȯ
		
		while(it.hasNext()) {
			Map.Entry e =(Map.Entry)it.next();
			System.out.println("�̸�: "+e.getKey()+"����: "+e.getValue());
		}
		
		set = map.keySet(); //HashMap�� ����� ���Ű�� ����� Set�� ��ȯ
		System.out.println("������ ��� : "+set);
		
		Collection values = map.values();//Iterator()�� �����ϴ� Map���� ��� Collection���� ����ȯ
		it = values.iterator(); //Iterator�� ���� �Ұ�
		
		int total=0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		System.out.println("���� : "+total);
		System.out.println("��� : "+(float)total/set.size());
		System.out.println("�ְ����� : "+Collections.max(values));
		System.out.println("�������� : "+Collections.max(values));
		
	}

}
