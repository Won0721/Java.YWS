package practice;

import java.util.ArrayList;

public class ListEx2 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); // capacity(용량) 넣을수도 있고 안넣을수도 있음
		
		list1.add("A");
		list1.add("C");
		list1.add("E");
		list1.add("D");
		System.out.println("초기 상태");
		System.out.println(list1.toString());
		System.out.println(list1); // toString 생략가능
		//추가
		System.out.println("인덱스 1위치에 B추가");
		list1.add(1,"B");
		System.out.println(list1);
		
		//삭제
		System.out.println("인덱스 2위치의 값 삭제");
		list1.remove(2);
		System.out.println(list1);
		
		System.out.println("인덱스 2위치의 값 반환 : " + list1.get(2));
		String[] arr= new String[5];
	 
		
		
	}

}
