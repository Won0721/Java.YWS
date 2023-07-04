# JAVA

## 자바

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


### 객체
  물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서 정의 가능하고 식별 가능한것을 말한다.  
  자바에서 최소한의 프로그램 단위.  
  - 물리적인 객체 - 사람, 모니터, 상품, 자동차 등 ..
  - 추상적인 객체 - 주문, 생산정보, 회계장부 등 ..  

## 객체의 구성요소
1) 속성(변수)
2) 기능(메드)

## Class

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
> ### 가비지 컬렉터(Garbage Collector)
> 자바에서 동적 할당된 메모리(Heap 영역) 중에서 더 이상 사용되지 않는 객체를 찾아 제거하는 프로세스.

## 변수
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

## 메서드
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
## 업캐스팅  
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

	AAA p1 = new BBB();	// BBB 클래스의 객체를 부모타입의 참조변수로 받고있으나
				// 변수의 타입이 다르기 때문에 해당 변수를 통해 접근할 수 있는
				// 메서드의 범위가 제한되어 있음.

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

## 다형성
  같은 인터페이스 또는 부모를 공유(상속)하는 객체가 여러 유형의 타입을 가질 수 있는것을 말한다.
  - instanceof 연산자 - 객체가 특정 클래스 또는 인터페이스의 인스턴스인지 여부 확인.

## Object 클래스
 - 모든 클래스의 최상위 클래스
 - 클래스를 만들 때 따로 상속을 지정하지 않으면 Object 클래스에게 자동으로 상속받음
 - 주로 일반 클래스에서 Object 클래스의 메서드를 오버라이딩하여 사용	<br/>

### Objetc 클래스 메서드
 - equals() : 두 객체가 같은지 알려주고 boolean으로 반환
 - toString : 객체 정보를 문자열로 반환. 기본은 패키지.클래스명@해시코드값
 - hashCode() : 객체의 해시 코드값을 반환. 해시 값은 해시를 이용한 자료구조에서 사용
 - clone() : 객체를 복제해서 같은 멤버값을 가진 새로운 객체 생성
 - getClass() : 객체의 Class 클래스를 반환
 - finalize() : 객체가 메모리에서 GC에 의해 제거될 때 호출되는 메서드
 - wait() : 쓰레드에서 사용. 대기상태로 만듬
 - notify() : 쓰레드에서 사용. 실행 가능한 상태로 만듬


### Exception 클래스
모든 예외 클래스의 최상위 조상 클래스
  - RuntimeException 클래스와 RuntimeException이 아닌 클래스로 구분
    - RuntimeException 클래스는 실행 시 발생. 예외처리 안해도 실행 가능
    - RuntimeException이 아닌 클래스는 코드상으로 발생. 예외처리 안하면 실행 불가능

    
### RuntimeException 클래스
- NullPointerException : null 객체를 참조했을 경우
- ArrayIndexOutOfBoundsException : 배열을 참조하는 인덱스가 잘못된 경우
- NumberFormatException : 숫자형식오류 ex) Integer.parseInt("010") , Integer.paraseInt("123a") 
- ClassCastException : 적절치 못하게 Class를 형 변환하는 경우
- ArithmeticException : 정수를 0으로 나누었을 경우

### Exception 메서드
 - getMessage() : 예외 메세지를 문자열로 가져옴
 - printStackTrace() : 예외가 발생한 위치를 콘솔에 출력

```
try{
	// 예외가 발생할 수 있는 코드
	
}catch(예외클래스명 e){
	// 예외처리
	// 부모 클래스 Exception을 사용할 경우 catch의 객체로 자식클래스가 올수 없음

}catch(예외클래스명2 e){
	// 예외처리
}finally{
	// 반드시 실행되는 코드
}

// 특정 조건을 만족할 때 예외를 발생시킴
if(조건식) {
	throw new 예외클래스명("메세지");
}
```

## 컬렉션 프레임워크
다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법(자료구조)을 제공하는 클래스의 집합

### List : 인터페이스 
    1) 동일한 데이터의 중복을 허용한다.
    2) 데이터 저장순서가 유지된다.
    3) 힙(heap)영역 내에서 List는 객체를 일렬로 늘어놓은 구조를 하고있다.
    4) 객체를 인덱스로 관리하기 때문에 객체를 저장하면 자동으로 인덱스가 부여되고 인덱스로 객체를 검색, 삭제할 수 있다  
       이 때 List 컬렉션은 객체 자체를 저장하여 인덱스를 부여하는 게 아니라, 해당하는 인덱스에 객체의 주소값을 참조하여 저장한다.
  - ArrayList
      - 장점 : 검색이 빠르다
      - 내부 배열 객체를 저장해서 인덱스로 관리
  - LinkedList
      - 장점 : 추가, 삭제가 빠르다
      - 양방향 포인터 구조로, 각 배열의 값마다 다음 값을 참조하는 주소를 링크해서 체인처럼 관리한다.
  - Vector
      - ArrayList와 동일한 내부 구조를 가지고 있다. 

