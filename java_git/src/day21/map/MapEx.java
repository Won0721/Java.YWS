package day21.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		/* Map을 배열처럼 사용하는 예제 정수배열 */
		HashMap<Integer, Integer> map = new HashMap<>(); 
		// 배열 0번지에 1, 1번지에 2, .... 4번지에 5를 저장
		for(int i=0; i<5; i++) {
			map.put(i, i+1);
		}
		
		for(int i=0; i<map.size(); i++) {
			System.out.println(map.get(i));
		}
		
		System.out.println();

		/* 아이디, 비밀번호를 관리하는 예제 */
		HashMap<String, String> account = new HashMap<>();
		account.put("abc123", "234234423");
		account.put("qwedas2", "1xzcasdw");
		account.put("abc123", "bxccvx55"); // key값이 중복된 정보 추가
		account.put("zxc", "bxccvx55");
		System.out.println(account);
		System.out.println();
		
		/* Keyset을 이용한 반복문 .Key값들을 Set으로 만들어서 반복*/
		Set<String> keySet = account.keySet();
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext()) {
			String id = it.next(); // Key값을 가져옴
			String pw = account.get(id); // Key값을 이용해서 Value를 반환 
			System.out.println("id :" + id + ", pw :" + pw);
		}
		
		// 멤버로 Key와 value를 가지는 Entry를 이용하여 
		// map에 있는 Key,value값을 Entry 객체 하나에 넣어 Set으로 만듬
		// Entry : map 인터페이스 안에 구현된 Entry 인터페이스
		
		Set<Entry<String, String>> entrySet = account.entrySet();
		
		Iterator<Entry<String, String>> it2 = entrySet.iterator();
		
		while(it2.hasNext()) {
			Entry<String, String> tmp = it2.next();
			String id = tmp.getKey();
			String pw = tmp.getValue();
			System.out.println("id : "+ id + " pw : " + pw);
		}
	}

}
