package day05;


public class Day1_InnerExam {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println("OuterClass의 a의 값"+oc.a);
		System.out.println("OuterClass의 b의 값"+OuterClass.b); // 스태틱은 객체를 생성하지 않아도 가능
	
		System.out.println("======Inner 클래스 접근하기======");
		OuterClass oc2 =new OuterClass();
		OuterClass.Inner i=oc2.new Inner();
		
		System.out.println("Inner의 c의 값:"+i.c);
		i.innerMethod();

		
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println("StaticInner의 d의 값:"+si.d);
		
//		si.staticMethod();	
//		si.staticMethod(); -> 객체를 사용하지 않고 클래스명을 사용해서 호출가능
		OuterClass.StaticInner.staticMethod();
	}

}

class OuterClass{
	int a=3;
	static int b =4;
	class Inner{
		int c=5;
		public void innerMethod() {
			System.out.println("Inner Method");
		}
	}
	static class StaticInner{
		int d =6;
		static int stat=10;
		public static void staticMethod() {
			System.out.println("StaticInner Method");
		}
		
	}
}

// 내부클래스의 객체 생성하는방법
// 외부클래스.내부클래스명 객체명 = new 외부클래스생성자().내부클래스생성자();
//						 = 외부클래스객체.내부클래스생성자();