// 2021/12/31
// 게시판 클래스 응용
// ManageBoard클래스 (다형성 X)
// 추가 (번호, 제목, 작성자 - Board객체로 해서)
// 삭제 (번호로)전체 출력

import java.util.*;

public class ManageBoard {
	ArrayList<Board> boardList;
	public ManageBoard() {
		boardList = new ArrayList<Board>();
	}
	
	//추가 (번호, 제목, 작성자 - Board객체로 해서)
	public void addBoard(Board board) {
		boardList.add(board);
	}
	
	// 삭제 전체 출력 - 보통 번호를 가지고 삭제를 하니까 
	public boolean removeBoard(int bNum) {
		for(Board tmp : boardList) {
			if (tmp.getBNum() == bNum) {
				boardList.remove(tmp);
				return true;
			}
		}
		return false;
	}
	
	// remove메서드 오버로딩
	// 삭제 전체 출력 - 이름으로 삭제 시도
	public boolean removeBoard(String bName) {
		for(Board tmp : boardList) {
			if (tmp.getBName().equals(bName)) {
				boardList.remove(tmp);
				return true;
			}
		}
		return false;
	}
	
	//갱신
//	public boolean removeBoard(int bNum) {
//		for(Board tmp : boardList) {
//			if (tmp.getBNum() == bNum) {
//				boardList.remove(tmp);
//				
//				Board aaa = new Board();
//				aaa.setBNum(기존내용);
//				aaa.setBName(기존내용);
//				aaa.setBSubject(갱신할내용);
//				boardList.set(2, aaa);
//				
//				return true;
//			}
//		}
//		return false;
//	}
	
	
	public void showAllBoard() {
		for(Board tmp : boardList) {
			System.out.print(tmp.getBNum() + " : ");
			System.out.print(tmp.getBSubject() + " : ");
			System.out.println(tmp.getBName());
			
		
		//print : 줄바꿈안하고 
		//println : 줄바꿈하고
		}
	}
	
}
