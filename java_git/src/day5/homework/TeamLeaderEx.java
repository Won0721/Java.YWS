package day5.homework;

import java.util.Random;

public class TeamLeaderEx {
	/* 30명의 학생이 있는 반에서 1번부터 연속된 번호를 가진 3명의 학생이 1조가 되도록 나누었다.
	 * 이 때 가장 큰 번호인 학생이 조장이 된다.
	 * 
	 * 학생 번호가 주어졌을 때 조장인지 조원인지 판별하는 코드를 작성하세요.
	 * 
	 * switch문으로) 
	 * input student number :
	 * 1 
	 * student number 1 is a member of the team
	 * 
	 * input student number:
	 * 6
	 * student number 6 is the team leader
	 */
		public static void main(String[] args) {
			
			Random r = new Random();
			int student = (r.nextInt(30)+1);
			
			switch(student % 3) {
			case 0:{
				System.out.println("student number "+ student + " is the team leader");
				break;
			}
			default:{
				System.out.println("student number "+ student + " is a member of the team");
			}	
	
			}
			
			
			
			
		}

}
