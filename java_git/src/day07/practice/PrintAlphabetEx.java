package day07.practice;

public class PrintAlphabetEx {
	public static void main(String[] args) {
		// a부터 z까지 출력하는 코드를 작성하세요.
		// 'a' + 정수 => int
		// 'a' + 1을 더하면 'b'
		int ch = 97;
		char chr = 'a';
		System.out.println("97" + chr);
		System.out.println("int형변환 " +(int)chr);
		
		System.out.println('a'+ch);
		System.out.println("char형변환 "+(char)ch);
		
		for(ch =97; ch<130; ch++) {
			System.out.println((char)ch);
			if(ch=='z')
				break;
			}
		
		for(int i=0; i<26; i++) {
			System.out.println((char)('a'+i));
		} 
		}
		
	}

