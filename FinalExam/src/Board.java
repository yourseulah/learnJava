// 2021/12/31
// 게시판 클래스 응용
// Board 클래스
// 속성 : 번호, 제목, 작성자 
// 행동 : get, set 메서드 만으로 특히 처리하는 내용없음

public class Board {
	private int bNum;
	private String bSubject;
	private String bName;
	
	//생성자
	public Board() {
		
	}
	
	//오버로딩된 생성자
	public Board(int bNum, String bSubject, String bName) {
		this.bNum = bNum;
		this.bSubject = bSubject;
		this.bName = bName;
	}
	
	//get, set 메서드ㄴ
	public int getBNum() {
		return bNum;
	}
	
	public void setBNum(int bNum) {
		this.bNum = bNum;
	}
	
	public String getBSubject() {
		return bSubject;
	}
	
	public void setBSubject(String bSubject) {
		this.bSubject = bSubject;
	}
	
	public String getBName() {
		return bName;
	}
	
	public void setBName(String bName) {
		this.bName = bName;
	}
	
	
}
