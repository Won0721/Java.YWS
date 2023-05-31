package day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

//set : 요소들을 집합적으로 모아놓은 자료 구조 // 
// 중복을 허용하지 않음, 저장 순서를 유지하지 않음
// HashSet
// TreeSet(중복은 없어나 정렬기능이 추가된 형태)
public class D1_TreeSet {
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
		
		Iterator it = hs.iterator();          // 바구니 안에 있는 각각의 요소들을 하나씩 접근하기위해 사용함 
		System.out.println("Hash set 출력");
		while(it.hasNext()) {
			System.out.print(" "+it.next());
		}
		System.out.println();
		
		Iterator it2 = ts.iterator();
		System.out.println("Tree Set 출력");
		while(it2.hasNext()) {
			System.out.print(" "+ it2.next());
		}
		System.out.println();
		System.out.println("현재 TreeSet의 크기:"+ts.size()); // Treeset: 알파벳 순서대로 정리되어 출력됨
	}

}
