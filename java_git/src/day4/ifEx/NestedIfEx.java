package day4.ifEx;

public class NestedIfEx {
	public static void main(String[] args) {
		/* 2,3,6 의 배수 판별 예제
		 * day4.practive > IfmultipleEx2 문제
		 * 2중 if문
		 */
		
		
		// 6의 배수가 아닌 2의배수만 찾기 위해 2의배수이지만 3의 배수가 아닌 정수를 확인
		/*if(num % 2 ==0 && 3 !=0) {
			System.out.println("A multiple of 2");
		}
		else if(num % 3 ==0 && 2 !=0) {
			System.out.println("A multiple of 3");	
		}
		else if(num % 6 ==0) {
			System.out.println("A multiple of 6");	
		}
		else {
			System.out.println("Not multiple of 2,3,6");
		}*/
		int num =6;
		// 2의 배수
		if(num % 2 == 0) {
			// 2의배수이면서 3의배수 = 6의 배수
			//	아닌 수 = 2의배수
			if(num % 3 ==0) {
				System.out.println("A multiple 6");
			}
			else {
				System.out.println("A multiple 2");
				
			}
		}
		// 3의배수
		else if (num % 3 ==0) {
			System.out.println("A multiple 3");
		}
		// 아닌 수
		else {System.out.println(" Not a multiple 2,3,6");
			
		}
	}
		
}
