package studey;

public class Conditional06 {
	public static void main(String[] args) {
		char key = 'w';
		switch(key) {
		case 'w':
			System.out.println("앞으로 이동");
			break;
		case 'a':
			System.out.println("좌측으로 이동");
			break;
		case 's':
			System.out.println("뒤로 이동");
			break;
		case 'd':
			System.out.println("우측으로 이동");
		default:
			System.out.println("Hold!");
			break;
		}
	}

}
