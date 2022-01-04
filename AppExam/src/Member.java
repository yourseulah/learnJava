// 2021/12/24
// 12-2 컬렉션 프레임 워크 
// Member 클라스 구현하기 pg407 


public class Member {
	private int memberId;
	private String memberName;
	public Member (int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	//한번에 한 항목씩 get set 만들기 
	//get 이름과 아이디 호출
	//set 이름과 아이디를 전달받아서 멤버변수에 저장
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memeberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	// 최상위 Object클래스를 overriding 
	// 컴파일러에게 overriding한걸 annotation(@override)로 알려줘야한다. 그럼 문법단계에서부터 확인해줌
	@Override
	public String toString() { //객체명으로 이 메서드 호출가능
		return memberId + ":" + memberName; //오버라이딩
	}
	
}
