//Object Class - equals() method pg358


// 12-2 컬렉션 프레임 워크 
//혼자해보기 연습
//Student 클래스에 데이터를 읽고 쓸수 있는 메서드 추가
//StudentArrayList 클래스를 제작하여 학생 추가, 번호로 삭제, 이름으로 삭제, 학생의 학번과 이름을 출력하는 메서드 작성 (학생관리클래스)
//StudentArrayListTest 클래스를 제작하여 학생 5명 추가하고 2명 삭제 테스트 
	
public class Student {

	private int studentId;
	String studentName;
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	
	//한번에 한 항목씩 get set 만들기 
	//get 이름과 아이디 호출
	//set 이름과 아이디를 전달받아서 멤버변수에 저장
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId; 
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	// 최상위 Object클래스를 overriding 
	@Override
	public String toString() { //나중에 학생 정보를 출력하기위해 toString메서드 재정의
		return studentId + ":" + studentName;
	}
	
	
		
	/*
	@Override
	public boolean equals(Object obj) {
		Student std = (Student)obj; // Student ��ü�� �����ؾ� �ϱ� ������ ĳ�����ʿ�
		if(std.studentId == this.studentId && std.studentName.equals(studentName)) {
			return true;
		} else {
			return false;
		}
	}
	*/
}