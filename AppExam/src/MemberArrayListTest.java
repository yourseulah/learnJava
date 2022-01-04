
//ArrayList 활용하기 pg411

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memList = new MemberArrayList();
		Member m1 = new Member(100, "홍길동");
		Member m2 = new Member(200, "김삿갓");
		Member m3 = new Member(300, "이도령");
		Member m4 = new Member(400, "이순신");
		Member m5 = new Member(500, "강감찬");
		memList.addMember(m1);
		memList.addMember(m2);
		memList.addMember(m3);
		memList.addMember(m4);
		memList.addMember(m5);		
		memList.showAllMember();
		
		//멤버 300 삭제성공
		memList.removeMember(300);
		memList.showAllMember();
		
		//remove는 true or false값
		System.out.println(memList.removeMember(100));
		System.out.println(memList.removeMember(600));
		
		//멤버 600 삭제실패
		if (memList.removeMember(600) == true) {
			System.out.println("삭제성공");
		} else {
			System.out.println("삭제실패");
		}
		memList.showAllMember();
		
		//클라스쪽은 깔끔하고 심플하게 - 실행문넣지 않는다. 
		//여기서 모든 테스트

		//멤버 홍길동 추가 
		memList.addMember(m1); //삭제를 하더라도 객체는 남아 있음?
		memList.showAllMember();
		
		//멤버 홍길동 삭제
		memList.removeMember("홍길동");
		memList.showAllMember();
		
		System.out.println(memList.removeMember("홍길동"));
		if(memList.removeMember("홍길동")) {
			System.out.println("삭제성공");
		} else {
			System.out.println("삭제실패");
		}
		
		
		
	}
	
	
	

}
