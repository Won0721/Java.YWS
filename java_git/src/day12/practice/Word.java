package day12.practice;


import java.util.Scanner;

import lombok.Data;


/* 한 단어를 관리하는 클래스
 * - 영단어 
 * - 뜻 들
 */
@Data // geeter , setter, toString, equals를 추가
public class Word{ // 

	// 멤버변수
	private String engWord;
	private String meaning[];
	private int meaningCount;
	// 생성자
	public Word(String engWord, String meaning) {
		this.engWord = engWord;
		this.meaning = new String[5]; // 기본 5개의 뜻 
		this.meaning[meaningCount] = meaning;
		meaningCount++;
	}
	public Word(String engWord) {
		this.engWord = engWord;
		this.meaning = new String[5]; // 기본 5개의 뜻 
	}
	public Word(Word w) { // 복사 생성자 (깊은복사를 위해)
		this.engWord = w.engWord;
		this.meaning = new String[5]; 
		for(int i=0; i<w.meaningCount; i++) {
			meaning[i] = w.meaning[i];
		}
		meaningCount = w.meaningCount;
	}
	
	//메서드
	/** 영단어와 뜻을 출력하는 메서드
	 *  매개변수 : 없음 
	 *  리턴타입 : 없음 = void
	 *  메서드명 : print
	 */
	public void print() {
		System.out.println("영단어 : "+ engWord);
		System.out.println("뜻 : ");
		for(int i =0; i<meaningCount; i++) {
			System.out.println((i+1) + ". " + meaning[i]+" ");								
		}
	}
	
	/** 뜻을 추가하는 메서드
	 *  매개변수 : 추가될 뜻 => String newMeaning
	 *  리턴타입 : 없음 = void
	 *  메서드명 : addMeaning
	 */
	
	public void addMeaning(String meaning) {
		// 배열이 다 찼으면 찼다는 출력 후 종료
		if(meaningCount == this.meaning.length) {
			System.out.println("단어 추가 불가");
			return;
		}
		this.meaning[meaningCount] = meaning;
		meaningCount++;
	}
	
	/** 뜻을 제거하는 메서드 
	 * 매개변수 : 제거할 뜻의 번호 => int num 
	 * 리턴타입 : 없음 void
	 * 메서드명 : removeMeaning
	 */
	public void removeMeaning(int num) {
		if(num > meaningCount || num <1) {
			System.out.println("작동 할수 없습니다. 오입력");
			return;
		}
		// num-1 의 인덱스부터 하나씩 당겨와서 덮어쓰기함.
		for(int i = num-1; i< meaningCount-1; i++) {
			meaning[i] = meaning[i+1];
		}
		// 마지막에 쓸모없는 데이터를 지움
		meaning[meaningCount-1] = null;
		// 제거 됐으면 뜻 개수를 하나를 줄임
		meaningCount--;
	}
	//getter
	public String getEngWord() {
		return engWord;
	}
	
	public void setEngWord(String engWord) {
		this.engWord = engWord;
	}
	/** 수정할 뜻의 번호와 수정할 뜻이 주어지면 뜻을 수정하고 수정 여부를 알려주는 메서드
	 * 매개변수 : 수정할 뜻의 번지, 수정할 뜻 = > int meaningNumber, String fixingMeaning
	 * 리턴타입 : boolean
	 * 메서드명 : updateMeaning
	 * @param meaningIndex
	 * @param fixingMeaning
	 * @return
	 */
	
	public boolean updateMeaning(int meaningNumber, String fixingMeaning) {
		// 수정할 뜻의 번지가 잘못된 경우
		if(meaningNumber > meaningCount || meaningNumber <= 0) {
			return false;			
		}
		// meaningNum은 1부터고 번지는 0부터 이기에 
		this.meaning[meaningNumber-1] = fixingMeaning;
		return true;
		
	}
	
	
	
}
