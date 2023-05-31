package day02;

public class Day8_Method {
// 구현부 : 메서드가 어떤 명령들로 구성이 되어있는지 구현하는 부분 : 리턴타입 메서드명(매개변수1,매개변수2){명령1; 명령2;  명령3;  return리턴값;   }
// 호출부 : 메서드에 구현된 명령들이 실행될 수 있도록 호출하는 부분 : 메서드명(값1,값2);
// 메서드의 사용
// 반환타입 메서드명(타입 변수명,타입 변수명){
//			명령1
//			명령2
//			return 값;
//			void > 리턴값이 존재x
//	}
	public static void main(String[] args) {
			open();    //오픈 실행해 라고 명령내림
			f1(100);
		
	}
	
	static void open() {
		System.out.println("문을 열기");
		System.out.println("바닥청소");
		System.out.println("포스기 켜");
		System.out.println("빵을 진열해");
	}
	static void f1(int x) { // 함수 호출 시 100을 전달받아서 전달받은 100을 출력하자
		System.out.println("x:"+x);
	}

}
