package day13.practice;

public class Subject {
	private int korScore;
	private int engScore;
	private int mathScore;
	private double avrScore;
	
	public Subject() {}
	public Subject(int korScore, int engScore, int mathScore) {
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	
	// 성적을 과목 평균을 내주는 기능
	public double avr(int korScore, int engScore, int mathScore) {
		double avrScore =0.0;
		avrScore = korScore + engScore + mathScore / (double) 3;
		return avrScore;		
	}
	
	// 성적을 총점을 출력하는 기능
	public void print() {
		this.avrScore = avr(korScore, engScore, mathScore);
		System.out.printf("총점은 " + avrScore + " 입니다.");
	}
	
	// 과목당 점수를 출력해주는 기능 
	public void korPrint(int korScore) {
		this.korScore = korScore;
		System.out.println("수학 점수는 " + korScore + "입니다");
	}
	
	public void engScore(int engScore) {
		this.engScore = engScore;
		System.out.println("수학 점수는 " + korScore + "입니다");
	}
	
	public void mathScore(int mathScore) {
		this.mathScore = mathScore;
		System.out.println("수학 점수는 " + korScore + "입니다");
	}
}
