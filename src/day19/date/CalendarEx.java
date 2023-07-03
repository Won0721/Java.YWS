package day19.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR); // get(1)
		int month = cal.get(Calendar.MONDAY);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int day2 = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		int day3 = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println(year + "-" + month + "-" +day);
		System.out.println(year + "-" + month + "-" +day2);
		System.out.println(year + "-" + month + "-" +day);
		
		//Date 객체를 Calendar 객체로
		Date date = new Date();
		cal = Calendar.getInstance();
		cal.setTime(date);
		
		// Calender 객체를 Date 객체로
		cal = Calendar.getInstance();
		// Date(밀리초) 생성자는 1970년 1월1일 0시를 기준으로 밀리초 만큼 흐른 뒤의 날짜로 초기화
		Date date2 = new Date(cal.getTimeInMillis());
		
		// 1970년 1월 1일 기준으로 1000ms 흐른 날짜 정보 생성
		// 1초 흘렀는데 , 9시간이 추가된 이유는 한국시간대 이기때문에. (한국시간 : UTC+9 )
		date2 = new Date(1000);
		System.out.println(date2);
	
	}

}
