package day18.homework;

import java.util.Scanner;

public class ImgEx {
	/* 파일명을 입력받아 파일이 이미지인지 확인하는 코드를 작성
	 *  jpg. bmp, png 이미지 확장자
	 *  input : dog.jpg
	 *  dog.jpg : Image
	 *  
	 *  input : dog.exe
	 *  
	 *  output
	 *  dog.exe : Not image
	 */
	public static void main(String[] args) {
		boolean result;
		String input = "dog.jpg";
		Scanner sc = new Scanner(input);
		
		if(input.contains("jpg") || input.contains("bmp") || input.contains("png")) {
			System.out.println(input + " : image" );
		}
		else {
			System.out.println(input + " : not image");
		}
		
		
		
	}

}
