package day15;

public class D2_Sleep {
	public static void main(String[] args) {
		SleepThread T = new SleepThread();
		T.start();
		
		
	}
}

class SleepThread extends Thread{
	public void run() {
		System.out.println("카운트다운 5초");
		for(int i=5;i>=0;i--) {
			System.out.println(i);
			if(i!=0) {
				try {
					Thread.sleep(1000); //1000당 1초
				}
				catch(InterruptedException ie){
					System.out.println(ie.toString());
				}
			}
		}
		System.out.println("종료!");
	}
}
