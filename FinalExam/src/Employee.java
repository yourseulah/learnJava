// 2021/12/31 
// Person 클래스를 상속받아 사원클래스 클래스 정의


public class Employee extends Person {
	
	//생성자
	public Employee(String personName) {
		super(personName); //부모클래스의 생성자 호출 - 부모쪽에 넘겨주고
	}
	
	@Override
	public void doWork() {
		System.out.println(getPersonName() + "이 근무한다.");
	}
}
