package day5.homework;

import java.util.Random;
import java.util.Scanner;

public class UpdownEx {
	/* 1~100 사이의 랜덤한 정수를 생성하고, 이 정수를 맞추는 게임을 구현하세요
	 * 
	 * 랜덤한 수 : 45
	 * 
	 * input : 50
	 * Down! 
	 * 
	 * input : 40
	 * Up!
	 * 
	 * input : 45
	 * Good! 
	 * 정답 맞추면 프로그램 종료
	 * 
	 */
		public static void main(String[] args) {
			Random r = new Random();
			Scanner sc = new Scanner(System.in);
			int randomNumber = (r.nextInt(100)+1);
			System.out.println(randomNumber);
			while(true) {
			System.out.print("Input Num (1 ~ 100) :");
			int num = sc.nextInt();
				if(num>randomNumber) {
					System.out.println("Down!");
				}
				else if(num<randomNumber) {
					System.out.println("Up!");
				}
				else {
					System.out.println("Good!");
					break;
				}
			
			}
			System.out.println("System exit!");
			
			
			
			
		}
}
