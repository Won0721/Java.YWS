package day22.homework.studentmanager.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Student {
	private int grade, classNum, num, phone;
	private String name;
}
