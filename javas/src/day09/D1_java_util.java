package day09;

import java.util.Calendar;
import java.util.GregorianCalendar;

// util : 사용자의 편리성을 향상하는유용하고 실용적인 소프트웨어를 의미
public class D1_java_util {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("시작시간:"+start);
		int a =0;
		for(int i=1;i<10000000; i++) {
			a++;
		}
		long end =System.currentTimeMillis();
		System.out.println("종료시간:"+end);
		System.out.println("걸린시간:"+(end-start));
		
//		Calendar cal = new Calendar(); // 캘린더는 추상클래스라 객체생성불가
//		방법.		
		Calendar b = Calendar.getInstance();
		Calendar c = new GregorianCalendar();
		System.out.println(b.toString());
		System.out.println(c.toString());
	}
		
}
