package day5.whileEx;

public class HelloworldEx {
	public static void main(String[] args) {
		//Hello world를 10번 출력하는 코드를 작성하세요
		/* 반복횟수 : 10번, 1번부터 10번까지 1씩 증가
		 * 조건식 : 10까지 = > 10보다 작거나 같을때까지
		 * 증가하는 식 : 1씩 증가
		 * 규칙성 : Hello world를 출력
		 *  => 실행문 	
		 */
		int max =10;
		int i =0;
		while(i<max) { 
			System.out.println("Hello world"+i);
			i++;
			
			}
		System.out.println("============");
	
		
		/* 반복횟수 : i는 10부터 1까지 1씩 감소
		 * 
		 * 
		 */
		int j= 10;
		while(j >=1) { // while(j-- >=1) 로도 사용가능
			System.out.println("Helllo world"+j);
			j--;
		}
		
		}

}
