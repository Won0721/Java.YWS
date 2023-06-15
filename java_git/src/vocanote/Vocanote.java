package vocanote;

public class Vocanote {
	private Vocamade wordList[];
	private int wordCount; //wordList 인덱스 카운트
	
	public Vocanote() {
		wordList = new Vocamade[10];
	}
	public Vocanote(Vocamade wordList[]) {
		// 기존 단어장의 크기와 10을 비교해서 큰 수로 단어장 크기로 선택
		int size = wordList.length > 10 ? wordList.length : 10;
		this.wordList = new Vocamade[size];
		
		for(int i=0; i<wordList.length; i++) {
			this.wordList[i]=
		}
	}
	
	
}


class Vocamade{
	// 멤버변수.
	private String word;
	private String[] meaning;
	private int meaningCount;
	
	// 생성자
	
	public Vocamade(String Word, String meaning) {
		this.word = word;
		this.meaning = new String[5];
		this.meaning[meaningCount] = meaning;
		meaningCount++;
	}
	
	public Vocamade(String Word) {
		this.word = word;
		this.meaning = new String[5];
	}
	
	public Vocamade(Vocamade w) {
		this.word = w.word;
		this.meaning = new String[5];
		for(int i=0; i<w.meaningCount; i++) {
			meaning[i] = w.meaning[i];
		}
		meaningCount = w.meaningCount;
	}
	
	// 메서드 구현
	/* 영단어와 뜻을 출력하는 메서드
	 * 매개변수 없음
	 * 리턴타입 없음
	 * 메서드명 print
	 */
	public void print() {
		System.out.println("영단어 :" + word);
		System.out.println("뜻" );
		for(int i=0; i<meaningCount; i++) {
			System.out.println((i+1) + ". "+meaning[i]);
		}
	}
	
	/* 뜻을 추가하는 메서드
	 * 매개변수 : 추가될 단어의 뜻 ->String meaning
	 * 리턴타입 없음
	 * 메서드명 addMeaning
	 */
	
	public void addMeaning(String meaning) {
		// 해당 단어의 뜻[배열]이 다 찼으면 종료
		if(meaningCount == this.meaning.length) {
			return;
		}
		this.meaning[meaningCount] = meaning;
		meaningCount++;
		
	}
	
	/** 뜻을 제거하는 메서드
	 * 매개변수 : 제거할 뜻의 번호 => int num
	 * 리턴타입 : 없음
	 * 메서드명 : removeMeaning
	 */
	public void removeMeaning(int num) {
		// 저장되어있는 뜻[배열]의 크기보다 입력한 번호보다 크지 않으니 오입력
		if(num > meaningCount || num < 1) {
			System.out.println("오입력");
			return;
		}
		// 제거할 경우 중간 값에 인덱스가 비어서 당겨와서 덮어쓰기해야함
		/* ex) arr[0] = 뜻 1번  
		 * 	   arr[1] = 뜻 2번 
		 * 	   arr[2] = 뜻 3번 
		 * 	   arr[3] = 뜻 4번
		 * 	   저장되어있고 
		 * 	  2번째 뜻을 제거하고 싶다고 가정할때
		 * 
		 * 
		 */
		
		for(int i= num-1; i<meaningCount; i++) {
			meaning[i] = meaning[i+1];
		}
		// 뜻 2번 ( arr[1]의 값을 제거할 경우 )
		meaning[meaningCount-1] = null;
		meaningCount--;
		
	}
	
	
	
}
