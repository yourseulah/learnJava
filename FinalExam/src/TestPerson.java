// 2021/12/31 
// 처리 클래스를 구현하여 다형성 테스트
// ArrayList 클래스 (제네릭이 구현되어 있음)
// 학생 3명, 사원2명, 어린이 2명 을 Person 객체로 생

import java.util.*; // arrayList를 쓰기위해 유틸 패키지 추가

public class TestPerson {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<Person>(); //array에 들어갈 타입은 Person타입으로
		
		// 방법1
		// Person p1 = new Student("홍길동"); // 객체 생성해서 배열에 추가 
		// personList.add(p1); 
		// 상위클라스 = new 하위클라스 (ㅇ) // 제일 바람직한 방법 - 다형성을 처리할수 있는 문법
											// 동일한 타입을 만들기 위해서 
		// 하위클래스 = new 하위클래스 (ㅇ)
		// 상위클래스 = new 상위클래스 (ㅇ)
		// 하위클래스 = new 상위클래스 (X)
	
		// 방법2
		personList.add(new Student("방찬")); //인라인 방식
		personList.add(new Student("이리노"));
		personList.add(new Student("창빈"));
		personList.add(new Employee("황현진"));
		personList.add(new Employee("이용복"));
		personList.add(new Children("한지성"));
		personList.add(new Children("김승민"));
		
		//방법1 : 위치제어 있게
		for (int i = 0; i < personList.size();i++) {
			Person tmp = personList.get(i);
			tmp.doWork(); // 생성당시 객체 메서드 처리
			// Person의 doWork()가 아닌 각자가 가지고 있는 doWork()
		}
		
		System.out.println("--------------------------------------");
		
		// 방법2 : 위치제어 없이 다 출력한다
		for (Person tmp : personList) {
			tmp.doWork();
		}
		
		
	}

}
