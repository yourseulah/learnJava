
public class Student {
	//멤버변수
	public static int serialNum = 1000; //인스턴스(객체)생성과 무관함, 모든 객체에서 공용으로 사용
	public int	studentId;
	public String studentName; 
	public int grade; 
	public String address;
	
	//디폴트 생성자 - 인수가 없으니까 
	public Student() {
		serialNum++; //serialNum = serialNum + 1 대신 전위 또는 후위 연산자 개발자들은 후위연산자 선호
		studentId = serialNum; // 증가 되서 저장
	}
	
	//오버로딩된 생성자
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
//		this.grade = 1;
	}
	
	public Student(String studentName) {
		this.studentName = studentName;
		serialNum = serialNum + 1 ;
		studentId = serialNum;
	}
	
	//메서드
	//보편적으로 하는 방법 
	public int getStudentId () {
		return studentId;
	}
		
	public String getStudentName () {
		return studentName;
	}
	
	public int getGrade() {
		return grade;
	}

	public String getAddress() {
		return address;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setAdress(String address) {
		this.address=address;
	}
	
	public void showStudentInfo() {
		System.out.println(getStudentId() + ":" + getStudentName());
	}
	
	
//	public static int getSerialNum() {
//		int i = 10; // 지역변수 사용가능  
//		return serialNum;
//	}
	
	
	
	
	
	/*
	//오버로딩된 메서드 
	//진입점 (main) 
	public static void main(String args[]) { // 진입점, 운영체제에서 프로그램 호출, Student 클래스의 영역이 아님.
		// grade = 3; 객체 생성을 해야만 성립된다. 메서드에서는 같은 가족이라서 멤버변수를 마음데로 접근할수 있는데 메인메서드(static)는 안된다.
		//클래스명 변수명  = new 생성자 () *암기사항 *객체 생성
		Student st1  = new Student(); //객체생성 - 인스턴스를 생성. 처리할 내용이 있으면 처리
		st1.setStudentName("홍길동");
		
		//둘다 출력되는 결과는 같다
		System.out.println(st1.studentName); //멤버변수를 직접 출력
//		System.out.println(st1.getstudentName()); //메서드(함수)를 활용해서 출력
	} */
}
