package day27.attendance.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import lombok.Data;

@Data
public class AttendanceBook implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = -8626810148394081381L;
	List<Attendance> list = new ArrayList<>();
	List<Student> stdList = new ArrayList<>();
	
	// 이미 등록된 학번이면 등록 실패 : 학생 클래스가 학번을 통해서 같은지 확인할수 있어야함.
	public boolean insertStudent(Student s) {
		if(stdList.contains(s)) {
			return false;
		}
		// 학생 추가
		stdList.add(s);
		// 학번 순으로 정렬
		Collections.sort(stdList,(o1,o2)->{
			// 문자열 비교 compareTo
			return o1.getNum().compareTo(o2.getNum());
			
		});
		System.out.println(stdList);
		return true;
		
	}
	// 학생 정보 출력

	public boolean insertAttendance(Attendance attendance) {
		// 이미 등록된 출석기록이면 등록 실패 
		if(list.contains(attendance)) {
			return false;
		}
		list.add(attendance);
		// 날짜순, 학번순으로 정렬
		Collections.sort(list, (o1,o2) -> {
			// 날짜가 같으면 학번순으로 정렬
			if(o1.getDate().equals(o2.getDate())) {
				return o1.getStudent().getNum().compareTo(o2.getStudent().getNum());			
			}
			// 날짜가 다르면 날짜순으로 정렬
			return o1.getDate().compareTo(o2.getDate());
		});
		return true;
	}

	public void printAttendance() {
		// 출석기록이 없을 경우
		if(list.size() == 0) {
			System.out.println("등록된 출석기록이 없음");
			return;
		}
		// 첫 출석 체크 정보의 날짜를 문자열로 가져옴
		String dateStr = "";
		for(Attendance tmp : list) {
			if(!dateStr.equals(tmp.getDateStr())) {
				System.out.println(tmp.getDateStr());
				dateStr = tmp.getDateStr();
			}
			System.out.println(tmp);				
		}
		
	}
	

	

	
	


}
