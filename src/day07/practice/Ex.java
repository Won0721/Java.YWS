package day07.practice;

public class Ex {
	public static void main(String[] args) {
		// 다음과 같이 출력되는 코드를 작성하세요
		/*
		 * a
		 * ab
		 * abc
		 * abcd
		 * ..
		 * abcdef..xyz
		 */
		
		for(int i=0; i<26; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)('a'+j));
			}
			System.out.println();
		}
	}

}
