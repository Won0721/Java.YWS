package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetEx2 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("demon");
		hs.add("banana");
		hs.add("tomato");
		hs.add("apple");
		hs.add("cargo");
		
		TreeSet ts = new TreeSet();
		ts.add("demon");
		ts.add("banana");
		ts.add("tomato");
		ts.add("apple");
		ts.add("cargo");
		
		Iterator it = hs.iterator();// 각각의 요소를 하나씩 하나씩 접근하기 위해 사용하는 클래스
		System.out.println("<Hash Set 출력>"); // 정렬기능없음
		while(it.hasNext()) { // 다음이 존재 할때 까지
			System.out.print(" "+it.next());
		}
		System.out.println();
		Iterator it2 = ts.iterator();
		System.out.println("<Tree Set 출력>"); // 알파벳 순서로 정렬
		while(it2.hasNext()) {
			System.out.print(" "+ it2.next());
		}
		
		System.out.println();
		
		System.out.println("현재 HashSet의 크기 :" + hs.size());
		System.out.println("현재 TreeSet의 크기 :" + ts.size());
	}

}
