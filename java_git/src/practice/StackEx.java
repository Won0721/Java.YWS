package practice;

import java.util.Stack;

public class StackEx {
	/* 한 쪽 끝에서 삽입과 삭제가 모두 일어나는 구조
	 * 후입선출(LIFO)의 구조
	 * top:삽입,삭제
	 * Vector의 자식클래스
	 * 
	 */
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		
		// 1. push()데이터 삽입
		s.push("apple");
		s.push("banana");
		s.push("cherry");
		System.out.println(s);
		
		// 2. pop() : 데이터 삭제
		System.out.println("pop()"+s.pop());	
		
		// 3. peek() : top 데이터 보기
		System.out.println("peek()"+s.peek());
		
		// 4. serch()
		System.out.println(s.search("apple"));
		System.out.println(s.search("banana"));
	}

}
