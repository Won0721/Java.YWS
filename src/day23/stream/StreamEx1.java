package day23.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StreamEx1 {
	public static void main(String[] args) {
		
		FileInputStream fis = null; 
		/*1
		try {
			//test.txt는 상대 경로, 기준은 프로젝트 폴더
			fis = new FileInputStream("test.txt");
		}catch (FileNotFoundException e) {
			System.out.println("file not found");
		}finally {
			// 프로그램 종료 전에 사용 했던 파일을 닫아주는 작업
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}*/
		
		// 위의 코드(수동으로 닫는 코드)를 줄인 코드 
		// try() 리소스는 괄호안에 썼던 파일을 자동으로 닫아줌
		
		// 문자열 '1'이 4바이트로 저장된다면
		// 00000000 00000000 00000000 00110001
		// FileInputStream 바이트단위로 읽어오기에 한글이 깨질수 있음
/*		try(FileInputStream fis2 = new FileInputStream("test.txt"); ){
			int data;
			while((data = fis2.read()) != -1) {
				// 문자를 읽어와서 정수값을 반환
				// char로 형변환 할 경우 문자로 변경해옴
				// 한글은 2바이트로 표현됨
				System.out.print((char)data + " ");
			}
		}catch(FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println(1);
		System.out.println('1');
		System.out.println((int)'1'); // 문자 1은 정수로 49
		*/
		
		//파일을 쓰는 예제
		Scanner sc = new Scanner(System.in);
		try(FileOutputStream fos = new FileOutputStream("test.txt")){
			for(int i=0; i<5; i++) {
				System.out.println("input :");
				char ch = sc.next().charAt(0);			
				fos.write(ch);
			}
		
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
