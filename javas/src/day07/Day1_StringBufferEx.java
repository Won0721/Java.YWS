package day07;

// String 클래스는 immutable(변하지않는)객체이기 때문에, 자주 사용할 수록 인스턴스를 만들기 때문에 느려진다는 단점이있음
// 이런 단점을 보완하기 위한 클래스가 StringBuilder, StringBuffer
// 이 클래스들은 객체 안의 데이터를 내부적으로 변경할 수 있음

// 클래스명 참조변수 = new 클래스명(문자열); // StringBuffer
public class Day1_StringBufferEx {
	public static void main(String[] args) {
		String str = "test";
		StringBuffer buffer = new StringBuffer("test");
		
		str.replace('t', 'T');
		System.out.println(str);
		
		buffer.replace(1, 3, "ES");
		System.out.println(buffer);
				
		
	}

}
