package day12;
// 컬렉션 프레임워크 (Collection Framework)
// 데이터를 효율적으로 다루기 위한 클래스들의 집합
// 제네릭(Generic) : 클래스가 다룰 객체를 미리 명시하는 기법 / 제네릭 == 일반화

//<T> : Type , <E> : Element
//<K> : Key	 , <V> : Value  ,  <N> : Number
public class D1_CollectionFrameWork_Generic {
	public static void main(String[] args) {
		Value v = new Value();
		v.typeSerch(3);
		v.typeSerch(3.14f);
		v.typeSerch(3.14);
		v.typeSerch('a');
		v.typeSerch("hello");
		v.typeSerch(true);
		
		
	}

}
class Value{
	public <T> void typeSerch(T x) {
		if(x instanceof Integer) {
			System.out.println(x+"는 정수 입니다.");
		}
		else if(x instanceof Double || x instanceof Float) {
			System.out.println(x+"는 실수 입니다.");
		}
		else if(x instanceof Character) {
			System.out.println(x+"는 문자형 입니다.");
		}
		else if(x instanceof String) {
			System.out.println(x+"는 문자열 입니다.");
		}
		else if(x instanceof Boolean) {
			System.out.println(x+"는 논리형 입니다.");
		}
	}
}
