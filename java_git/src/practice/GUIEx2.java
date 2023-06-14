package practice;

import java.awt.FlowLayout;

import javax.swing.*;


public class GUIEx2 extends JFrame{
	GUIEx2(){
		setTitle("JFrame");
		setSize(300,300);
		
		// 컴포넌트 만들기
		JButton button = new JButton("button");
		JCheckBox box = new JCheckBox("checkbox");
		JSlider slide = new JSlider();
		JTextField tf = new JTextField("text 입력",20);
		
		// 컴포넌트를 부착할건데 부착하는 담당자를 FlowLayout로 이용하겠다
		/* 배치관리자 종류
		 * FlowLayout : 왼->오 순서대로 배치
		 * BorderLayout : 동서남북 중앙으로 나누고 동->서->남->북->중앙 순
		 * GridLayout : 컨테이너 공간을 동일크기로 + 형태로 나눠 왼->오 순으로 배치
		 * CardLayout : 카드를 쌓아놓은 듯이 컴포넌트를 쪼개어 배치
		 * 
		 */
		this.setLayout(new FlowLayout());
		// 내가만든 프레임에 버튼을 달겠다. (컴포넌트 구현)
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(tf);
		
		setVisible(true);
		// setDefaultCloseOperation(기본 닫히는 기능을 (JFrame.EXIT_ON_CLOSE))로 설정할게)
		// 내 프로그램 닫는 기능을 닫기버튼으로 설정할게
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
			new GUIEx2(); // 객체를 생성해라 라는 생성자이므로 크기공간(new)을 할당해줘야함
		
	}

}
