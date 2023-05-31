package day07;

import java.util.StringTokenizer;

// 라이브러리 : import java.util.StringTokenizer;
// 문자열을 구분문자열을 기준으로 분리할 때 사용한다.
// ex) "이름 : 전화번호" 문자열에서 ":" 문자를 기준으로 이름과 전화번호로 나누고 싶을때
public class Day1_StringTokenizerEx {
// nextToken() : 다음 토큰으로 이동
// hasMoreTokens() : 다음 토큰이 존재하면 true, 아니면 false
// countTokens() : 남은 토큰의 개수
	public static void main(String[] args) {
		// 문자열생성
		String str ="kim:012-1234-4233";
		String delim=":";
		StringTokenizer st = new StringTokenizer(str, delim);
		System.out.println(st.countTokens()); // 2
		System.out.println(st.nextToken());
		System.out.println(st.hasMoreTokens()); // true
		
		System.out.println(st.countTokens()); // 1
		System.out.println(st.hasMoreTokens()); // true
		
		System.out.println(st.nextToken()); 
		System.out.println(st.hasMoreTokens()); //false
		System.out.println(st.countTokens()); // 0
		
	}
}
