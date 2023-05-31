package day07;

public class Day1_StringEx {
	public static void main(String[] args) {
			String str="hello";
			// String 클래스
			// concat(문자열) : 문자열을 연결
			System.out.println(str.concat(" world!"));
			System.out.println(str);
			// substring(시작위치,끝위치) : 시작위치부터 끝 위치 전까지 가져옴
			System.out.println(str.substring(2, 4)); // ll
			System.out.println(str.substring(3)); // lo
			// lenth() : 문자열의 길이 
			System.out.println(str.length());
			// toUppercase, toLowercase
			System.out.println(str.toUpperCase());
			System.out.println("TesT".toLowerCase());
			// charAt(인덱스) : 위치 찾기,indexOf(문자열) : 위치찾기,equals(문자열)
			System.out.println(str.charAt(1));
			System.out.println(str.indexOf("o"));
			System.out.println("hello world".indexOf("world")); // -1 값 리턴 시 찾지못했다는 의미
			System.out.println(str.equals("hello"));
			// trim(), replace , replaceAll
			System.out.println(" test ".trim());
			System.out.println("hello world".replace('l','L'));
			System.out.println("hello world".replaceAll("hello","bye"));

			
	}
}
