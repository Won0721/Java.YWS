package day19.format;

import java.text.DecimalFormat;

public class DecimalFromatEx {
	public static void main(String[] args) {
		int price = 10000; // 10,000 으로 출력하고싶을 경우
		// 정수 3자리 마다 ,를 추가 
		// # : 빈자리가 있을 경우 추가하지않음
		DecimalFormat df = new DecimalFormat("###,###");
		String str1 = df.format(price);
		System.out.println(str1);
		
		// 0 : 빈자리가 있을경우 0으로 채움
		df = new DecimalFormat("000,000");
		String str2 = df.format(price);
		System.out.println(str2);
	}

}
