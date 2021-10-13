package selfstudy05_10_08;
import java.util.*;
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		for(int i=1;i<=43;i++) {
			arr.add(i);
		}
		System.out.println("로또 번호 생성기");
		for(int i = 0;i<7;i++) {
			int x = (int)(Math.random()*arr.size());
			System.out.printf("%d, ",arr.remove(x));
		}
	}
}
