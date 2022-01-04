// 2021/12/28
// 바이트처리 클래스 (FileInputStream) 사용
// 영문과 숫자 또는 특수문자로 구성된 파일을 읽어 화면에 출력
// System.out.print() 사용해서 출력
// 파일명은 test.txt 
// 파일의 내용은 최소 3라인 이상 

import java.io.*;
public class Ex1228_5 {

	public static void main(String[] args) {
		// 스트림 클래스 활용 (파일읽기)
		FileInputStream fis = null;
		
		//예외처리
		try {
			fis = new FileInputStream("test.txt"); //파일열기
			
			//파일처리 구간
			int i;
			while ((i=fis.read()) != -1) { //데이터를 읽으면 계속진행
											// 못읽으면 -1 반환, 탈출
				System.out.println((char)i); // 캐릭터타입으로 캐스팅, 바이트를 문자출력
			}
			
		} catch (Exception e) {
			System.out.println("1:" + e); //예외처리 단순 출력
			
		} finally { 
			if(fis != null) { // 파일이 오픈되었다면
				try {
					fis.close(); // 파일 닫기
				} catch (Exception ex) {
					System.out.println("2:" + ex);
				}
			}
			
		}

	}

}
