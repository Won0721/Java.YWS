package day10;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class D1_time2 {
	public static void main(String[] args) {
		LocalDateTime ld = LocalDateTime.now();
		System.out.println("현재 시간:"+ld);
		LocalDateTime ld2 = ld.minusHours(5).plusMinutes(30).minusSeconds(4);
		System.out.println("변경 시간:"+ld2);
		LocalDateTime ld3 = ld2.minusHours(24);
		System.out.println(ld3);
	}

}
