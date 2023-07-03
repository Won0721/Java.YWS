package day21.practice;

public class UpdownGameEx {
	// 업다운 게임
	
	// 기록도 관리하는 기능 추가
	// 1. 플레이
	// 2. 기록확인
	// 3. 종료 
	
	// play 
	// 3번만에 맞춤
	// 기록 id : abc
	
	// 기록확인
	// 1. abc : 3
	
	public static void main(String[] args) {
		UpdownController game = new UpdownController();
		game.run();
	}
}
