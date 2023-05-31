package day15;
// 한정된 티켓 수량을 멀티 태스킹으로 티켓팅을 했을 때 발생할 수 있는 문제점..
// 해당 문제점을 해결하기위해 동기화 작업이 필요하다. : synchronized
public class D3_Synchronized {
	public static void main(String[] args) {
		MyThreadB s1 = new MyThreadB();
		Thread t1 = new Thread(s1,"A");
		Thread t2 = new Thread(s1,"B");
		Thread t3 = new Thread(s1,"C");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
class MyThreadB implements Runnable{
	Ticketing ticket = new Ticketing();
	@Override
	public void run() {
		ticket.ticketing();
		
	}
	
}
class Ticketing{
	int ticketNumber =1;
	public void ticketing() {
		synchronized(this) {
			
		if(ticketNumber>0) {
			System.out.println(Thread.currentThread().getName()+"가 티켓팅 성공");
			ticketNumber--;
		}
		else {
			System.out.println(Thread.currentThread().getName()+"가 티켓팅 실패");
		}
		System.out.println(Thread.currentThread().getName()+"가 티켓팅 시도 후 티켓 수:"+ticketNumber);
	}
	}
}
