package day18.string;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String fruits = "apple,orange,banana";
		
		StringTokenizer st = new StringTokenizer(fruits,",");
//		st.nextToken();
//		st.nextToken();
//		st.nextToken(); // 토큰을 String으로 반환하고 다음 토큰으로 넘어감
		System.out.println(st.hasMoreTokens());
		// hasMoreTokens : 다음 토큰이 있는지 없는지 알려줌. 없다는건 끝났다는의미
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken()); // nextToken : 토큰을 가져오
		}
		
	}

}
