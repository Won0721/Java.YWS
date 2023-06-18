package studentmanage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 학생전체 조회, 정보추가, 정보수정, 정보제거, 이름 나이 학년이 일치하는 학생 인덱스 조회
// 종료

public class StudentManagementService {
	private Scanner sc = new Scanner(System.in);
	private List<Student> stdList = new ArrayList<Student>();

	
	public void displayMenu() {
		int sel = 0;
		
		do {
			System.out.println("======== 학생 관리 프로그램 ========");
			System.out.println("1. 학생 전체 조회");
			System.out.println("2. 학생 정보 추가");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 학생 이름 검색");
			System.out.println("6. 이름, 나이, 학년이 일치하는 학생 인덱스 조회");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >>");
			
			sel = sc.nextInt();
			sc.nextLine();
			
			switch(sel) {
			case 1: selectAll(); break;
			case 2: addStudent(); break;
			case 3: updateStduent(); break;
			case 4: deleteStudent(); break;
			case 5: searchStudentName(); break;
			case 6: selectIndex(); break;
			case 0: System.out.println("프로그램 종료"); break;
			default : System.out.println("메뉴에 있는 번호만 입력해주세요");
			
			
			}
			System.out.println();
		}
		while(sel != 0);
	}
	
	private Student inputStudent() {
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		return new Student(name, age, grade);
	}

	private void selectAll() {
		System.out.println("[학생 전체 조회]");
		
		if(stdList.isEmpty()) {
			System.out.println("입력된 학생 정보가 없습니다.");
		}
		else {
			for(int i =0; i< stdList.size(); i++) {
				Student s = stdList.get(i);
				
				System.out.printf("%d번 %s %d세 %d학년 \n", i+1, s.getName(), s.getAge(), s.getGrade());
			}
		}
	}
	
	private void addStudent() {
		System.out.println("[학생 정보 추가]");
		stdList.add(inputStudent());
	}
	private void updateStduent() {
		System.out.print("수정할 학생의 인덱스 번호 입력 : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		if(stdList.isEmpty()) {
			System.out.println("입력된 학생 정보가 없습니다.");
		}
		else {
			if(index<0) {
				System.out.println("음수는 입력할 수 없습니다.");
			}
			else {
				if(index < stdList.size()) {
					stdList.set(index-1, inputStudent());
				}
				else {
					System.out.println("index가 존재하지 않음");
				}
			}
		}
		
	}
	
	private void deleteStudent() {
		System.out.println("[학생 정보 제거]");
		
		System.out.print("삭제할 학생의 인덱스 번호 입력 : ");
		int index = sc.nextInt();
		sc.nextLine();
		if(!stdList.isEmpty()) {
			if(index>=0) {
				if(index<stdList.size()) {
					stdList.remove(index-1);
					System.out.println("삭제 되었습니다.");
				}
				else {
					System.out.println("index가 존재하지 않음.");
				}
				
			}else {
				System.out.println("음수는 입력할 수 없습니다.");
			}
		}else {
			System.out.println("입력된 학생 정보가 없습니다.");
		}
		
	}
	
	private void searchStudentName() {
		System.out.print("검색할 학생 이름 입력 : ");
		String searchName = sc.nextLine();
		
		if(!stdList.isEmpty()) {
			boolean flag = true; // 검색결과 존재 여부
			
			for(int i=0; i<stdList.size(); i++) {
				if(searchName.equals(stdList.get(i).getName())) {
					
					System.out.println("조회 시 출력 번호 : " + (i + 1));
					System.out.println(stdList.get(i));
					flag = false;
				}
				
				
			}	
			if(flag) {
				System.out.println("존재하지 않는 학생입니다.");
			}
		}
		else {
			System.out.println("입력된 학생 정보가 없습니다.");
		}
	}
	
	private void selectIndex() {
		System.out.println("[이름, 나이, 학년이 일치하는 학생 조회");
		Student std = inputStudent();
		
		boolean flag = true;
		
		for(int i = 0; i <stdList.size(); i++) {
			Student s = stdList.get(i);
			
			if(s.getName().equals(std.getName())
					&& s.getAge() == std.getAge()
					&& s.getGrade() == std.getGrade()) {
				System.out.println("존재하는 학생입니다.");
				System.out.println("저장된 인덱스 번호 : " + i);
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("일치하는 학생이 존재하지 않습니다.");
		}
		
		
		
		
	}
}

class Student{
	String name = "";
	int age;
	int grade;
	
	public Student() {
		this.name = "";
		this.age = 20;
		this.grade = 1;
	}
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}


