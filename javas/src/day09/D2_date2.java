package day09;

import java.util.Calendar;

public class D2_date2 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar endOfyear = Calendar.getInstance();
		Calendar christmas = Calendar.getInstance();
		
		endOfyear.set(Calendar.MONTH, 11); // month:12월
		endOfyear.set(Calendar.DATE, 31); // month:12월
		long diff = endOfyear.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("연말까지 남은날 : "+ diff/(24*60*60*1000));
		
		christmas.set(2023, 11, 25); 
		diff=christmas.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("크리스마스까지 남은날 : "+diff/(24*60*60*1000)+"일");
	
		
	}

}
