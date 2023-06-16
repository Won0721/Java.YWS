package day12.practice;

public class VocabularyNote {
	
	private Word[] wordList;
	private int wordCount;
	
	
	public VocabularyNote() { // 
		wordList = new Word[10];
	}
	public VocabularyNote(Word[] wordList) {
		// 기존 단어장의 크기와 10을 비교해서 큰 수로 단어장 크기로 선택
		int size = wordList.length > 10 ? wordList.length : 10;
		
		this.wordList = new Word[size];
		
		for(int i= 0 ; i < wordList.length; i++) {
	
			this.wordList[i] = new Word(wordList[i]);
			 
		}
		wordCount = wordList.length;
	}
	
	// 메서드
	/** 단어들을 출력하는 메서드
	 *  매개변수 : 없음
	 *  리턴타입 : void
	 *  메서드 명 : print
	 */
	public void print() {
		System.out.println("=============");
		for(int i=0; i<wordCount; i++) {
			wordList[i].print();
			System.out.println("=============");
		}
	}
	
	/** 단어가 주어지면 단어장에 추가하는 메서드(단어 객체를 넘겨주는 경우)
	 *  매개변수 : 단어(단어객체) = > Word word
	 *  리턴타입 : 없음 => void
	 *  메서드명 : insert 
	 */
	public void insert(Word word) {
		// 단어장에 단어 다 차면 추가 불가
		if(wordCount == wordList.length) {
			System.out.println("VocabularyNote 단어장이 다 찼어요");
			return;
		}
		// 깊은 복사를 위해 Word의 복사 생성자를 이용하여 새 단어를 생성한 후 추가
		wordList[wordCount++] = new Word(word);
	}
//	/** 단어가 주어지면 단어장에 추가하는 메서드(단어와 뜻을 넘겨주는 경우)
//	 *  매개변수 : 단어와 뜻 String engWord, meaning 
//	 *  리턴타입 : 없음 = void
//	 *  메서드명 : insert 
//	 */
//	public void insert(String engWord, String meaning) {
//		// 단어장에 단어 다 차면 추가 불가
//		if(wordCount == wordList.length) {
//			System.out.println("VocabularyNote 단어장이 다 찼어요");
//			return;
//		}
//		// 단어와 뜻을 단어 객체를 생성한 후 단어장에 추가
//		wordList[wordCount++] = new Word(engWord, meaning);
//	}
	
	
	/** 단어가 주어지면 단어장에서 삭제하는 메서드
	 *  매개변수 : 삭제할 단어 = > String engword
	 *  리턴타입 : 없음 = > 
	 *  메서드명 : delete
	 */
	public void delete(String engWord) { // [0]단어1 , [1]단어2 = > count 2 값 
		// 단어가 어디있는지 찾아야함
		int index = indexOf(engWord);
		// 단어가 단어장에 없으면 알림메세지 출력 후 종료
		if(index == -1) {
			System.out.println("단어장에 없는 단어입니다.");
			return;
		}	
		// 찾은 위치부터 한칸씩 밀어줌
		for(int i = index; i< wordCount-1; i++) {
			wordList[i] = wordList[i+1];
		}
		// 단어의 개수를 하나 줄여줌
		wordCount--;
		// 마지막 단어를 비워줌
		wordList[wordCount] = null;
	}


	/** 단어가 주어지면 단어가 있는 위치를 알려주는 메서드
	 *  해당하는 단어가 없으면 -1 리턴
	 *  매개변수 : 단어 = > String engWord
	 *  리턴타입 : 위치 = > 번지 = > int 
	 *  메서드명 : indexOf
	 */
	public int indexOf(String engWord) {
		// 단어장에 등록된 단어들을 조회
		for(int i=0; i<wordCount; i++) {
			// 단어아 같으면 i번지를 리턴
			if(wordList[i].getEngWord().equals(engWord)) {
				return i;
			}
			
		}
		// 여기까지 오면 일치하는 단어가 없는 경우이므로 -1을 리턴
		return 0;
	}
	
	/** 단어가 주어지면 단어장에 해당 단어를 출력하는 메서드
	 *  매개변수 : 단어 => String engWord
	 *  리턴타입 없음
	 *  메서드명 : serach
	 */
	public void search(String engWord) {
		int index = indexOf(engWord);
				
		if(index == -1) {
			System.out.println("없는단어");
			return;
		}
		wordList[index].print();
	}
	
	/** 단어와 뜻이 주어졌을 때 없는 단어이면 새로 단어를 추가하고
	 *  있는 단어이면 뜻만 새로 추가하는 메서드
	 *  매개변수 :
	 *  리턴타입 :
	 *  메서드명 :
	 */
	public void insert(String engWord, String meaning) {
		// 단어장에 단어 다 차면 추가 불가
		if(wordCount == wordList.length) {
			System.out.println("VocabularyNote 단어장이 다 찼어요");
			return;
		}
		int index = indexOf(engWord);
		//없는 단어면 새 단어로 추가
		if(index == -1) {
			wordList[wordCount++] = new Word(engWord, meaning);			
			return;
		}
		// 있는 단어면 뜻을 추가
		wordList[index].addMeaning(meaning);
		
	}
	
	/** 단어와 수정할 뜻의 번호와 수정할 뜻이 주어지면 단어의 뜻을 수정하는 메서드
	 * 매개변수 : 단어, 수정할 뜻의 번호 = > String engWord, int meaningIndex, String fixingMeaning 
	 * 리턴타입 : 없음 = void
	 * 메서드명 : updateMeaning
	 */
	public void updateMeaning(String engWord, int meaningIndex, String fixingMeaning) {
		int index = indexOf(engWord);
		if(index == -1) {
			System.out.println("없는단어");
			return;
		}
		if(!wordList[index].updateMeaning(meaningIndex, fixingMeaning)){
			System.out.println("잘못된 넘버");
		}
		
		
	}
	
	/* 단어와 수정할 단어가 주어지면 단어를 수정하는 메서드
	 * 매개변수 : 단어와 수정할 단어 => String engWord , String updateEngword
	 * 리턴타입 : 없음 => void
	 * 메서드명 updateEngWord
	 * 
	 */
	public void updateEngWord(String engWord, String updateEngword) {
		int index = indexOf(engWord);
		if(index==-1) {
			System.out.println("없는단어");
			return;
		}
		
		wordList[index].setEngWord(updateEngword);
	}
}
