package day2.variable;

public class OverflowEx {
	public static void main(String[] args) {
		// byte -128 ~ + 127
		byte num = 127;
		++num; // num 에 1을 증가
		System.out.println(num); // 오버 플로우 발생
		num = -128;
		--num;
		System.out.println(num); // 언더 플로우 발생
	}

}
