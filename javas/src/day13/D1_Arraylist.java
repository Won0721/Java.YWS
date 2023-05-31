package day13;

import java.util.ArrayList;
// 컬렉션 프레임워크 : 자바에서 제공하는 자료구조
// Set 인터페이스 : HashSet, TreeSet ( 집합, 중복된 데이터를 갖지 않으며 저장 순서를 유지하지 않는 자료구조)
// List 인터페이스 : ArrayList, LinkedList (데이터를 일렬로 늘어놓은 구조, 중복을 허용하고 저장순서를 유지)

// 리스트 : 데이터를 일렬로 늘어놓은 구조
// 순서가 있음, 중복허용
// 리스트 인터페이스를 구현한 클래스 : ArrayList, LinkedList(요소들이 서로 연결되어있는 리스트)
public class D1_Arraylist {
	public static void main(String[] args) {
		ArrayList<String>list1 = new ArrayList<>(10); // 괄호안은 용량을 의미
		list1.add("A");
		list1.add("C");
		list1.add("E");
		list1.add("D");
		System.out.println("초기 상태:");
		System.out.println(list1.toString());
		
		System.out.println("인덱스 1 위치에 B추가");
		list1.add(1, "B");
		System.out.println(list1);
		
		System.out.println("인덱스 2 위치에 값을 삭제:");
		list1.remove(2);
		System.out.println(list1);
		
		System.out.println("인덱스 2 위치의 값 반환:" + list1.get(2));
	
	}

}
