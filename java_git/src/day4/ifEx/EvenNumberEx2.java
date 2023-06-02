package day4.ifEx;

public class EvenNumberEx2 {
	public static void main(String[] args) {
		//홀짝 판별 예제를 조건 연산자를 이용하여 작성
		// a =(조건식1) ? 참 : 거짓;
		int num=4;
		String result;
		result = (num % 2==0) ? "Odd" : "Even";
	
		System.out.println(num + " is a"+ result + " number");
		
	}

}
