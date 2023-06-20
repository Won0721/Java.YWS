# JAVA

#### 자바

  - JVM 자바 가상 머신(Java Virtual Machine)  
    - 자바 프로그램이 어느 기기, 어느 운영체제 상에서도 실행될 수 있게 만들어준다. (WORA)
    - 운영체제(OS)로부터 메모리를 할당 받고, 그 메모리를 용도에 따라 여러 영역으로 나누어 관리한다.
        - Method(Static)영역 
          : 필드(field) 부분에서 선언된 변수(전역변수)와 정적 멤버변수(static이 붙은 자료형)을 Static 영역에 저장한다.
        - stack 영역
          : 우리가 작성하던 메소드 내에서 정의하는 기본자료형에 해당되는 지역변수의 데이터 값이 저장되는 공간
          
        - Heap 영역
         : 참조형의 데이터 타입을 갖는 객체(인스턴스), 배열 등은 Heap 영역에 데이터가 저장된다.
```
public class HeapAreaEx01 {
	public static void main(String[] args) {
		int[] a = null; // int형 배열 선언 및 Stack 영역 공간 할당
		System.out.println(a); // 결과 : null
		a = new int[5]; // Heap 영역에 5개의 연속된 공간 할당 및 
		                // 변수 a에 참조값 할당
		System.out.println(a); // 결과 : @15db9742 (참조값)
	}
}  
```


  - JRE 자바 런타임 환경(Java Runtime Environment)
     - JVM, 자바 클래스 라이브러리, 자바 명령 및 기타 인프라를 포함한 컴파일된 Java 프로그램을 실행하는데 필요한 패키지 
     
  - JDK 자발 개발 키트(Java Development Kit)
     - Java를 사용하기 위해 필요한 모든 기능을 갖춘 Java용 SDK(Sofrtware Development Kit)
     - JVM, JRE 모든 것뿐만 아니라 컴파일러(javac)와 jdb, javadoc과 같은 도구도 있음 

        => "프로그램"을 생성하고 컴파일 할 수 있다


#### 객체란?
  물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서 정의 가능하고 식별 가능한것을 말한다.  
  자바에서 최소한의 프로그램 단위.  
  - 물리적인 객체 - 사람, 모니터, 상품, 자동차 등 ..
  - 추상적인 객체 - 주문, 생산정보, 회계장부 등 ..  

#### 객체의 구성요소
1) 속성(변수)
2) 기능(메드)

#### Class란
 - 객체를 만들기 위한 프로그램코드로 이루어진 설계도
 - class에 작성된 코드를 읽어 -> 인스턴스화(객체화) 한다.(메모리에 올린다)
 - new 연산자로 인스턴스화 가능! ex) 타입(클래스명) 변수명 = new 클래스명();
 
#### 클래스 구조
```
(접근제한자) class 클래스명 (extends 상위클래스명) (implements 인터페이스명 { // 클래스 선언부  
  (생성자) => 초기화
  변수(멤버변수, 멤버필드) =>  속성
  메소드(멤버메서드) => 기능
}
 - 접근 제어자(Access Modifier) : 클래스의 멤버변수, 메서드, 생성자에 대한 접근을 지정하는 예약어
   - private : 자신 클래스에서만 사용 가능
   - default : 자신 클래스 + 같은 패키지
   - protected : 자신 클래스 + 같은패키지 + 자식클래스
   - public : 어떤 클래스에서도 접근가능
```
> #### 가비지 컬렉터(Garbage Collector)
> 자바에서 동적 할당된 메모리(Heap 영역) 중에서 더 이상 사용되지 않는 객체를 찾아 제거하는 프로세스.

#### 변수
- 타입
  - 기본형(8개) - boolean, char, byte, short, int, long, float, double => 실제 값을 가지고 있는 변수
  - 참조형 - 기본형 외 모든 변수 => 객체 주소값을 가지고 있는 변수  
- 선언위치
  - 전역변수 - 클래스에 종속된 변수, 멤버변수, 멤버필드
    - 초기화 하지 않으면 default값이 들어간다.
    - boolean - false
    - 정수형 - 0
    - 실수형 - 0.0
    - char - '\u0000' 
    - 참조형 - null
  - 지역변수 - 메소드 안에 선언. 메소드 종료시 같이 소멸.
    - 초기화 하지 않으면 컴파일 에러 발생! 사용불가!!
- 정적(static) - static이 선언된 변수

#### 메서드
  프로그래밍에서 메소드는 하나의 특별한 목적의 작업을 수행하기 위해 설계된 코드 집합.  
  객체에서 기능역할을 한다.  
