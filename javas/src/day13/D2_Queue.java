package day13;

import java.util.LinkedList;
import java.util.Queue;

import javax.lang.model.element.Element;

// Queue(큐) : 한쪽 끝에서는 삽입이 다른쪽 끝에서는 삭제가 일어나는 구조 ex) 줄서기
// 선입선출(FIFO) first in first out의 구조
// 앞부분(front:삭제) 뒷부분(rear:삽입)


public class D2_Queue {
	//Queue 사용법 : 큐는 인터페이스이기에 업캐스팅 필요
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		// 1. add(e) : rear위치에 e 삽입
		q.add("apple");
		q.add("banana");
		q.add("cherry");
		q.add("tomato");
		
		System.out.println(q);
		// 2. E element : front에 위치한 데이터 반환
		System.out.println("element:"+q.element());
		
		// 3. remove : front에 위치한 데이터를 반환 후 삭제
		System.out.println("remove:"+q.remove());
		System.out.println(q);
		
		// 4. offer(e) : rear 위치에 데이터 삽입
		q.offer("peach");
		System.out.println(q);
		
		// 5. peek() : front 위치에 있는 데이터의 값 반환
		System.out.println("peek:"+q.peek());
		
		// 6. poll(): front 위치에 있는 데이터를 반환 후 삭제
		System.out.println("poll:"+q.poll());
		System.out.println(q);
		
	}

}
