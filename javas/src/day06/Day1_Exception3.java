package day06;

public class Day1_Exception3 {
	public static void main(String[] args) {
		int age=-19;
		try {
			ticketing(age);
		}
		catch(AgeException e) {
			e.printStackTrace(); // 갖고있는 오류를 출력하겠다.
		}
		
		
	}
	
	public static void ticketing(int age) throws AgeException{
		if(age<0) {
			throw new AgeException("나이 입력이 잘못되었습니다.");
		}
	}
		

}

class AgeException extends Exception{
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}
		
	}
