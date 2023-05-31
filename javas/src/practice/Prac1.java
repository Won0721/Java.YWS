package practice;

import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args) {
		
			int a=10;
			int b=25;
			int aa =512;
			int sum=0;
			String c = Integer.toString(a);
			String d = Integer.toString(b);		// 정수형을 문자열로 변환
			
			
			System.out.println(c+d);
			
			int num =  Integer.parseInt(c+d);	// 문자열을 정수형으로 변환
			System.out.println(num);
			
			while(aa>0) {
				sum += aa%10;
				System.out.println("sum :"+sum);
				aa /=10;
				System.out.println("aa:"+aa);
				
				
			}
			
			
		}
	}


