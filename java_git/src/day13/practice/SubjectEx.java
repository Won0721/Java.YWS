package day13.practice;

public class SubjectEx {
	/** 성적을 관리하기 위한 subject 클래스를 만들고 subjectEx 에 구현
	 * 
	 */
	public static void main(String[] args) {
		
		SubjectHint sub1= new SubjectHint("kor");
		sub1.print();
		System.out.println("=======================");
		SubjectHint sub2= new SubjectHint("eng",2,2);
		sub2.updateScore(30, 40, 10);
		sub2.print();
		System.out.println("===============");
	
		SubjectHint sub3 = new SubjectHint("Hong","kor",1,1);
		sub3.print();
		
		
	}
}
