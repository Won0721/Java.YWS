package day12.practice;

public class VocabularyNoteEx2 {
	public static void main(String[] args) {
		
		Word[] wordList = {
				new Word("abc"),
				new Word("def", "def is define")
		};
		VocabularyNote note = new VocabularyNote(wordList);
		System.out.println("프린트 한번");
		note.print();
		
		Word word = new Word("a","a");
		note.insert(word);
		System.out.println("=======프린트 2번 ");
		note.print();
		
		note.insert("b", "b is b");
	//	note.print();
		
		note.delete("c");
		note.delete("a");
	//	note.print();
		
		note.search("a");
		note.search("b");
		
		note.insert("b","b");
		note.print();
		
		note.updateEngWord("b", "B");
		note.updateEngWord("b", "B");
	}

}
