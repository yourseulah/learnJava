// 2021/12/31

import java.util.*;
public class ManagePerson {
	
	//멤버변수 - collection framework 쓰기
	ArrayList<Person> personList; 
	
	//생성자 (클라스이름과 같게쓰는것이 관용적)
	public ManagePerson() {
		personList = new ArrayList<Person>();
	}
	
	//메서드
	//리스트에 추가
		// ~해 void // 가지고와 : return
	public void addPerson(Person person) { 
		// public void addPerson(String personName) { 이 아닌이유
		//지금은 타입이 여러가지가 있기 때문에 (Student, Employee, Children) 객체를 생성해서 넘겨주기
		personList.add(person);
	}
	
	//리스트에서 삭제
	public boolean removePerson(String personName) { //중복된 이름이 없다고 생각하고 
		//받아와서 비교 : 향상된 for문 일반for문 다 가능
		//향상된 for문 - tmp 임시변수 -- 문자열 비교는 equals메서드 / ==(x)
		for(Person tmp: personList) {
			if (tmp.getPersonName().equals(personName)) {
				personList.remove(tmp); //리스트 삭제
				return true;
			}
		}
		return false;
	}
	
	//리스트의 모든내용 출력  
	//타입이 여러가지있는데 (Student,Employee,Children) 부모클래스 하나로 처리할수 있다는것이 다형성의 가장 좋은점.
	public void showAllPerson() {
		//향상된 for문 
		for (Person tmp: personList) {
			tmp.doWork();
		}
	}
}
