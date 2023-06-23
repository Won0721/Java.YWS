package day18.string;

public class StringEx1 {
	public static void main(String[] args) {
		/** 문자열 관련 메서드
		 *  
		 */
		
		
		// int indexOf : 기준 문자열을 왼쪽에서 오른쪽으로 검색 /문자/문자열을 처음으로 만나는 위치를 반환
		// int lastIndexOf : 마지막 문자열에서부터 왼쪽으로 검색
		System.out.println("===indexOf===");
		String str = "Hello world";
		// str에서 7번지부터 wo가 있는지 확인. orld 에서 wo가 있는지 확인 => 없음 -1
		
		int index = str.indexOf("wo", 7);
		System.out.println(str + " 에서 7번지부터 wo가 있나요 " + index);
		
		// str에서 0번지부터 wo가 있는지 확인 
		index = str.indexOf("o");
		System.out.println(str + " 에서 0번지부터 o가 있나요 " + index);
		
		// boolean contains 해당 문자열이 포함되어있으면 true 반환
		System.out.println("===contanis===");
		boolean result = str.contains("o");
		System.out.println(str + "에서 0번지부터 확인 시 "+ " \"o\" "+"가 있는지 " + result);
		
		System.out.println("===length===");
		// int length()
		System.out.println(str+ "의 길이는 " + str.length());
		
		// String replace : 특정 문자/문자열을 바꿀 때 사용. 
		// String replaceAll : 정규표현식에 맞는 모든 문자/문자열을 수정
		System.out.println("===replace===");
		String str2 = str.replace(" ", ",");
		System.out.println(str2);
		System.out.println(str2.replace("l","3"));
		
		// split 
		// String[] split
		// 참조변수.메서드명(매개변수) Stirng 문자열이 담긴 참조변수를 매개변수 기준으로 나눠 리턴타입으로 반환
		System.out.println("===split===");
		String sp = "사과,바나나,초코맛 딸기";
		for(String s : sp.split(",")) {
			System.out.println(s);
		}
		String aa = "가나다라마바사";
		for(String s : aa.split("")) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// String subString : 부분 문자열 추출
		System.out.println("===subString===");
		String str3 = "Hello world";
		System.out.println(str3);
		System.out.println(str3.substring(2, 7));
		
		System.out.println("===toLowerCase, toUpperCase===");
		// toLowerCase : 소문자로 바꾸기
		String str4 = "HELLO WORLD";
		System.out.println(str4.toLowerCase()); // HELLO WORLD -> hello world
		String str5 = str4.toLowerCase(); // hello world 
		System.out.println(str5.toUpperCase()); // hello world -> HELLO WORLD
		
		// trim 시작문자(a) 전 공백, 마지막 문자(f) 후 공백을 제거, 문자열 사이에 있는 공백은 불가
		System.out.println("==== String trim() ====");
		String str6 = "\t    ABC \t def\n ";
		String str7 = "             AEWE   		";
		System.out.println(str6);
		System.out.println(str6.trim());
		System.out.println(str7.trim());
	
	}

}
