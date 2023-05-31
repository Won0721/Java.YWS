package day03;
//생성자 : 객체 생성 시 호출되어, 변수들을 초기화 하는 메서드
//클래스와 이름이 같음
//리턴타입, 반환값이 없음
//기본 생성자
//구현부				호출부
//		클래스명(){}		new 클래스명();
public class Day1_Constructor2 {
	public static void main(String[] args) {
		CellPhone myphone = new CellPhone();

		
		System.out.println();
		
		System.out.println(myphone.model);
		

		
		
	}
	

}
class CellPhone{
	String model ="Galaxy 8";
	String color ="red";
	int capacity= 60;
	CellPhone(){
		System.out.println("model:"+model);
		System.out.println("color:"+color);
		System.out.println("capacity:"+capacity);
	}
}