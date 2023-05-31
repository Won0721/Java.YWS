package day03;
// 오브젝트클래스
// 모든 클래스의 조상 클래스
// toString()
// equals()
// ...()
public class Day4_ObjectClass {
	public static void main(String[] args) {
		Cclass a1 = new Cclass();
		Cclass a2 = new Cclass();
		Cclass c1 = a1;
		
		System.out.println(a1.equals(c1));
		
		// toString(): 객체 정보를 문자열로 출력
		System.out.println(a1.toString());
		System.out.println(a1);
		
		//equals(): 두 객체가 동일한가 비교해주는 기능
		System.out.println("a1하고 a2: "+a1.equals(a2));
		System.out.println("a1하고 c1: "+a1.equals(c1));
		
		//getClass(): 객체의 클래스정보를 가져옴
		System.out.println(a1.getClass());
	}

}

class Cclass{
	
	
}