package day13;

import java.util.*;

public class D1_LinkedList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		LinkedList ll = new LinkedList<>();
		long start = System.currentTimeMillis();
		
		for(int i =0; i<100000; i++) {
			al.add(0,String.valueOf(i));	
		}
		long end= System.currentTimeMillis();
		System.out.println("Arraylist 작업시간:"+(end-start));
		
		start = System.currentTimeMillis(); // 다시한번 초기화
		for(int i=0; i<10000; i++) {
			ll.add(0, String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("linkedlist 작업시간 :"+(end-start));
	}

}
