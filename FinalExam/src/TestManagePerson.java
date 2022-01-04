// 2021/12/31

public class TestManagePerson {

	public static void main(String[] args) {
		
		ManagePerson person = new ManagePerson(); //객체생성
		person.addPerson(new Student("홍길동"));
		person.addPerson(new Employee("김삿갓"));
		person.addPerson(new Children("이도령"));
		person.showAllPerson();
		
		System.out.println("--------------------------------------");
		
		//김삿갓 삭제
		if(person.removePerson("김삿갓")) {
			System.out.println("삭제성공");
		}else {
			System.out.println("삭제실패");
		}
		//or System.out.println(person.removePerson("김삿갓"));
		person.showAllPerson();
		
	}

	
}
