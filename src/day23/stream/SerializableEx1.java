package day23.stream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

public class SerializableEx1 {
	public static void main(String[] args) {
		Student std1 = new Student(1,1,1,"Hong");
		Student std2 = new Student(1, 1, 2, "Lim");
		try( // ObjectOutputStream : 보조스트림  , ObjectOutputStream : 기반 스트림
			FileOutputStream fos = new FileOutputStream("student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);	){
				oos.writeObject(std1);
				oos.writeObject(std2);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		List<Student> list = new ArrayList<>();	
		try(ObjectInputStream ois 
				= new ObjectInputStream(new FileInputStream("student.txt"))){
				while(true) {
					Student tmp = (Student) ois.readObject();
					list.add(tmp);
				}
				
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}catch(EOFException e) {
			System.out.println("file read complete");
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(list);
		
		
	}

}

@Data
@AllArgsConstructor
class Student implements Serializable{

	private static final long serialVersionUID = -9017922024014601271L;

	private int grade, classNum, num;
	private String name;
	
}
