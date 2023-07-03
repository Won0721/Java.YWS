package day23.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InputStreamEx1 {
	public static void main(String[] args) {
		// 파일에 쓰인 값 전부를 읽어서 출력하는 코드 작성
		// 파일명은 output1.txt
		try(FileInputStream fis = new FileInputStream("output1.txt")){
			int data;
			do {
				data = fis.read();
				if(data ==-1) {
					break;
				}
				System.out.print(data);
			}while(true);
			System.out.println("File reader success!");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try(
				FileInputStream fis = new FileInputStream("output2.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			System.out.println(ois.readLine());
				for(int i= 1; i<=10; i++) {
					System.out.println(ois.readInt()); // 정수형으로 출력됨
					// object스트림 유의사항 
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		

		

	}

}
