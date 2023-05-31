package day08;
//Wrapper 클래스 사용목적 : 기본 자료형들을 객체로 다루는데 사용 
// 자료형 : boolean, char, byte, short, int, long, double, float
// 클래스 : Boolean, Character, Byte, Short, Integer, Long, Double, Float

//<생성방법> Wrapper클래스명 객체명 = new Wrapper클래스명(값);
//		  Wrapper클래스명 객체명 = 일반자료형데이터; 으로도 사용가능
// ex Intger i = new Integer(3); 
//	  Double d = new Double(3.14);	
public class Day1_Wraaper {
	public static void main(String[] args) {
		int i = 30;
		Integer ii= new Integer(i);
		System.out.println(ii);
		
		double d=3.14;
		Double dd = new Double(d); // 일반 기본자료형을 객체로 사용하기위해 래퍼사용
		System.out.println(dd);
	}

}
