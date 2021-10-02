package son0819;

public class Neuaufgaben {

	public static void main(String[] args) {
		int i=5, j=0;
		// j에 들어온 값은 i++를 하기전 값이 들어간다.

		j = i++; // j = i+1;
		System.out.println("J=i++; 실행후, i=" + i + ", j="+j);
		
		i=5;
		j=0;
		
		j=++i;
		// j에 들어온 값은 i++를 한 값이 들어간다.
		System.out.println("j=++i; 실행후, i=" + i +", j="+j);
			
		//결과를 보면 + 연산의 위치에 따라 결과값이 달라진다 워후
		
		
	}

}
