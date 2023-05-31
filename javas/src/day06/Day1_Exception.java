package day06;
// throw : 프로그래머가 고의로 예외를 발생 시킬때 사용하는 방법
// throws : 예외가 발생했을 경우 현재 메서드가 예외를 처리하지 않고 자신을 호출 한쪽으로 예외처리에 대한 책임을 넘기는 것
public class Day1_Exception {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의 예외");
			throw e; // 고의적으로 예외를 던지겠다.
		}
		catch(Exception e){
			System.out.println("예외발생");
			System.out.println(e.getMessage());
		}
		
	}
}
