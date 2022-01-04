//Object Class - equals() method pg358

public class EqualsTest {

	public static void main(String[] args) {
		Student st1 = new Student(100, "홍길동");
		Student st2 = st1; //객체복사, st1과 st2 이두 객체는 동일한 주소를 나타냄
		System.out.println(st1);
		System.out.println(st2);
		Student st3 = new Student(100, "홍길"); //st3는 st1 과 내용이 동일한 객체 
		System.out.println(st3); //st1과 st3은 다른 객체 (해시코드 다름)
		System.out.println("st1과 st2 비교 : " + st1.equals(st2));
		System.out.println("st1과 st3 비교 : " + st1.equals(st3));
		// equals() method의 원형은 해시코드 비교 
		
		
		// 위의 설명에서 일반객체일경우 성명 내용대로 객체가 다르면 해시코드가 다름
		// String일 경우 예
		// STring의 문자열이 동일할 경우 동일한 메모리에 저장
		//기억장소 효율적 사용
		
		String a1 = new String("홍길동"); //여기는 
		String a2 = new String("홍길동");
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a1 == a2); // 이 문장 사용 금지
		System.out.println(a1.equals(a2)); //문자열의 내용 비교(필수)
		
		
		
	}
	
	
//	
//	pg 364
//	String abc1 = "hello";
//	String abc2 = "hi";
// 	int abc3 = 123;
// 	int abc4 = 123
// 	
// 	sys
	

}





// String 은 객체 int 그냥 정수 
// 객체는 내용이 같아도 원래 주소가 (해시코드가) 다른데 
// String은 (문자열은) 메모리 낭비를 방지하기 위해 내용이 같으면 주소를 같게 쓴다
// 따라서 std.studentName == this.studentName 도 값이 제대로 나오긴 한다.
// 하지만 std.studentName.equals(studentName) 바람직한 표현법
