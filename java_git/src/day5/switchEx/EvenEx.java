package day5.switchEx;

public class EvenEx {
	public static void main(String[] args) {
		// 홀짝 예제를 switch 문으로
		int num=4;
		
		switch(num % 2) {
			case 0:
				System.out.println(num + " is a even number");
				break;
			default:
				System.out.println(num + " is a odd number");
		
		}
	}

}