#### 메소드 구조
```
(접근제한자) (static) 반환타입 메소드이름(매개변수타입 매개변수명) { // 메소드 선언부
  실행할 코드 
  
  (return 반환값)
}
```
> #### 오버로딩(Overloading)
  클래스 내에서 같은 이름을 가진 메소드를 여러개 정의하는 것을 말한다.  
  매개변수 개수 또는 타입이 다르면 가능하다.  
  매개변수가 다른데 기능은 같은 경우 메소드 오버로딩을 지원하지 않으면 같은 기능에서 이름만 다른 메서드가 여러개 만들어짐

#### 생성자(Construtor)
  인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메소드' 이다. (하지만 메소드는 아님)
  - 클래스명과 같다.
  - 멤버필드 초기화 용으로 사용
  - 메소드와 차이점은 리턴이 없다.
  - 오버로딩 가능하다.

#### 상속
  부모클래스(상위클래스)와 자식클래스(하위클래스)가 있으며,  
  자식클래스는 부모클래스를 선태해서 그 부모의 멤버를 상속받아 사용이 가능하다.  

```
class 자식클래명 extends 부모클래스명 {
}
```
#### 메서드 오버라이딩(OverRiding)
  - 상위 클래스에 정의된 메소드의 이름, 반환형, 매개변수 선언까지 
    완전히 동일한 메소드를 하위 클래스에서 다시 정의하는 것
  - 하위 클래스에 정의된 메소드에 의해 상위 클래스의 메소드는 가리워진다.
```
// 부모클래스
class Person { 
	void run(){
	System.out.println("사람이 달려요");
	}
}

// 자식클래스 extends 부모클래스
class Student extends Person {
	void run(){
	super.run(); // 자식클래스의 메서드 호출 시 부모클래스의 메서드도
  		     //	같이 호출하고 싶을 경우 super.메서드명 을 추가시켜준다.
	System.out.println("사람이 달려요");  // 외부에 가려짐
	System.out.println("학생이 달려요");
	}
}
```

```
class Speaker{

	private int volumeRate;
	public void showCurrentState(){
		System.out.println("볼륨 크기 : " + volumeRate );
	}
	public void setVolume(int vol){
		voluemRate = vol;
	}
}

class BaseEnSpeaker extends Speaker{

	private int baseRate;

	public void showCurrentState(){
		super.showCurrentState();
		System.out.println("베이스 크기 : " + baseRate );
	}
	public void setBaseRate(int base)
	{
		baseRate = base;
	
}
```
#### 업캐스팅  
  - 자식클래스의 객체를 부모타입으로 참조받음
> #### 자바 컴파일러의 실제 관점
> 중 저음 보강 스피커는 (일종의) 스피커이다. (O) <br/>
> BaseEnSpeaker is a Speaker. (O)
```
public static void main(String[] args) {

	Speaker bs = new BaseEnSpeaker(); // 업캐스팅
	bs.setVolume(10);
	bs.setBaseRate(20); ====> 컴파일 에러 : bs가 참조하는 것은 Speaker의 인스턴스로 인식하기 때문에 BaseEnSpeaker의 멤버에 접근 불가
	bs.showCurrentState();	
}
```
```
업캐스팅(Upcasting)된 참조변수는 해당 참조변수가 참조하는 객체의 타입으로부터
상속받은 메서드들 중에서 동일한 시그니처를 가진 메서드를 호출할 수 있다.

	AAA p1 = new BBB();	// BBB 클래스의 객체를 부모타입의 참조변수로 받고있으나 변수의 타입이 다르기 때문에
				// 해당 변수를 통해 접근할 수 있는 메서드의 범위가 제한되어 있음.

				// 업캐스팅한 참조변수(p1)는 참조변수의 타입(AAA)의 멤버변수들에만 접근이 가능하다.

				// 그러나 오버라이딩(자식클래스에 재정의)된 메서드의 경우
				// 자식클래스(BBB)의 메서드에서 재정의한 내용이 실행될 수 있음

	p1.A();		// 
	p1.method();	// 부모클래스로 부터 상속받은(오버라이딩) 메서드이기에 자식클래스의 객체 메서드로서 호출
	p1.B();	 // 컴파일 오류 : 참조변수의 타입은 부모클래스이기 때문에 자식클래스에서 정의된 메서드는 실행 불가

class AAA {
	public void A(){
		System.out.println("AAA");
	}

	public void method(){
		System.out.println("A method");
	}
}
class BBB extends AAA{
	public void B(){
		System.out.println("AAA");
	}
	
	// 오버라이딩(상속) 받은 메서드
	public void method(){
		System.out.println("B method");
	}
}
```

#### 다형성
  같은 인터페이스 또는 부모를 공유(상속)하는 객체가 여러 유형의 타입을 가질 수 있는것을 말한다.
  - instanceof 연산자 - 객체가 특정 클래스 또는 인터페이스의 인스턴스인지 여부 확인.
