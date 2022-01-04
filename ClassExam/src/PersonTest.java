
public class PersonTest {

	public static void main(String[] args) {
		// Person 클라스 테스트
		// 오버로딩된 생성자가 있을 경우 디폴트 생성자도 구현해줘야 함 (내용이 없어도 됨)
		Person hu1 = new Person(); // 디폴트 생성자
		Person hu2 = new Person("홍길동"); //매개변수1개 생성자
		
		System.out.println(hu2.getName());
		
		// 추가된 메서드 기능 테스트 
		Person hu3 = new Person("레오", 170, 55); //매개변수3개 생성자
		System.out.println(hu3.getHeight());
		System.out.println(hu3.getWeight());
		System.out.println("성명 : " + hu3.getName() + ", 키 : " + hu3.getHeight() + ", 몸무게 : " + hu3.getWeight());
		hu3.setPerson("레오", 150, 55);
		System.out.println("성명 : " + hu3.getName() + ", 키 : " + hu3.getHeight() + ", 몸무게 : " + hu3.getWeight());
		
		hu1.setPerson("스라", 160, 50); //객체수정
		System.out.println("성명 : " + hu1.getName() + ", 키 : " + hu1.getHeight() + ", 몸무게 : " + hu1.getWeight());
		
	}
	

}
