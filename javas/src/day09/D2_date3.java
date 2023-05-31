package day09;

import java.util.Calendar;
import java.util.Date;

public class D2_date3 {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		
		long a =System.currentTimeMillis();
		Date today2 = new Date(a);
		System.out.println(today2);
				
		//Calender > Date
		//Date > Calender
		// Calender > long
		//long > Calender
	}

}
