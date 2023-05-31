package day04;

public class Day1_Upcastingtest {
	public static void main(String[] args) {
		
		A obj = new B(); // 부모변수 = 자식값 : 업캐스팅
		obj.methodA();
//	    obj.methodB(); 에러발생 
		
	}

}

class A{
	void methodA() {
		System.out.println("methoadA");
	}
}
class B extends A{
	void methodB() {
		System.out.println("methoadB");
	}
}