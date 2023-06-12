package day9.classEx;

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
	 *  메서드명 : printInfo
	 */
		public void printInfo() {
		System.out.println("자동차 조회");
		System.out.println("제조사 : " +company);
		System.out.println("모델 : " + name);
		System.out.println("연식 : " + year);
		System.out.println("전원 : " + (power? "On":"off"));
		System.out.println("기어 : " + gear);
		System.out.println("속력 : " + speed);
		}
	/** 속력이 1 증가 또는 1 감소하는 메서드
	 * 매개변수 : 증가할건지 boolean positive
	 * 리턴타입 : 없음
	 * 메서드명 : speedChange
	 */
		public void speedChange(Boolean positive) {
			// 전원이 꺼져있으면 종료
			if(!power) {
				return;
			}
			// 기어가 중립 또는 주차중이면 종료
			if(gear == 'N' || gear =='P') {
				return;
			}
			// 속력이 증가하는 경우이면
			if(positive) {
			speed+=1;
			}
			// 속력이 감소하는 경우이고 속력이 0보다 크면
			else if(speed >0){
				speed -=1;
			}
		}	
		/** 자동차 시동을 켜거나 끄는 메서드
		 *  매개변수 : 없음
		 *  리턴타입 : 없음 => void
		 *  메서드명 : turn
		 */
		
		public void turn() {
			// 시동이 꺼져있으면 켬
			if(!power) {
				power = true;
				System.out.println("시동을 킵니다.");
			}
			else if(gear =='P') {
				power = false;
				speed = 0;
				System.out.println("시동이 꺼집니다.");
			}
			else if(power) {
				power = false;
				speed = 0;
				gear = 'P';
				System.out.println("시동이 꺼집니다.");
			}
		}
		public void setGear(char _gear) {
			gear = _gear;
		}
		
		
}
	

