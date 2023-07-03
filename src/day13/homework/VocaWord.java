package day13.homework;

	// 단어 1개에 여러 뜻을 구현하는 클래스
public class VocaWord {
	
	private String title; 	  //영어 단어
	private String[] meanings; //단어의 뜻
	private int meaningCount; //단어의 index번째 뜻
	
// 생성자 
	public VocaWord(String title, String meaning){
		this.title = title;
		this.meanings = new String[5];
		this.meanings[meaningCount++] = meaning;
	}
	
	public VocaWord(String title) {
		this.title = title;
		this.meanings = new String[5];
	}
	
	// 복사 생성자(깊은복사를 위해)
	public VocaWord(VocaWord w) {
		this.title = w.title;
		this.meanings = new String[5];
		for(int i=0; i<w.meaningCount; i++) {
			meanings[i] = w.meanings[i];
		}
		meaningCount = w.meaningCount;
	}
	
// 메서드
	
	// 뜻을 추가하는 메서드
	public void addMeaning(String meaning) {
		if(meaningCount == this.meanings.length) {
			System.out.println("단어추가 불가");
			return;
		}
		this.meanings[meaningCount] = meaning;
		meaningCount++;
	}
	// 뜻을 변경하는 메서드
	public boolean updateMeaning(int count, String meaning) {
		if(count > this.meaningCount || count <=0) {
			System.out.println("입력번호 오류 ");
			return false;
			
		}
		this.meanings[count-1] = meaning;
		System.out.println(count + ". meaning 변경 완료");
		return true;
		
	}
	
	
	// 뜻을 제거하는 메서드
	public void deleteMeaning(int num) {
		
		if(num > meaningCount || num < 1) {
			System.out.println("잘못된 숫자 입력");
			return;
		}
		
		for(int i= num-1; i<meaningCount-1; i++) {
			meanings[i] = meanings[i+1];
		}
		
		meanings[meaningCount-1] =null;
		meaningCount--;
		System.out.println("=========");
		System.out.println("삭제 완료");
		System.out.println("=========");
	}

	// 영단어와 뜻을 출력하는 메서드
	/**
	 * 
	 */
	public void printWord() {
		System.out.print(title + " ");
	}
	public void print() {
		System.out.println("영단어 : " + title );
		for(int i=0; i<meaningCount; i++) {
			System.out.println((i+1) + ") " + meanings[i]);
		}
	}
	
	// 뜻을 검색해서 있으면 true 없으면 false
	public boolean isContainMeaning(String meaning) {
		for(int i=0; i<meaning.length(); i++) {
			if(meaning.equals(meanings[i])) {
				return true;
			}
		}
		System.out.println("============");
		System.out.println("없는 단어입니다.");
		System.out.println("============");
		return false;
		
	}
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

}
