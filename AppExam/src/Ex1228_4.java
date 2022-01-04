// 2021/12/28 
// 문자단위 스트림 pg536 
// 한글파일도 처리가능한 FileReader 클라스로 변경

import java.io.*;

public class Ex1228_4 {

	public static void main(String[] args) {
		// 스트림 클래스 활용 (파일 읽기)
		FileReader fr = null;
		
		//예외처리
		try {
			fr = new FileReader("reader.txt"); // 파일열기 
			
			//파일 처리구간
			int i; // 읽은 바이트 값을 저장할 변수  
			while ((i = fr.read()) != -1) { //데이터를 읽으면 계속진행
											// 못읽으면 -1 반환, 탈출
				System.out.println((char)i);// 캐릭터타입으로 캐스팅, 바이트를 문자(한글은 에러)로 출력
											//영문자는 1바이트라 정상 처리 
											//한글은 유니코드여서 비정상 처리 - 바이트처리 안되는 구나
			}
			//파일 처리구간 여기까지 -----------
			
		} catch (Exception e) {
			System.out.println("1:" + e); //예외처리 단순 출력
			
		} finally {
			if(fr != null) { //파일이 오픈되었다면
				try {
					fr.close(); //파일 닫기 
				} catch (Exception ex) {
					System.out.println("2:" + ex);
				}
			}
		}

	}

}
