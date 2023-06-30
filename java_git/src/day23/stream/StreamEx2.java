package day23.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StreamEx2 {
	public static void main(String[] args) {
		
		// 파일에 문자들을 씀
		// 쓰기모드는 덮어쓰기 때문에 파일이 없으면 만들어서 쓰면되서 
		// FileNotFoundException 오류가 없다
		try(FileWriter fw = new FileWriter("test.txt")){
			for(int i = 0; i < 5; i++) {
				fw.write("안녕하세요"+i+"\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//파일에 쓰여 있는 문자들을 읽어옴
		try(FileReader fr = new FileReader("test.txt")){
			char[] ch = new char[10];
			int len;
		
//			while(( fr.read(ch) ) != -1) {
//				System.out.println(ch);
//			}
//			
			while((len = fr.read(ch)) != -1 ) {
				for(int i=0; i<len; i++) {
					System.out.print(ch[i]);
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
