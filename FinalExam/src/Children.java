// 2021/12/31 
// Person 클래스를 상속받아 어린이클래스 클래스 정의


public class Children extends Person {
	
	//생성자
	public Children (String personName) { //이름을 넘겨받아서 
		super (personName); // 이것을 부모클래스의 생성자에 주어서 
	}
	
	@Override
	public void doWork() {
		System.out.println(getPersonName() + "이 논다"); //이름을 리턴받아와서 출력
	}

}
