package day10.practice;

public class RectEx2 {
	public static void main(String[] args) {
		Rect1 r1 = new Rect1(0,0,10,10);
		r1.print();
		r1.move(10,10);
		r1.print();
		r1.resize(10, 10, 20, 20);
		r1.print();
		r1.resize(0, 0, 30, 20);
		r1.print();
		
		System.out.println("==========");
		System.out.println("R2 start!");
		
		Rect2 r2= new Rect2(new Point(0,0), new Point(10,10));
		r2.print();
		r2.move(10, 10);
		r2.print();
		r2.resize(10, 10, 20, 20);
		r2.print();
		r2.resize(0, 0, 30, 30);
		r2.print();
		
	}
	
	


}


class Rect1{
	// 멤버변수
	/* 왼쪽 위의점 x좌표, 왼쪽 위의점 y좌표
	 * 오른쪽 아래 점 x좌표, 오른쪽 아래 점 y좌표
	 * 
	 */
	private int leftUpX, leftUpY;
	private int rightDownX, rightDownY;
	// 생성자
	public Rect1(int leftUpX, int leftUpY, int rightDownX, int rightDownY) {
		this.leftUpX = leftUpX;
		this.leftUpY = leftUpY;
		this.rightDownX = rightDownX;
		this.rightDownY = rightDownY;
	}
	// getter, setter
	
	// 메서드
	/** 사각형 정보를 출력하는 메서드
	 *  매개변수 : 없음
	 *  리턴타입 : 없음 = > void
	 *  메서드명 : print
	 */
	public void print() {
		System.out.println("==============");
		System.out.println("Left Point : " + leftUpX + ", " + leftUpY);
		System.out.println("Right Point : " + rightDownX + ", " + rightDownY);
	}
	
	/** 사각형을 움직이는 메서드
	 * 매개변수 : 이동시킬 왼쪽 위의 점 => int x, int y
	 * 리턴타입 :
	 * 메서드명 : move
	 */
	public void move(int x,int y) {
		int dx = leftUpX - x; // 이동한 x좌표 거리
		int dy = leftUpY - y; // 이동한 y좌표 거리 
		leftUpX = x;
		leftUpY = y;
		rightDownX = rightDownX - dx;
		rightDownY = rightDownY - dy;
	}
	/** 사각형의 크기를 변경하는 메서드
	 *  매개변수 : 변경된 사각형의 왼쪽 위의 x,y좌표와 
	 *  		 가로,세로가 주어지면 사각형의 크기를 변경하는 메서드
	 *  리턴타입 :
	 *  메서드명 : resize
	 */
	public void resize(int x, int y, int w, int h) {
		// x,y 고정값 , w h 변경값
		leftUpX = x;
		leftUpY = y;
		rightDownX = x + w;
		rightDownY = y + h;
	}
	
}

class Rect2{
	// 멤버변수
	private Point leftUp, rightDown;
	
	
	//생성자
	public Rect2(Point leftUp, Point rightDown) {
		this.leftUp = leftUp;
		this.rightDown = rightDown;
		
	}
	
	/** 사각형 정보를 출력하는 메서드
	 *  매개변수 : 없음
	 *  리턴타입 : 없음 = > void
	 *  메서드명 : print
	 */
	public void print() {
		System.out.println("==============");
		System.out.print("Left Point(Rect2) : " );
		leftUp.print(); // 출력하고 다음줄
		System.out.print("Right Point(Rect2) : " );
		rightDown.print();
	
	}
	
	/** 사각형을 움직이는 메서드
	 * 매개변수 : 이동시킬 왼쪽 위의 점 => int x, int y
	 * 리턴타입 :
	 * 메서드명 : move
	 */
	public void move(int x,int y) {
		int dx = leftUp.getX() - x; // 이동한 x좌표 거리
		int dy = leftUp.getY() - y; // 이동한 y좌표 거리 
		leftUp.move(x, y);
		rightDown.move(rightDown.getX() - dx, rightDown.getY() - dy);
		
	}
	/** 사각형의 크기를 변경하는 메서드
	 *  매개변수 : 변경된 사각형의 왼쪽 위의 x,y좌표와 
	 *  		 가로,세로가 주어지면 사각형의 크기를 변경하는 메서드
	 *  리턴타입 :
	 *  메서드명 : resize
	 */
	public void resize(int x, int y, int w, int h) {
		// x,y 고정값 , w h 변경값
		leftUp.move(x, y);
		rightDown.move(x+w, y+h);
	
	}
	

}
