package day09.classEx;

public class Car {
	// 멤버 변수(필드) 초기화
	private String name;		// 차 이름
	private String company;		// 제조사 브랜드
	private int year;			// 연식
	private int speed;			// 속력
	private char gear;			// P: 주차, R: 후진, D:주행,N:중립
	private boolean power;		// 전원
	
	// 생성자
	public Car(String _name, String _company, int _year) {
		name = _name;
		company = _company;
		year = _year;
		gear = 'P';
	}
	
	// 메서드
	/** 자동차 정보를 출력하는 메서드
	 *  매개변수 : 없음
	 *  리턴타입 : void
	 *  메서드명 : printInfo*/
		public void printInfo() {
		System.out.println("자동차 조회");
		System.out.println("제조사 : " +company);
		System.out.println("모델 : " + name);
		System.out.println("연식 : " + year);
		System.out.println("전원 : " + (power? "On":"Off"));
		System.out.println("기어 : " + gear);
		System.out.println("속력 : " + speed);
		}
	/** 속력이 1 증가 또는 1 감소하는 메서드
	 * 매개변수 : 증가할건지 boolean positive
	 * 리턴타입 : 없음
	 * 메서드명 : speedChange*/
		public void speedChange(Boolean positive) {
			// 전원이 꺼져있으면 속도변화를 안줌
			if(!power) {
				return;
			}
			// 기어가 중립 또는 주차중이면 속도 변화를 안줌
			if(gear == 'N' || gear =='P') {
				return;
			}
			// 전원이 꺼져 있지 않고 기어가 중립또는 주차중이 아닐 경우 true면 속력 증가 false(속도가 0 초과의 경우)면 속력 감소 
			if(positive) {
				System.out.println("속도 1증가");
			speed+=1;
			}
			// 속력이 감소하는 경우이고 속력이 0보다 크면
			else if(speed >0){
				System.out.println("속도 1감소");
				speed -=1;
			}
		}	
		/** 자동차 시동을 켜거나 끄는 메서드
		 *  매개변수 : 없음
		 *  리턴타입 : 없음 => void
		 *  메서드명 : turn
		 */
		
		// 시동 조작
		public void turn() {
			// 시동 기능
			if(!power) {
				System.out.println("시동을 킵니다.");
				power = true;
			}
			else if(power) {// 시동을 끄면 
				if(gear =='D' || gear =='R') {
					System.out.println("에러 : 기어를 N 혹은 P로 설정 후 이용");
				}
				else {
				System.out.println("시동이 꺼집니다.");
				speed = 0;
				gear = 'P';
				power = false;
				}
			}
		}
		
		// 기어 조작
		public void setGear(char _gear) {
			gear = _gear;
			if(gear =='D') {
				System.out.println("기어를 D로 둡니다.");
			}
			else if(gear =='N') {
				System.out.println("기어를 N으로 둡니다.");
				speed = 0;		
			}
			else if(gear =='R') {
				System.out.println("기어를 R으로 둡니다.");
				speed = 0;
			}
		}
}
	

