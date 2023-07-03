package day18.practice;

import java.util.Scanner;

public class StringCharAtEx {
	// 영문 소문자로 된 문자열을 입력받아 알파벳이 각각 몇개 있는지 확인하는 코드를 작성
	public static void main(String[] args) {
		System.out.println("영문 입력하세요 : ");
		String source = "Hello world";
		Scanner sc = new Scanner(source);
		int[] count = new int[26]; // a~~~z 개수 카운트
		int[] Count = new int[26]; // A~~~Z 개수 카운트
		// 'A' = (char) 65  // char ch = (char) 97  ch가 'a'로 출력됨 int ch1 = 'a'  >> 정수값 97로 반환
		for(int i=0; i<source.length(); i++) {
			char ch = source.charAt(i);
			if(ch >= 'A' && ch <='Z') {
				Count[ch-'A']++;
			}
			else if(ch >= 'a' && ch <= 'z') {
				count[ch-'a']++;
			}		
		}
	
		for(int i=0; i<26; i++) { // 'A' = (char) 65
			if(Count[i] !=0) {
				System.out.println((char)(65+i) + " : " + Count[i]);
			}
			
			if(count[i] != 0 ) { 
				System.out.println((char)(97+i) + ": " + count[i] );
			}
		}
		
		///////////////////
		int[] alphabet = new int[26]; // 각 알파벳 개수를 저장하는 배열 0번지 : a의 개수,  1번지 : b의 개수
		// 입력
		System.out.println("영문 입력");
		String str = sc.nextLine();
		
		// 반복 : 문자열 길이 만큼
			// 문자열의 한글자씩 가져와서 알파벳을 확인하여 알파벳 개수를 증가
		for(int i=0; i<str.length(); i++) {
			char ch1 = str.charAt(i);
			// ch1가 알파벳 소문자인 경우 distance의 값이 0 ~ 25 사이의 값이 나옴
			int distance = ch1 - 'a';
			// 영문소문자가 아닌경우 건너뜀 continue
			if(distance < 0 || distance > 25) {
				continue;
			}
			// 맞는 경우
			alphabet[distance]++;
		}
		// 알파벳 개수 추가 
		
		for(int i =0; i<alphabet.length; i++) {
			if(alphabet[i] ==0)
				continue;
			System.out.println((char)('a'+i) + " : " + alphabet[i]);
		}
		
		
		
		
		
		
		
	}
}
