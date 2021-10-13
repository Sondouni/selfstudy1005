package selfstudy05_10_08;
import java.util.*;
public class InteratorEx2 {

	public static void main(String[] args) {
		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i=0;i<10;i++) {
			original.add(i+""); //String 타입으로 만들기위해 +"" 사용
		}
		
		Iterator it = original.iterator();
		while(it.hasNext()) {
			copy1.add(it.next());
		}
		System.out.println("====original 에서 copy1로 복사(copy)=====");
		System.out.println("original:"+original);
		System.out.println("copy1:"+copy1);
		System.out.println();
		
		it = original.iterator();//Iterator는 재사용이 안되므로 다시 얻어와야한다
		while(it.hasNext()) {
			copy2.add(it.next());
			it.remove(); //remove()는 특정요소를 삭제하는것이 아닌,읽어온 요소를 삭제 
		}				  //next()호출없이 remove()를 호출하면 예외발생
		
		System.out.println("=======copy1에서 copy2로 이동=========");
		System.out.println("original:"+original);
		System.out.println("copy1:"+copy1);
		
		
	}

}
