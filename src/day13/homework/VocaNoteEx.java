package day13.homework;

import java.util.Scanner;

public class VocaNoteEx {
	// 테스트 공간
	// VocaWord
	/** 1. 단어 추가 	

	 *  2. 단어 삭제

	 *  3. 단어 수정
	 *  	1)단어 수정
	 *  	2) 뜻 추가
	 *  	3) 뜻 수정
	 *  	4) 뜻 삭제
	 *   
	 *  4. 단어 출력
	 *  	a) 전체 출력 VocaNote print() 기능
	 *  	b) 검색
	 *  
	 *  5. 프로그램 종료 
	 *  
	 *  메뉴 선택 3
	 *  
	 *  서브 메뉴
	 *  
	 *  1. 단어 수정
	 *  2. 뜻 수정
	 *  3. 뜻 삭제

	 */

	public static void main(String[] args) {
		
		System.out.println("메모장 프로그램 입니다.");
		Scanner sc = new Scanner(System.in);
		VocaNote note = new VocaNote();
		int memoCount = 0 ;
		
		while(true) {
			int SwitchSelect;
			int printChoice;
			int SwitchChoice;
			int wordChoice;
			int meaningChoice;
	
			String inputTitle;
			String inputTitle2;
			String inputMeaning;
			String changeTitle;
			String changMeaning;
			
			System.out.println("1. 단어 추가");
			System.out.println("2. 단어 삭제");
			System.out.println("3. 단어 수정");
			System.out.println("4. 단어 출력");
			System.out.println("5. 프로그램 종료");
			
			System.out.print("숫자를 입력해 주세요 : ");
			SwitchSelect = sc.nextInt();
			
			
			
			switch(SwitchSelect) {
			case 1:{
			System.out.println("--단어 추가 페이지--");
			System.out.println("영어 단어를 입력해주세요 : ");
			inputTitle = sc.next();
			System.out.println("뜻을 입력해주세요 : ");
			inputMeaning = sc.next();
			
			note.addVoca(inputTitle, inputMeaning);
			}
				break;
			case 2:{
			System.out.println("삭제할 영단어를 입력해주세요 :");
			inputTitle = sc.next();
			note.deleteVoca(inputTitle);
			
			}
				break;
				
			case 3:{
			System.out.println("1) 단어 수정");
			System.out.println("2) 뜻 추가");
			System.out.println("3) 저장된 뜻 수정");
			System.out.println("4) 저장된 뜻 삭제");
			System.out.print("숫자를 입력해 주세요 : ");
			SwitchChoice = sc.nextInt();
			if(SwitchChoice == 1) {
				// 단어 수정
				note.printWord();
				System.out.print("바꾸실 영어단어를 입력해 주세요 :");
				inputTitle = sc.next();
				System.out.print("수정할 영어단어를 입력해 주세요 :");
				changeTitle = sc.next();
				
				note.fixTitle(inputTitle, changeTitle);
			
			}
				// 뜻 추가
			else if(SwitchChoice == 2) {
			
				note.printWord();
				System.out.print("영어단어를 선택해 주세요(Num) : ");
				wordChoice = sc.nextInt();
				note.searchInt(wordChoice);
				System.out.print("추가하실 뜻을 입력해주세요(String) : ");
				changeTitle = sc.next();
				
				note.addMeaning(wordChoice,changeTitle);
				
				
			
			}
			else if(SwitchChoice == 3) {
				// n번지에 저장되어있는 뜻 변경
			
				note.printWord();
				System.out.print("영어 단어를 선택해 주세요(Num) : ");
				wordChoice = sc.nextInt();
				note.searchInt(wordChoice);
				System.out.print("변경할 뜻을 선택해 주세요(Num) : ");
				meaningChoice = sc.nextInt();
				System.out.print("변경할 뜻을 입력해 주세요 : ");
				changMeaning = sc.next();
				
				note.fixMeaning(wordChoice, meaningChoice, changMeaning);
				
			}
			else if(SwitchChoice == 4) {
				// 뜻 삭제
			
				note.printWord();
				System.out.print("영어 단어를 입력해 주세요 : ");
				inputTitle = sc.next();
				note.serach(inputTitle);
				
				System.out.print("삭제할 뜻의 숫자를 입력해주세요 : ");
				meaningChoice = sc.nextInt();
				note.deleteMeaning(meaningChoice);
				
			
				
			}
			
			}
				break;
			case 4:{
				System.out.println("1) 전체출력 :");
				System.out.println("2) 검색 : ");
				
				printChoice = sc.nextInt();
				
				if(printChoice ==1) {
					note.print();
			
					
				}
				
				else {
					String searchWord;
					System.out.print("검색할 단어 : ");
					searchWord = sc.next();
					
					note.serach(searchWord);
				}
				
			}
				break;
	
				
			case 5:
				System.out.println("프로그램 종료");
				return;
			}
			
//			System.out.println("프로그램을 종료 하시겠습니까? Y/N");
//			char ch1 = sc.next().charAt(0);
//			
//			if(ch1 == 'Y') {
//				return;
//			}
//			else {
//				continue;
//			}
			
			
			
			
			
			
		}
		
		
		
		
	}


}
