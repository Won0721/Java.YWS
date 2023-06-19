package day14.switchEx;

public class SwitchEx {
	/** switch문에서 case에 변수를 선언하면 다른case에서 
	 * 선언할수 없다는걸 보여주는 예제
	 * case문에 break가 필수가 아니라서
	 * 다음 case의 실행문으로 이동할 수 있기 때문에 중복사용 불가
	 */
	public static void main(String[] args) {
		
		int menu = 1;
		
		switch(menu) {
		case 1:
			String title = "제목1";
			System.out.println();
			break;
		case 2:
			String title2 = "제목2"; // title이 case 1에 있어서 선언이 안됨
			// case2 에서 title을 쓰면 에럽라생
			// title을 쓰기 위해서는 case 1를 반드시 지나야하는데 메뉴값이 2인 경우 안거치고 case1을 건너뛰고 오기떄문에
			// title이 선언되지 않아서 에러 발생 ==> switch문 밖에 선언하면 해결되는 문제
			// System.out.println(title);
			System.out.println(title2);
			break;
		case 3:
			break;
		}
	}

}
