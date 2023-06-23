package day18.practice;

public class StringIndexOfEx {
	public static void main(String[] args) {
		// Hello world 에서 l이 몇개 있는지 확인하는 코드를 작성
		String str = "Hello world";
		int count = 0;
		String serach = "l";
		int index = -1;
		// 반복 : 찾으면 반복, 못찾으면 종료
			// Hello world 에 l의 위치를 찾음 => lo world 에서 l의 위치를 찾음
			// 찾았으면 개수를 증가
		
		// 개수 출력
		
		
		// 방법 1 : indexOf
		do {
			index = str.indexOf(serach, ++index);
			if(index != -1) {
				count++;
			}
		}
		while(index != -1);
		System.out.println(count);
		
		
		// 방법 2 : charAt
		int strCount =0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'l') {
				strCount++;
			}
		}
		System.out.println(strCount);
		
		// 방법 3 : length, replace
		int lCount = str.length() - str.replace("l", "").length();
		System.out.println(lCount);
		
		
	}
}
