package practice;

public class GenericEx2 {
	public static void main(String[] args) {
		Value v = new Value();
		
		v.typeSearch(3);
		v.typeSearch(3.14);
		v.typeSearch('a');
		v.typeSearch(true);
	}
}

	class Value{
		public <T> void typeSearch(T x) {
			if(x instanceof Integer) {
				System.out.println(x + " 정수");
			}
			else if(x instanceof Double || x instanceof Float) {
				System.out.println(x+" 실수");
			}
			else if(x instanceof Character) {
				System.out.println(x + " 문자형");
			}
			else if(x instanceof String) {
				System.out.println(x+" 문자형");
			}
			else if(x instanceof Boolean) {
				System.out.println(x + " 논리형");
			}
		} 
	}
	

