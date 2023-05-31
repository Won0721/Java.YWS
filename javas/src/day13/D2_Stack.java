package day13;
// Stack(스택) : 한 쪽 끝에서 삽입과 삭제가 모두 일어나는 구조
// 후입선출(LIFO)의 구조 Last in First Out
// top: 삽입,삭제
// Vector의 자식클래스

import java.util.Stack;

public class D2_Stack {
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		//1. push():데이터 삽입
		s.push("apple");
		s.push("banana");
		s.push("cherry");
		System.out.println(s);
		
		//2. pop() : top의 데이터 삭제
		System.out.println("pop:"+s.pop());
		System.out.println(s);
		
		//3. peek(): top의 데이터 보기
		System.out.println("peek:"+s.peek());
		//4. serch()
		System.out.println("apple 위치:"+s.search("apple"));
		System.out.println("banana 위치:"+s.search("banana"));
		
	}
	
	


}
