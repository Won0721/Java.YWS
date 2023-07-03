package day13.homework.run;

import day13.homework.controller.VocabularyNoteController;
import studentmanage.StudentManagementService;

public class Run {
	public static void main(String[] args) {
		VocabularyNoteController controller = new VocabularyNoteController();
		//controller.run();
		StudentManagementService st = new StudentManagementService();
		st.displayMenu();
	}

}
