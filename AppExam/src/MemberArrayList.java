
//2021/12/24 
//ArrayList 활용하기 pg410
//회원관리의 제일 핵심클래스 - 처리용 (삭제하는기능까지 포함)

import java.util.*; //유틸패키지 안에 있는 array쓸수있다

public class MemberArrayList {
	ArrayList<Member> arrayList; //멤버변수, 선언만
	//ArryaList :운반저장용객체 멤버타입만저장하도록  arrayList: 변수명
	
	public MemberArrayList() { //생성자
		arrayList = new ArrayList<Member>(); //멤버객체를 저장할 수 있는 리스트 생성. 들어갈수 있는 공간만 만든것임. 값은 0개.
	}
	
	public void addMember(Member member) { //member를 받아서 add시킨다, 회원추가
		arrayList.add(member);
	}
	
	
	////조회할때 for나 while구문이 꼭 필요하구나!
	//중요한부분! 
	public boolean removeMember(int memberId) { // 삭제성공하면 true를 반환하겠다 
		//특정항목이(멤버번호) 맞으면 키에맞는 모든 아이를 지운다
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = (Member)arrayList.get(i);
			
			//방법 1
			int temId = member.getMemberId();
			if (temId == memberId) {
				arrayList.remove(i); //객체 제거 
				// break; //해당하는 반복구문 탈출
				return true; //삭제 성공 - 메서드를 탈출하니까 더 강력한 탈출방법
			}	
		}		
		return false; // 못찾았을경우	
	}
	
	//Overloading
	public boolean removeMember(String memberName) {
		boolean chk = false; //일단 못찾을거라고 실패라고 가정 
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = (Member)arrayList.get(i);
			
			// 방법 2  : 일단 찾기 시작해 > 처음에 못찾았어라고 가정 > if 문에서 찾으면 성공 > 아니면 실패 그자체로 리턴
			if (member.getMemberName().equals(memberName) == true) {
				arrayList.remove(i);
				chk = true; //삭제성공
				break;
			}
		} 
		return chk; // 성공일 경우 true, 실패일 경우 false
	}
	
	public void showAllMember() {
		for ( Member member : arrayList ) { //향상된 for 문
			System.out.println(member); // toString() 메서드와 동일한 결과 pg354 member.toString()
		}
		System.out.println();
	}
	
}
