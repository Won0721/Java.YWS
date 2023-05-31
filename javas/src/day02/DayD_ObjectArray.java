package day02;
//객체배열 생성방법
//클래스명 객체배열명[] = new 클래스명[크기];
//ex)  Aclass ar[] = new Aclass[3];

public class DayD_ObjectArray {
	public static void main(String[] args) {
// 		클래스명 객체배열명[] = new 클래스명[크기];	
		Aclass ar[] = new Aclass[3];
		ar[0]= new Aclass();			// # 7번 구현 없이 사용하면 (NullPointerException) 오류... => 객체를 생성해줘야만 객체 내 필드 접근 가능
		ar[0].x = 100;
		ar[0].f1();				// NullPointerException 아무런 값이 없음
		System.out.println(ar[0].x);
		
		
	}

}


class Aclass{
	int x;
	void f1() {
		System.out.println("f1()");
	}
}