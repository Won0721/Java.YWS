package day27.ioStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// 문자 스트림
public class CharIOStreamEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문자 단위로 읽어오는 예제
		try(FileReader fr = new FileReader("file.txt")){
			char[] buf = new char[1024];
			while(fr.read(buf) != -1) {
				System.out.println(buf);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		} catch (IOException e) {
			System.out.println("Exception");
		}
		// FileWriter 생성자(파일명, 이어쓰기 여부) 
		// FileWriter(파일명) : 이어쓰기 여부가 false로 설정
		try(FileWriter fw = new FileWriter("file.txt", true)){
			String str = "Hello World\n";
			
			String str2 = "Hi, Java\n";
			fw.write(str);
			fw.write(str2);
		} catch (IOException e) {
			System.out.println("Exception");
		}
		
	}

}
