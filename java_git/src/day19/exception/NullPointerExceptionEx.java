package day19.exception;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
		// NullPointerException
		/* 객체가 Null 인 상태로 메서드, 멤버를 호출하는 경우 발생
		 * 
		 */
	
			
			String str = null;
			
			// 경고처리 
			System.out.println(str.charAt(0));
	
			// 경고처리가 안뜸
			test(str);
			

		
		
		
	}
	// 메서드를 만들 때 매개변수의 null 체크를 반드시 하는게 좋음
	public static void test(String str) {
		if(str == null) {
			return;
		}
		System.out.println(str.substring(0));
	}

}
