package day24.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientEx1 {
	public static void main(String[] args) {
		int port = 5001; // 서버 포트번호
		
		try(Socket socket = new Socket();){
			// 2. 연결 요청
			socket.connect(new InetSocketAddress(port));
			System.out.println("connect");
			// 3. 작업
			// 서버에 데이터 전송을 위해 OutputStream 생성
			OutputStream os = socket.getOutputStream();
			String str = "Hi"; // 보내려는 데이터
			byte [] bytes = str.getBytes(); // hi를 바이트로 변환
			os.write(bytes);
			os.flush();
			InputStream is = socket.getInputStream();
			int readCount = is.read(bytes);
			str = new String(bytes);
			System.out.println("Server : " + str);
			
			is.close();
			os.close();
		}catch(IOException e) {
			
		}
	}

}
