
public class Person { //사람을 객체로 만들려고 하는것
	String name;
	int height;
	int weight;
	
	// 생성자가 한개도 없을 경우 디폴트 생성자가 존재함
	
	// 생성자 작성 규칙
	// 클래스명과 동일
	// 반환타입이 없음 (문법 없음)
	// 명시적으로 디폴트 생성자 필요 , 빈껍데기 
	public Person() {
		
	}
	// 오버로딩된 생성자
	public Person(String pName) { //생성자 이름이 동일, 매개변수 다름(갯수, 타입, 순서)
		name = pName; // 매개변수를 통해서 멤버변수를 주는것
	}
	//오버로딩된 생성자
	public Person(String pName, int pHeight, int pWeight) {
		name = pName;
		height = pHeight;
		weight = pWeight;
	}
	
	// 메서드 
	public String getName() {
		return name;
	}

	// 키와 몸무게를 각각 추출할 수 있는 메서드 추가
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	// 성명, 키, 몸무게를 변경할 수 있는 메서드를 ...  추가 받을게 없어서 주기만 하면 되니까 void
	public void setPerson(String pName, int pHeight, int pWeight ) {
		name = pName;
		height = pHeight;
		weight = pWeight;
		return; //제어반환(값은 없음) 값이 있으려면 return 뒤에 뭔가 있어야함
	}
		
//	public void showStudentInfo() {
//		System.out.println(studentName + "===" + address);
//	
//	
}
