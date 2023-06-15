package day12.practice;

public class VocabularyNoteTest {
	public static void main(String[] args) {
		Word wordList[] = {
				new Word("abc"),
				new Word("def","def is def")
		};
		VocabularyNote note = new VocabularyNote(wordList);
		note.print();

	}

}
