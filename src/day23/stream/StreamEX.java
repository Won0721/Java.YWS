package day23.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class StreamEX {

	
	
	/* InputStream 바이트 입력 스트림의 최상위 클래스
	 * OutputStream 바이트 출력 스트림의 최상위 클래스
	 * 
	 * Reader 문자 입력 스트림의 최상위 클래스
	 * Writer 문자 출력 스트림의 최상위 클래스
	 * 
	 * 
	 * 
	 * FileInputStream 파일 대상 바이트 입력 스트림 생성
	 * FileOutputStream 파일 대상 바이트 출력 스트림 생성
	 * 
	 * FileReader 파일 대상 문자 입력 스트림 생성
	 * FileWriter 파일 대상 문자 출력 스트림 생성
	 * 
	 */
	
	public static void main(String[] args) {
		
		try(Reader in = new FileReader("day2.변수.txt")){
			int ch;
			
			while(true) {
				ch = in.read();
				
				if(ch == -1) {
					break;

				}
				System.out.print((char)ch);
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
