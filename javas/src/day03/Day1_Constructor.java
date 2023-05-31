package day03;
// 생성자 : 객체 생성 시 호출되어, 변수들을 초기화 하는 메서드
// 클래스와 이름이 같음
// 리턴타입, 반환값이 없음
// public : 접근 제한이 없음 , protected : 동일한 패키지 내에 존재하거나 파생클래스에서만 접근 가능
// default : 아무런 접근제한자를 명시하지 않으면 default 값이 되며, 동일한 패키지 내에서만 접근이 가능
// private : 자기 자신의 클래스 내에서만 접근이 가능
// 기본 생성자
// 구현부				호출부
//		클래스명(){}		클래스명();

//		Aclass(){x=100;}		new Aclass();
public class Day1_Constructor {
	public static void main(String[] args) {
		Aclass a = new Aclass();
	
	}

}

class Aclass{
	//기본생성자(default 생성자)
	public Aclass(){
		System.out.println("Aclass 기본생성자() 호출됐다");
	}  
	
}
