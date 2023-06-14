package practice;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx2 {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		// 1. put(key,value) 데이터 삽입
		hm.put("apple", "사과");
		hm.put("paper", "종이");
		hm.put("flower", "꽃");
		
		String voca;
		System.out.println("알고 싶은 단어를 입력하세요 :");
		voca = sc.nextLine();
		// containsKey : key가 hashmap에 존재하면 true
		if(hm.containsKey(voca)) {
			// 2. get(key) : value 값 반환
			System.out.println("해당하는 뜻은 : "+hm.get(voca)); 
		}
		else {
			System.out.println("해당 단어에 대한 뜻은 데이터베이스에 없습니다.");
		}
		
	}

}
