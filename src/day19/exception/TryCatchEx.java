package day19.exception;

import java.awt.Container;

public class TryCatchEx {
	public static void main(String[] args) {
		/* catch는 최소 1개는 필요 
		 * 어떤 예외가 발생할 지 모를 때에는 부모클래스인 Exception을 이용
		 * */
		int[] arr = {1,2,3,4};
		try {
			// 예외가 발생할 수 있는 코드
			
			System.out.println(1/0); // Arithmetic 발생
			
			
		}
		// 위에 Exception에서 모든 예외가 걸리기 때문에 아래 있는 catch를 실행할 일이 없음
		catch(ArithmeticException e) {
			// 예외발생 시 실행하는 구문
			System.out.println("Arithmetic 예외");
			return;
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Index 예외");
		}catch(Exception e) { 
			// 첫번째 catch로 가서 ArithmeticException 클래스의 객체를 
			//	Exception으로 변환 가능한지 확인하고 가능하면 처리
				System.out.println("exception 예외");
		}
		finally {
			System.out.println("파이널 구문");
		}
		
	}
}
