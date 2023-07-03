package day12.practice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.*;

public class VocaEx {
	public static void main(String[] args) {
		HashMap<String, String> voca = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		String eng = "";
		String kor = "";
		int ans = 0;
		char ch =' ';
		System.out.println("단어장 프로그램입니다.");
		System.out.println("1. 영단어 저장");
		System.out.println("2. 모든 저장된 단어들 출력");
		System.out.println("3. 저장된 영단어 검색");
		while(true) {
			ans = sc.nextInt();
			if(ans == 1) {
				System.out.print("저장하실 영어단어 : ");
				eng = sc.next();
				System.out.print("저장하실 영어단어의 뜻 : ");
				kor = sc.next();
				
				voca.put(eng, kor);
			}
			if(ans == 2) {
				for(Entry<String, String> entrySet : voca.entrySet()) {
					System.out.println("영어 단어 : " + entrySet.getKey()+ " : " + entrySet.getValue());;
				}
				
			}
			if(ans == 3) {
				System.out.println("찾고 싶은 단어는?");
				String engfind = sc.next();
				
				if(voca.containsKey(engfind)) {
					System.out.println(voca.get(engfind));
					
				}
				if(!voca.containsKey(engfind)) {
					System.out.println(engfind + " 는 없는 단어");
				}
			}	
			System.out.println("프로그램을 계속 진행하시겠습니까?");
			ch = sc.next().charAt(0);
			
			if(ch == 'n') {
			System.out.println("프로그램 종료");
				return;
			}
			System.out.println("1. 영단어 저장");
			System.out.println("2. 모든 저장된 단어들 출력");
			System.out.println("3. 저장된 영단어 검색");
			
			
		
	
		
		}
	}
}
