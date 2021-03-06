// 15-4 문자단위 스트림
// Writer pg 538

import java.io.*;

public class Ex1231_1 {

	public static void main(String[] args) {
		// Window > Preference > General > Workspace > text file encoding : Utf-8
		//파일에 쓰기 
		FileWriter fw = null;
		try {
			// 예외 발생가능성이 있는 문장
			// 파일처리, 네트워크, 데이터writer.txt베이스 
			fw = new FileWriter(""); //저장된 파일 생성 (있으면 덮어쓰고, 없으면 생성)
			// C:\myWorkSpace\learnJava\AppExam 에서 생성된 .txt 파일 확인 가능 
			fw.write('B'); //단일문자
			fw.write("안녕\n"); //스트링
			char buf [] = {'C', 'D', 'E', '\n'}; //문자배열
			fw.write(buf); //문자배열 출력
			fw.write("자바프로그래밍");// 줄바꿈 문자 :  \n 를 확인하기 위한 출력
			
			
		} catch (Exception e) {
			
			
		} finally {
			if(fw !=null) { //열린거니까
				try {
					fw.close(); //파일닫기
				} catch (Exception ex) {
					
				}
				System.out.println("파일 출력이 완료되었습니다.");
			}
			
		}

	}

}
