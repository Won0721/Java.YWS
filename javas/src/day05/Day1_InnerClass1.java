package day05;
// 내부 클래스
// 구조
// class OuterClass{
//		class InnerClass{
//		}
// }
// 내부 클래스 종류 : 인스턴스 클래스, 스태틱클래스.지역클래스.익명클래스
// 인스턴트 클래스 : 외부 클래스에서 멤버 변수 위치에 선언
public class Day1_InnerClass1 {
	public static void main(String[] args) {
		
	}

}
class A{
	static class StaticInner{}
	class InstanceInner{}
	
	StaticInner st1 =new StaticInner();
	InstanceInner ii1 = new InstanceInner();
	
	static void StaticMethod() {
		StaticInner st2 = new StaticInner();
//		InstanceInner ii2 = new InstanceInner(); -> 스태틱 메서드는 인스턴스 멤버에 접근 불가능하다
	}
	void InstanceMethod() {
		StaticInner st3 = new StaticInner();
		InstanceInner ii3 = new InstanceInner();
	}
}
