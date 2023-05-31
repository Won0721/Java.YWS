package day15;
// join : 특정한 스레드가 작업을 먼저 수행할 때 사용
// 실행순서를 지켜야 하는 스레들을 제어한다.
public class D2_join {
	public static void main(String[] args) {
		MyThread8 s1 = new MyThread8();
		MyThread9 s2 = new MyThread9();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		t1.start();
		try {
			t1.join(); // t1을 제외한 나머지 스레드 block
		} catch (InterruptedException ie) {
			System.out.println(ie.toString());
		}
		t2.start();
		try {
			t2.join(); // t2을 제외한 나머지 스레드 block
		} catch (InterruptedException ie) {
			System.out.println(ie.toString());
		}
		for(int i=0;i<10;i++) {
			System.out.println("메인스레드:"+i);
		}
	}

}

class MyThread8 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("t1:"+i);
		}
		System.out.println("<<t1 완료>>");
	}	
}
class MyThread9 implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("t2:"+i);
		}
		System.out.println("<<t2 완료>>");
	}	
}
