package selfstudy05_10_08;
import java.util.*;
/*
 * HashMap
 * Map�� Ư¡�� Ű (Key)�� ��(Value)�� ��� �ϳ��� ������(entry)�� ����
 * Key�� �ϳ��� ������ ������ Key�� value���� �������
 * �������� �����͸� �˻��ϴµ� ��������
 */

public class HashMapEx {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId","1234");
		map.put("asdf","1111");
		map.put("asdf","1234");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id�� Password�� �Է����ּ���");
			System.out.print("id: ");
			String id = sc.next().trim();
			
			System.out.print("password: ");
			String password = sc.next().trim();
			System.out.println();
			if(!map.containsKey(id)) {
				System.out.println("�Է��� ID�� �������� �ʽ��ϴ� �ٽ� �Է���");
			}else {
				if(!(map.get(id).equals(password))) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ��Է���");
				}else {
					System.out.println("ID�� ��й�ȣ�� ��ġ");
					break;
				}
			}
		}
	}

}
