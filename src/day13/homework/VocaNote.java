package day13.homework;
// A    // B 

import java.util.Scanner;

public class VocaNote {
	// 단어 1개의 여러뜻이 있는 클래스를 배열로 만들어 모아두는 단어장 클래스
	static final int MAX = 10;
	private VocaWord[] wordList;
	private int wordListCount=0;
	Scanner sc = new Scanner(System.in);
	
	public VocaNote() {
		wordList = new VocaWord[MAX];
	}
	
	public VocaNote(VocaWord[] wordList) {
		this.wordList = new VocaWord[MAX];
		
		for(int i=0; i<wordList.length; i++) {
			this.wordList[i] = new VocaWord(wordList[i]);
		}
		wordListCount = wordList.length;
	}
// 영어단어들만 출력
	public void printWord() {
		System.out.println("========");
		for(int i=0; i<wordListCount; i++) {
			System.out.print((i+1) + ") ");
			wordList[i].printWord();
		}
		System.out.println("========");
		
	}
// 모든 영단어와 뜻 출력
	public void print() {
		System.out.println("=========");
		for(int i=0; i<wordListCount; i++) {
			wordList[i].print();
			System.out.println("===========");
		}
	}
	
	// 영단어 검색 시 해당 영단어와 뜻을 출력
	
	public void serach(String title) {
		int index = indexOf(title);
		
		if(index == -1) {
			System.out.println("없는 단어");
			return;
		}
		System.out.println("=========");
		wordList[index].print();
		System.out.println("=========");
	}
	
	public void searchInt(int num) {
		System.out.println("=========");
		wordList[num-1].print();
		System.out.println("=========");
	}
	
	// 1. 영단어 추가

	public void addVoca(VocaWord w) {
		if(wordListCount == MAX) {
			System.out.println("저장할 용량이 없습니다.");
			return;
		}
		
		wordList[wordListCount++] = new VocaWord(w);
	}
	
	public void addVoca(String title, String meaning) {
		if(wordListCount == MAX) {
			System.out.println("저장할 용량이 없습니다.");
			return;
		}
		int index = indexOf(title); //있는단어인지 없는지 탐색
		
		if(index ==-1) {
			wordList[wordListCount++] = new VocaWord(title,meaning);
			return;
		}
		
		
		// 있는 단어면 뜻 추가 
		wordList[index].addMeaning(meaning);
		
	}
	
	// 2. 단어 삭제
	/** 매개변수 : Word
	 *  리턴타입 : void
	 *  메서드명 : 
	 */
	public void deleteVoca(String title) {
		int index = indexOf(title);

		if (index == -1) {
			System.out.println("단어장에 없는 단어입니다.");
			return;
		}
		// 0번째 단어장 , 1번째 단어장 , 2번째 단어장.... 카운트는 3 
		for(int j= index; j<wordListCount-1; index++) {
			wordList[index] = wordList[index+1];
			
		}
		wordList[wordListCount-1] = null;
		wordListCount--;

	}
	
	
	// 3. 단어 수정 
	/**  1. 영어단어를 수정하고 싶을 때 "사과" = > "바나나"
	 * 
	 *   2. 뜻 meaning : 1 = > meaning : 2
	 *   
	 *   3. 특정 뜻만 삭제하고 싶을 때 
	 *   
	 */
	
	// 영어 단어를 수정 
	public void fixTitle(String title, String fixedtitle) {
		int index = indexOf(title);
		if(index == -1) {
			System.out.println("없는 영단어라 수정 불가");
			return;
		}
		wordList[index].setTitle(fixedtitle); // wordList[index]에 저장된 영단어를 다른 영단어로 변경
		System.out.println("수정 완료.");
	} 
	
	// 뜻 추가
	public void addMeaning(int num, String meaning) {
		wordList[num-1].addMeaning(meaning);
		System.out.println("========");
		System.out.println("추가 완료");
		System.out.println("========");
		
	}
	// 해당 번지의 뜻 변경
	public void fixMeaning(int num, int Meaningnum , String meaning) {
		this.wordList[num-1].updateMeaning(Meaningnum, meaning);
		System.out.println("========");
		System.out.println("수정 완료");
		System.out.println("========");
	}
	
	// 해당 번지의 뜻 삭제
	public void deleteMeaning(int num) {
		this.wordList[num-1].deleteMeaning(num);
		System.out.println("========");
		System.out.println("삭제 완료");
		System.out.println("========");
	}
	
	// 영단어를 검색 시 WordList 몇번째 순서에 저장되어있는지 확인하는 메서드
	public int indexOf(String title) {
		// 단어장에 등록된 단어들을 조회
		for(int i=0; i<wordListCount; i++) {
			if(wordList[i].getTitle().equals(title)) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	
	
	
	
	
	
}
