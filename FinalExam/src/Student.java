// 2021/12/31 
// Person 클래스를 상속받아 학생클래스 클래스 정의
 

public class Student extends Person {
	//별도로 관리한다는건
	//String studentName;

	//생성자
	public Student(String personName) {
		super(personName); //부모클래스의 생성자 호출	
	}
	
	@Override
	public void doWork() {
		// 1. 부모의 personName 멤버변수가 protected 일때 : 직접접근
		// System.out.println(personName + "이 공부한다.");
		
		// 2. 부모의 personName 멤버변수가 private 일때 : 간접접근 (get, set)메서드로 가져올수 있다
		// 상속을 받았더라도 private이면 직접접근을 못한다. 
		System.out.println(getPersonName() + "이 공부한다." );
		
	}
}
