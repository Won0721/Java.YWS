package day10;

import java.time.LocalDate;
import java.time.LocalTime;

public class D1_time3 {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate new_ld = ld.withYear(1999).withMonth(8).withDayOfYear(23); // 1월 23일
		LocalDate new_ld1 = ld.withYear(1999).withMonth(8).withDayOfMonth(23); // 8월 23일
		System.out.println(new_ld);
		System.out.println(new_ld1);
		
		System.out.println();
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalTime new_time = lt.withHour(3).withMinute(25).withSecond(53);
		System.out.println(new_time);
		//leap
		LocalDate dd =LocalDate.now();
		LocalDate new_dd;
		int count=0;
		for(int i=1900;i<=2100;i++) {
			new_dd=dd.withYear(i);
			if(new_dd.isLeapYear()) {
				System.out.println(new_dd.getYear()+"년은 윤년입니다.");
				count++;
			}
		}
			System.out.println(count+"(윤년)번");
			
		
	}

}
