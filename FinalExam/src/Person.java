// 2021/12/31 클래스에 대한 복습 
// Person 클라스 정의

public class Person {
	//멤버변수
	private String personName; 
	//상속관계에 있는 클라스에게는 열어두기 위해 protected
	//private으로 닫아놓으면 get, set이 필요
	
	//생성자 (클라스이름과 같게쓰는것이 관용적)
	public Person(String personName) {
		this.personName = personName;
	}
	//오버로딩된 생성자
	//메서드
	public String getPersonName() {
		return personName;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public void doWork() {
		System.out.println("사람이 행동한다."); 
		// 메서드 안에 sysout 비워놔도 상관없음
	}
	
	//오버로딩된 메서드
	

}
