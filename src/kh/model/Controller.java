package kh.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class Controller {
	Food food = new Food();
	String fileName = "src/kh/model.txt";
	private Scanner sc = new Scanner(System.in);
	public void run() {
		
		System.out.print("과일 이름 : ");
		String name = sc.next();
		System.out.println("칼로리 :");
		int kcal = sc.nextInt();
		food.setName(name);
		food.setKcal(kcal);
		Food food = new Food(name,kcal);
		fileSave(fileName);
		
	}
	
	public void test() {
		fileLoad(fileName);
		
	}
	
	public void fileSave(String fileName) {
		try(FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));){
				oos.writeObject(food);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileLoad(String fileName) {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
			
			System.out.println(ois.readObject().toString());
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

