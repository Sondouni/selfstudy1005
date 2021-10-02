package day0917;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String str = "Kim:010-1234-5678";
		String delim = ":";
		StringTokenizer st = new StringTokenizer(str,delim);
		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.countTokens());
		System.out.println(st.hasMoreTokens());
		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.countTokens());
		System.out.println(st.hasMoreTokens());

		System.out.println(st.countTokens());
		
	}

}
