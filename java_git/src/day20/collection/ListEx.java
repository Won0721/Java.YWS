package day20.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		//1 부터 5까지 차례로 추가하는 코드
		
		for(int i=1; i<6; i++) {
			list.add(i); // 정수 i가 박싱으로 Integer 클래스의 객체가 된 후 list에 추가가 됨
			
		}
		// 1을 더 추가
		list.add(1);
		System.out.println(list);

		// 1을 제거 
		// list의 메서드 remove index 번지에 있는 값을 제거 후 제거한 요소 반환
		Integer num = list.remove(1);
		System.out.println(num);
		// 1을 제거
		list.remove((Integer)1); // 첫번째로 만나는 1을 제거후 boolean 반환
		
		System.out.println(list);
		System.out.println(list.size()); // 저장된 객체 수를 출력, 저장 가능한 최대 객체 수가 아님
		
		// 일반
		// 리스트는 특정 번지에 접근할 수 있어서 get() 을 이용하여 반복문 활용가능
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		// 향상된 for문
		for(int tmp : list) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		
		// Iterator
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer tmp = it.next();
			System.out.print(tmp + " ");
		}
		System.out.println();
		
		// 현재 리스트값 3 4 5 1
		System.out.println(list.contains(1)); // list에 1이 있는지 없는지 boolean 리턴 
		System.out.println(list.indexOf(1)); // list에 1이 몇번지에 있으면 인덱스값 반환
		
		
		
	}

}
