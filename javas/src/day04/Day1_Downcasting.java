package day04;

public class Day1_Downcasting {
	private void amin() {
		//업캐스팅
		Human h1 = new Student("가길동", 20, "게임하기", 3); // 업캐스팅 되어있음 
//		h1.study(); 불가
		
		//다운캐스팅
		Student s1 = (Student)h1;
		s1.study();

	}

}
