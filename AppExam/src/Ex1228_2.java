// 2021/12/28 
// try - catch - finally pg495

import java.io.*; //input + output = io
public class Ex1228_2 {

	public static void main(String[] args) {
		// 컴파일러에 의해 체크되는 예외
		FileInputStream fis = null; // try 블럭 외부에서도 사용가능
									// fis를 전역변수로 바꾸기 위해 try안(지역변수가 되버리기 때문에)에서 직접 안하고
									// 바깥에서 선언만하고 안에서 객체 생성(이 순간이 예외처리체크부분이므로)
		
		try {
			fis = new FileInputStream("a.txt");
			//FileInputStream fis = new FileInputStream("a.txt"); // 블럭안에서 - 예외처리를 반드시 해야함
			//이부분은 정상처리되는 영역
			//리소스 종료 처리 - finally 로 한번에
		} catch (Exception e) {
			System.out.println(e);
			//비정상 종료 영역
			//여기에도 리소스 종료 처리 - finally 로 한번에
		} finally  { //항상 처리될 영역
			//최종처리할 공통의 내용 작성 
			//예외처리 해야함
			if (fis !=null) { //객체가 열려있다면
				try {
					fis.close();
				} catch (Exception ex) {
				// System.out.println(ex);
				ex.printStackTrace(); //예외관련 내용 출력 - 위와같다
			}
		}
		System.out.println("완료부분입니다.");

	}

}
	
}

