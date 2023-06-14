package practice;


import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		/*
		 * 한쪽 끝에서는 삽입이 다른 쪽 끝에서는 삭제가 일어나는 구조
		 * 선입선출(FIFO) 의 구조 / first in first out
		 * front : 삭제, rear : 삽입
		 * 
		 * Queue는 인터페이스 이므로 사용하려면 업캐스팅필요
		 * 
		 * 사용하는 방법
		 * 	Queue<Element>q = new LinkedList<Element>(); ==> 주로사용
		 * 	Queue<Element>q = new ArrayList<Elemnet>();
		 */
		
		Queue<String>q = new LinkedList<>();
		//1. add(e) : rear위치에 e 삽입
		q.add("apple");
		q.add("banana");
		q.add("cherry");
		q.add("tomato");
		
		System.out.println(q); //toString 생략가능
		//2. element : front에 위치한 데이터 반환 (최상단 요소)
		System.out.println(q.element());
		
		//3. remove : front에 위치한 데이터 반환 후 삭제
		System.out.println(q.remove());
		System.out.println(q);
		
		//4. offer(e) : rear위치에 데이터 삽입
		q.offer("peach");
		System.out.println(q);
		
		//5. peek() : front에 위치한 데이터의 값만 반환
		System.out.println(q.peek());

		//6. poll() : front에 위치한 데이터를 반환 후 삭제
		System.out.println("poll :" + q.poll());
		System.out.println(q);
		
	}

}
