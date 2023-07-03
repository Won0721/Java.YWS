package day20.homework.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VocabularyNote implements Program {
	private ArrayList<Word> wordList = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	
	public void run() {
		int sel = 0;
		do {
			
			try {
				printMenu();
				sel = sc.nextInt();
				runMenu(sel);
			}catch(InputMismatchException e) {
				System.out.println("인풋 예외클래스");
				sc.nextLine();
			}catch(Exception e) {
				System.out.println("최상위 예외클래스");
		
			}
			
		}while(sel !=5);
		
	}
	
	public void printMenu() {
		System.out.println("======================");
		System.out.println("1. 단어장 추가 기능");
		System.out.println("2. 단어장 삭제 기능");
		System.out.println("3. 단어장 수정 기능");
		System.out.println("4. 단어장 전체 출력");
		System.out.println("5. 프로그램 종료");
		System.out.println("======================");
		System.out.print("메뉴 선택 >>> ");
		
	}
	
	public void runMenu(int num) {
		
		switch(num) {
		case 1: insert(); break;
		case 2: delete(); break;
		case 3: update(); break;
		case 4: print(); break;
		case 5: System.out.println("시스템 종료");break;
		default : System.out.println("정수 오입력");
		}
		
	}
	
	public void insert() {
		System.out.println("========[추가]========");
		System.out.println("1. 영어단어 추가");
		System.out.println("2. 뜻 추가");
		System.out.print("메뉴 선택 >>> ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: insertWord(); break;
		case 2: insertMeaning(); break;
		default : System.out.println("잘못 입력"); return;
		}
		
	}
	
	public void delete() {
		System.out.println("========[삭제]========");
		System.out.println("1. 영어단어 삭제");
		System.out.println("2. 뜻 삭제");
		System.out.print("메뉴 선택 >>> ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: deleteWord(); break;
		case 2: deleteMeaning(); break;
		default : System.out.println("잘못 입력"); return;
		}
	}
	
	public void update() {
		System.out.println("========[업데이트]========");
		System.out.println("1. 영어단어 수정");
		System.out.println("2. 뜻 수정");
		System.out.print("메뉴 선택 >>> ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: updateWord(); break;
		case 2: updateMeaning(); break;
		default : System.out.println("잘못 입력"); return;
		}
	}
	
	
	public void insertWord() {
		System.out.println("======================");
		System.out.println("[영단어 추가]");
		System.out.print("영단어 입력 : ");
		String title = sc.next();
		System.out.println("뜻 입력 : ");
		sc.nextLine();
		String meaning = sc.nextLine();
		
		
		wordList.add(new Word(title,meaning));
		System.out.println("추가 완료");
		
	}
	
	public void insertMeaning() {
		System.out.println("======================");
		System.out.println("[뜻 추가]");
		System.out.print("영단어 입력 : ");
		String title = sc.next();
		int index = indexOf(title);
		if(index ==-1) {
			sc.nextLine();
			System.out.println("영단어 불일치");
			return;
		}
		sc.nextLine();
		System.out.print("추가할 뜻 : ");
		String meaning = sc.nextLine();
		
		wordList.get(index).addMeaning(meaning);
	}
	
	public void deleteWord() {
		System.out.println("======================");
		System.out.println("[영단어 삭제]");
		System.out.print("삭제할 영단어 입력 :");
		String title = sc.next();
		
		int index = indexOf(title);
		wordList.remove(index);
		
		
	}
	
	public void deleteMeaning() {
		System.out.println("======================");
		System.out.println("[뜻 삭제]");
		System.out.print("삭제할 영단어 입력 :");
		String title = sc.next();
		int index = indexOf(title);
		wordList.get(index).print();
		System.out.print("삭제할 뜻의 번호 입력 : ");
		int num = sc.nextInt();
	
		wordList.get(index).removeMeaning(num);
		
	}
	
	public void updateWord() {
		System.out.println("======================");
		System.out.println("[영단어 수정]");
		System.out.println("영단어 입력 :");
		String title = sc.next();
		System.out.println("영단어 수정 :");
		String updateTitle = sc.next();
		
		int index = indexOf(title);
		
		wordList.get(index).setTitle(updateTitle);
		
	}
	
	public void updateMeaning() {
		System.out.println("======================");
		System.out.println("[뜻 수정]");
		System.out.print("영단어 입력 :");
		String title = sc.next();
		
		int index = indexOf(title);
		
		wordList.get(index).print();
		
		System.out.println("수정할 뜻 번호 선택 : ");
		int num = sc.nextInt();
		System.out.println("변경할 뜻 입력 :");
		sc.nextLine();
		String updateMeaning = sc.nextLine();
		
		wordList.get(index).updateMeaning(num, updateMeaning);
		
		
		
	}
	
	public int indexOf(String title) {
		for(int i=0; i< wordList.size(); i++) {
			if(wordList.get(i).getTitle().equals(title)) {
				return i;
			}
	
		}
		return -1;
	}
	
	
	
	
	
	public void print() {
		for(int i=0; i< wordList.size(); i++) {
			wordList.get(i).print();			
		}
	}
	

}
