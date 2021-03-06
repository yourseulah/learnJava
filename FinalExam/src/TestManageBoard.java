// 2021/12/31
// 글 추가 및 삭제 테스트 

public class TestManageBoard {

	public static void main(String[] args) {
		
	// Board클래드에 오버로딩 생성자 만들었을때 하기로 가능
//	ManageBoard board = new ManageBoard() ; //객체생성 
//	board.addBoard(new Board(1, "맑음" , "슬아"));
//	board.addBoard(new Board(2, "흐림" , "슬기"));	
//	board.addBoard(new Board(3, "폭우" , "슬비"));	
//	board.showAllBoard();
//
//	System.out.println("--------------------------------------");
//	board.removeBoard(1); //ManageBoard클래스에서 removeBoard메서드를 bNum객체로만 정의해놓았기 때문에
//	board.showAllBoard();
//	
//	System.out.println("--------------------------------------");
//	board.addBoard(new Board(1, "맑음" , "슬아"));
//	board.showAllBoard();
//	
//	System.out.println("--------------------------------------");
//	board.removeBoard("슬아");
//	board.showAllBoard();
//	    
//	}
	
	//오버로딩된 생성자 없이 set으로서 추가하는 방법
	//생성자로 안하는이유는 처음에 데이터가 비워져 있을수 있기 때문에
	
	ManageBoard boardList = new ManageBoard();
	
	//boardList 배열에 추가를 하기위해 
	//Board클래스 객체를 생성해야한다 
	//그곳에 set으로 데이터 입력
	//boardList에 Board 객체를 추가 
	//이 작업을 3번에 걸쳐서 한것이다. 
	
	Board b1 = new Board();
	b1.setBNum(1);
	b1.setBSubject("안녕하세요.");
	b1.setBName("홍길동");
	boardList.addBoard(b1);
	
	Board b2 = new Board();
	b2.setBNum(200);
	b2.setBSubject("반갑습니다.");
	b2.setBName("김삿갓");
	boardList.addBoard(b2);
	
	
	Board b3 = new Board();
	b3.setBNum(3);
	b3.setBSubject("안녕하세요.");
	b3.setBName("을지문덕");
	boardList.addBoard(b3);
	
	boardList.showAllBoard();
	System.out.println("--------------------------------------");
	boardList.removeBoard(200);
	boardList.showAllBoard();
	
	//웹브라우저에서 입력하면 여기서전달되어 오면 디자인한대로 처리
	
	}
}
