//15-7 그외 입출력 클래스 pg557

import java.io.*;
public class Ex1231_2 {

	public static void main(String[] args) {
		// 파일관련 메타정보를 확인하기 위한 코드작성 = 파일자체 특성 확인
		File file = null;
		try {
			//file = new File ("C:\\myWorkSpace\\learnJava\\AppExam\\writer.txt");// 실제존재하는 파일의 정보를 확인하는 거니까 
			//file = new File ("C:\\myWorkSpace\\learnJava\\AppExam"); //directory 자체로도 경로확인이나 파일이냐 등도 확인가능 
			file = new File ("C:\\myWorkSpace\\learnJava\\AppExam\\newFile.txt");
			file.createNewFile(); // 빈(0바이트) 파일을 생성한다. 
			
			System.out.println(file.getName());
			System.out.println(file.isFile()); //파일이냐
			System.out.println(file.isDirectory());//디렉토리이냐 
			System.out.println(file.exists()); // 특정파일 존재여부 확인 true or false
			System.out.println(file.getPath()); //절대경로로 
			System.out.println(file.getTotalSpace()); // 저장 공간에 대한 정보 
			
			file.delete(); // 파일 삭제
			
		} catch (Exception e) {
			
		} finally {
			//내용을 접근할때는 close가 꼭 있어야 한다.
			//여기서는 메타정보를 확인만 하는거니까 
		} 
	}

}
