package day14map;

import java.util.HashMap;
import java.util.Scanner;

// Map : 키를 통해서 값을 참조할 수 있는 구조
// 인터페이스이기 때문에 사용하려면 업 캐스팅이 필요

// HashMap : key와 Value 값으로 데이터를 저장하는 형태
// 해싱(Hashing)이라는 검색 알고리즘 사용
// 해싱 : 메모리낭비를 최소화 하기위해서 저장할값 입력 받을 시, 연산을 통해 새로운 주소 값을 생성하여 메모리에 저장(매핑,mapping)하는 기법

public class D1_Map {
	public static void main(String[] args) {
			HashMap<String,String> hm = new HashMap<String,String>();
			Scanner sc = new Scanner(System.in);
			
			//1. put(key,value)
			hm.put("apple", "사과");
			hm.put("paper", "종이");
			hm.put("flower", "꽃");
			
			String voca;
			System.out.print("알고싶은 단어를 입력하세요:");
			voca = sc.nextLine();
			// 2. containskey(key) : key가 hashmap에 존재하면 true:
			if(hm.containsKey(voca)) {
				// 3. get(key) : value 값 반환
				System.out.println("해당하는 뜻은 : "+hm.get(voca));
			}
			else {
				System.out.println("해당 단어에 대한 뜻은 데이터베이스에 없습니다.");
			}
		sc.close();
		}
	
}