### Set : 인터페이스
    1) 같은 데이터의 중복 저장을 허용하지 않는다. 따라서 null도 하나의 null만 저장할 수 있다.
    2) 데이터의 저장 순서를 유지하지 않는다.
    3) Set 컬렉션은 List 컬렉션처럼 인덱스로 객체를 검색해서 가져오는 메소드가 없다.   
       대신 전체 객체를 대상으로 한 번 씩 다 가져오는 반복자, Iterator을 제공한다.
  
- HashSet
  - 순서가 필요없는 데이터를 hash table에 저장.
  - Set 중에 가장 성능이 좋음.
- TreeSet
     - 저장된 데이터의 값에 따라 정렬됨. red-black tree 타입으로 값이 저장됨.
     - HashSet보다 성능이 느림. 
- LinkedHashSet
  - 연결된 목록 타입으로 구현된 hash table에 데이터 저장.
  - 저장된 순서에 따라 값이 정렬되나 셋 중 가장 느림

### Map : 인터페이스
    1) Key와 Value를 가진 집합이며, 중복을 허용하지 않는다.
    2) Key : 중복 허용 X
       Value : 중복 허용 O


 - HashMap
       - 순서유지 X
       -     

 - TreeMap

## 람다 (Lambda)
람다 함수는 프로그래밍 언어에서 사용되는 개념으로 익명함수(Anonymous functions)를 지칭하는 용어  
함수를 보다 간단하게 표현하는 방법

#### 장점
1. 코드를 간결하게 만들 수 있다.
2. 개발자의 의도가 명확히 드러나 가독성이 높아진다.
3. 함수를 만드는 과정없이 한번에 처리할 수 있어 생산성이 높아진다.
4. 병렬프로그래밍이 용이하다
#### 단점
1. 람다를 사용하면서 만든 익명함수는 재사용이 불가능하다.
2. 디버깅 어렵다.
3. 람다를 남발하면 코드가 지저분해질 수 있다.
4. 재귀로 만들경우에 부적합하다.

### 람다의 표현식
1. 매개변수 화살표(->) 함수몸체로 이용하여 사용한다.
2. 함수몸체가 단일 실행문일 경우, 괄호{} 를 생략 할 수 있다.
3. 함수몸체가 return문으로만 구성되어 있는 경우 괄호{} 를 생략 할 수 없다.

() -> {}
() -> 1
() -> { return 1;}


#### 람다식의 기본 형태 
```
A a = (매개값) -> { 구현 코드 }; 
```

#### 1. 매개변수 X , 리턴 X
```
@FunctionalInterface // 구현해야 할 추상 메소드가 하나만 정의된 인터페이스
public interface ClassA{
	void method();
}

public class AAA {
	public static void main(String[] args) {
	// 객체 선언
	ClassA ca;

	ca = () -> {
		System.out.println("Hello");
	};
	ca.method();

	// 실행코드가 1줄인 경우 { } 생략가능
	ca = () -> System.out.println("Hello");
	ca.method();
	}

}

실행 결과
Hello
Hello

```


#### 2. 매개변수 O, 리턴 X
```
@FunctionalInterface // 구현해야 할 추상 메소드가 하나만 정의된 인터페이스
public interface ClassA{
	void method(String str);
}
public class AAA {
	public static void main(String[] args) {
		// 객체 선언
		ClassA ca;
		String str;
	
		ca = (a) -> {
			System.out.println(a + " Java");
		};
		str = "Hello";
		ca.method(str);
	
	 	// 매개변수가 1개인 경우 () 생략 가능
		ca = a -> System.out.println( a +" Hello");
		ca.method("Python");
	}
}

실행 결과
Hello Java
Heelo Python

```

#### 3. 매개변수 X , 리턴 O
```
@FunctionalInterface // 구현해야 할 추상 메소드가 하나만 정의된 인터페이스
public interface ClassA{
	void method();
}
public class AAA {
	public static void main(String[] args) {
		// 객체 선언
		ClassA ca;
	
		String str1 = "Python";
		String str2 = "Java";
	
	
		ca = () -> {
			return str1;
		};
		System.out.println(ca.method());
	
		ca = () -> { return str2; };
		System.out.println(ca.method());
	}
}

실행 결과
Python
Java

```
#### 매개변수 O , 리턴 O
```
@FunctionalInterface // 구현해야 할 추상 메소드가 하나만 정의된 인터페이스
public interface ClassA{
	void method(String s);
}
public class AAA {
	public static void main(String[] args) {
		// 객체 선언
		ClassA ca;
	
		String str1 = "Python";
		String str2 = "Java";
		String str3 = "World";
	
	
		ca = (s) -> {
			return s + str1;
		};
		System.out.println(ca.method("Hello"));
	
		ca = (s) -> { return s + str2; };
		System.out.println(ca.method("Good"));
	
		ca = s -> s + str3;
		System.out.println(ca.method("Java"));;

	}	
}

실행 결과
Hello Python
Good Java
Java World
```
## 컬렉션 스트림(Stream) # 데이터의 연속적인 흐름
컬렉션 데이터를 처리할 때, 컬렉션 데이터를 **선언형**으로 쉽게 처리할 수 있고  
멀티스레드 코드를 구현하지 않아도 데이터를 병렬처리 할 수 있다.

