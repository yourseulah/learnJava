
public class Ex1123_1 {
	//사칙연산기
	int result; //연산결과저장용 속성
	int num1; // 계산에 사용되는 왼쪽 속성
	int num2; // 계산에 사용되는 오른쪽 속성
	
	// 디폴트 생성자를 반드시 구현 (내용은 없어도 됨)
	public Ex1123_1() { //디폴트 생성자
		
	}
	
	//생성자 (클래스명과 동일, 반환타입 없음(return도 없음), 나머지는 메서드 정의 방법과 동일)
	//오버로딩된생성자 
	public Ex1123_1 (int n1, int n2) { //매개변수 있는 생성자 
		num1 = n1;
		num2 = n2;
	}
	
	// 데이터쓰기 set 
	public void setNum1 (int n1) {
		num1 = n1;
	}
	
	public void setNum2 (int n2) {
		num2 = n2;
	}
	
	public void setNum3 (int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	// 데이터읽기 get(return 필요) set (return 필요없음) 
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
		
	//메서드
	public int add() {
		result = num1 + num2;
		return result;
	}
	
	public int subtract() {
		result = num1 - num2;
		return result;
	}
	
	public int product() {
		result = num1 * num2;
		return result;
	}
	
	public int divide() {
		result = num1 / num2;
		return result;
	}
	
	//덧셈 메서드 (Overloading 된 메서드)
	public int add(int n1, int n2) { //pulic 반환타임 매서드명 (매개변수 리스트) - 구성요소 어디서든 호출한다 공개해야지만 가능하니가 public
		num1 = n1;
		num2 = n2;
		result = num1 + num2 ; // 속성으로 덧셈실행
		return result; 
	}
	
	//뺄셈 메서드  --  여기서의 n1 n2 는 덧셈 메서드의 n1 n2와 전혀 상관없다
	public int subtract(int n1, int n2) {
		num1 = n1;
		num2 = n2;		
		result = n1 - n2;//속성으로 뺄셈 실행
		return result;
	}
	
	//곱셈 메서드 
	public int product(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		result = n1 * n2; // 지역변수로 곱셈실행
		return result;
	}
	
	//나눗셈
	public int divide(int n1, int n2) {
		result = n1 / n2; // 지역변수로 나눗셈실행
		return result;
	}
	
}
