package day02;

public class Day8_Method3 {
	public static void main(String[] args) {
			System.out.println("사각형의 넒이:"+ calculater(10, 20));
	}
	static int calculater(int a, int b) {
		System.out.println("<계산을 시작합니다.>");
		int area = a * b;
		return area;
		
	}
}
