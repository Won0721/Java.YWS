package day15;
// 자신의 시간을 양보하는 메서드 yield
public class D2_yield {
	public static void main(String[] args) {
		MyThread6 s1 = new MyThread6();
		MyThread7 s2 = new MyThread7();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		
		t1.start();
		t2.start();
		
		
	}
}
class MyThread6 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<30;i++) {
			System.out.print("★");
			Thread.yield();
		}
		
	}}
class MyThread7 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<30;i++) {
			System.out.print("☆");
			
			}	
	}
}