#### [스트림 사용 X]
```
@Data //loombok 사용
class Apple{
	String color   // 사과 색깔
	int weight     // 사과 무게
	int uid       // 사과 고유번호
	public Apple(String color, int weight, int uid){
		this.color = color;
		this.weight = weight;
		this.uid = uid;
	}

	public Apple(Apple a){
		this.color = a.color;
  		this.weight = a.weight;
    		this.uid = a.uid;
	}
	public String getColor{
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	...
}

// 빨간색 사과 필터링
List<Apple> appleList = new ArrayList<>();
List<Apple> redApples;
for(Apple apple : appleList){
	if(apple.getColor().equals("RED")){
		redApples.add(new Apple(apple); 
	}
}
============================================================
// 람다식 사용
List<Apple> redApples = forEach(appleList, (Apple apple) ->
apple.getColor().equals("RED"));

// 무게 순서대로 정렬
reApples.sort(Comparator.comparing(Apple::getWieght));

// 사과 고유번호 출력
List<Integer> redHeavyAppleUid = new ArrayList<>();
for ( Apple apple : redApples)
	redHeavyAppleUid.add(apple.getUidNUm());
```


#### [스트림 사용 O]
```
List<Apple> appleList = new ArrayList<>();
Stream<Apple> st = appleList.stream();
st.filter(apple -> apple.getColor().equals("RED")) // 빨간색 사과 필터링
  .map(apple -> apple.getUid())			// 사과 고유번호만 가져오기
  .collect(Collectors.toList());	// 사과 고유번호 출력


```

## 스레드

### 1) 프로세스와 스레드 

#### 프로세스
프로세스(Process)는 일반적으로 cpu에 의해 메모리에 올려져 실행중인 프로그램을 말하며,  
자신만의 메모리 공간을 포함한 독립적인 실행 환경을 가지고 있음.  
우리가 사용하는 프로그램 중 일부는 여러 프로세스 간 상호작용을 하는 것일수도 있다.  
자바 JVM(Java Virtual Machine)은 주로 하나의 프로세스로 실행되며, 동시에 여러 작업을 수행하기 위해서 **멀티 스레드**를 지원하고 있다.

#### 스레드
프로세스안에서 실질적으로 작업을 실행하는 단위를 말하며, 자바에서는 JVM(Java Virtual Machine)에 의해 관리  
프로세스에는 적어도 한개 이상의 스레드가 있으며, Main 스레드 하나로 시작하여 스레드를 추가 생성하게 되면 멀티 스레드 환경이 됨

#### 스레드 생성방법
1) Thread 클래스를 상속 받는 방법	 **But... Thread를 상속받게 되면 다른 클래스를 상속 받을 수 없음**
2) Runnable 인터페이스 구현

#### 스레드의 생성자
1) Thread( ) : 새로운 스레드 객체 할당
2) Thread(String name) : 새로운 스레드 객체가 할당되며, 스레드 이름은 name으로 설정됨
3) Thread(Runnable target) : Runnable target이 구현된 스레드 객체 할당
4) Thread(Runnable target, String name) : Runnable target이 구현된 스레드 객체가 할당되면 스레드 이름은 name으로 설정됨.

#### 스레드의 메서드
1) void run() : 
2) void start() : 스레드가 시작 되도록 요청하는 메서드
3) void interrupt() : 스레드를 중지
4) void join() : 스레드가 끝날 때 까지 기다림
5) void join(ling millis) : 최대 millis 시간 동안 이 스레드가 끝날 때 까지 기다림
6) static void sleep(long millis) : millis 시간 동안 현재 스레드를 일시 중지
7) static void yield() : 현재 스레드의 실행시간을 다른 스레드에게 양보
8) static Thread currentThread() : 현재 실행중인 스레드 객체의 참조값을 반환
9) int getPrioriy() : 스레드의 우선순위 값을 반환 (우선순위 범위 : 1 ~ 10)
10) void setPriority(int newPriority) : 이 스레드의 우선순위를 newPriority로 변경
11) String toString() : 이 스레드의 이름, 우선순위 스레드그룹 등의 정보를 담은 문자열을 반환

  
### 1) Thread 클래스 상속 방식
```
class MyThread extends Thread{
	public void run(){				// 1. Thread 클래스 상속한 클래스 정의
		System.out.println(this.getName());	// 2. run()메소드 오버라이드 및 스레드 코드 작성
	}
}

public class HelloWorld {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread();		// 3.스레드 객체 생성
		mt1.start();				// 4.스레드 실행
	}
}
```
### 2) Runnable 인터페이스 구현 방식
```
class MyThread implements Runnable {			// 1.Runnable 인터페이스를 구현하는 클래스 정의
	public void run() {				// 2.run()메소드 오버라이드 및 스레드 코드 작성
		System.out.println(Thread.currentThread().getName());
	}
}

public class HelloWorld {
	public static void main(String[] args) {
		Runnable r1 = new MyThread();		// 3.Runnable 객체 생성
		Thread t1 = new Thread(r1);		// 4.Thread 객체 생성
		t1.start();				// 5.스레드 실행
	}
}

```
