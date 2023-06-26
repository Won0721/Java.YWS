package day18.homework.controller;

import java.util.Scanner;

public class ImgEx implements Program{
	private String[] imgs = {"img","bmg","png"};
	private Scanner sc= new Scanner(System.in);
	private final static int EXIT = 2;
	@Override
	public void run() {
		int menu;
		do {
			printMenu();
			menu = sc.nextInt();
			System.out.println("==========");
			runMenu(menu);
			
		}while(menu != EXIT);
	}
	@Override
	public void printMenu() {
		System.out.println("===========");
		System.out.println("1. 파일이름 입력");
		System.out.println("2. 종료");
		System.out.print("메뉴 선택 >> ");	
	}
	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1: inputFile(); break;
		case 2: System.out.println("시스템 종료 ");break;
		default : System.out.println("잘못된 숫자 입력");
		
		}
		
	}
	
	public void inputFile() {
		System.out.print("파일명을 입력해주세요 : ");
		sc.nextLine();
		String fileName = sc.nextLine();
		// 확장자 추출
		// 파일명 : dog.img , smaile.png 확장자 앞에 .이 붙으므로
		// 오른쪽부터 시작해서 처음의 . 의 위치 찾기
		// String name = "Hello"
		// name.substring(2) => llo *인덱스 번지부터 끝까지 출력*
		int index = fileName.lastIndexOf('.');
		String suffix = fileName.substring(index+1);
		
		if(checkImage(suffix)) {
			System.out.println(fileName + " : 이미지 입니다.");
		}
		else {
			System.out.println(fileName + " : 이미지가 아닙니다.");
		}
		
	}
	
	private boolean checkImage(String suffix) {
		for(String s : imgs) {
			if(s.equals(suffix)) {
				return true;
			}
		}
		return false;
	}	

	
}
