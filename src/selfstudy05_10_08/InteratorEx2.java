package selfstudy05_10_08;
import java.util.*;
public class InteratorEx2 {

	public static void main(String[] args) {
		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i=0;i<10;i++) {
			original.add(i+""); //String Ÿ������ ��������� +"" ���
		}
		
		Iterator it = original.iterator();
		while(it.hasNext()) {
			copy1.add(it.next());
		}
		System.out.println("====original ���� copy1�� ����(copy)=====");
		System.out.println("original:"+original);
		System.out.println("copy1:"+copy1);
		System.out.println();
		
		it = original.iterator();//Iterator�� ������ �ȵǹǷ� �ٽ� ���;��Ѵ�
		while(it.hasNext()) {
			copy2.add(it.next());
			it.remove(); //remove()�� Ư����Ҹ� �����ϴ°��� �ƴ�,�о�� ��Ҹ� ���� 
		}				  //next()ȣ����� remove()�� ȣ���ϸ� ���ܹ߻�
		
		System.out.println("=======copy1���� copy2�� �̵�=========");
		System.out.println("original:"+original);
		System.out.println("copy1:"+copy1);
		
		
	}

}
