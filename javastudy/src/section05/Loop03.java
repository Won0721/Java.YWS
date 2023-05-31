package section05;
/*
 *  1) 초기식(처음 한번만 실행) -> 2) 조건식 -> 3) 실행문 -> 4) 증감식
 */
public class Loop03 {
	public static void main(String[] args) {
		for (int i =0; i<10; i++) {
			System.out.println(i);
		}
		int i =0; //초기식
		while(i<10) { //조건식
			System.out.println(i); // 실행문
			i++;  //  증감식
		}
	}

}
