package day7.breakEx;

import java.util.Scanner;

public class InputCharEx {
	public static void main(String[] args) {
		//q를 입력하면 반복문 종료하는 예제
		Scanner sc = new Scanner(System.in);
		char ch;
		while(true) {
			System.out.print("Input char : ");
			ch = sc.next().charAt(0);
			
			if(ch =='q') {
				break;
			}
			
		}
		
		for( ; ; ) {
			System.out.print("Input char : ");
			ch = sc.next().charAt(0);
			if(ch=='q') {
				break;
			}
		}
	}

}
