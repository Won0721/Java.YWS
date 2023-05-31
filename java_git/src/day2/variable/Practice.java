package day2.variable;

public class Practice {
	public static void main(String[] args) {
		/* 
		1. 문자는 ''로 감싸여야 한다. " "가 아님
		char ch = "a"; => char ch = 'a';
		*/
		
		/*
		2. 국어, 영어, 수학 성적을 입력하여 평균을 구하려 한다. 이 때 필요한 변수들을 선언하세요.
		 */
		int kor, eng, math;
		double avg;
		kor = 55;
		eng = 50;
		math = 50;
		avg = (kor+eng+math) / 3.0;
		System.out.println(avg);
		System.out.printf("%.2f",avg);
		
	}

}
