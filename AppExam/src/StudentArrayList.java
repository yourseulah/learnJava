// 2021/12/28 
// 12-2 컬렉션 프레임 워크 
// ArrayList 활용하기 연습

import java.util.*;

public class StudentArrayList {
	ArrayList<Student> stList; //Student를 넣을수 있는 배열 선언 - Student 선언
	
	public StudentArrayList() { //생성자
		stList = new ArrayList<Student>(); // 비어있는 리스트 생성 <안에는 student만 들어올수 있다>
	}
	
	public void addStudent(Student student) { //student값을 받아서 추가
		stList.add(student);
	}
	
	//오버라이딩 (상속관계에서) : 상속받았을때 부모클라스 메서드와 자식 클라스 메서드 같을때
	//겉모습은 똑같게 하고 (매개변수 스타일 같게) 내용만 다르게 : 재정의
	
	//오버로딩 (동일클라스에서) : 메서드는 같으나 매개변수 스타일이 다를때 
	
	//여기서는 다형성이 아님 student만 
	
	//조회할때 for나 while구문이 꼭 필요하구나!
	public boolean removeStudent(int studentId) {
		for (int i = 0; i < stList.size(); i++) { 
			// 갯수 반환할때 여러가지 메서드가 있는데 List인터페이스에 메서드가 정의되어 있다
			// 편집기의 도움을 받아서 .찍어보고 size 또는 length 이 둘중에 있는걸로 쓰면 된다.
			Student tmp = stList.get(i);
			if (tmp.getStudentId() == studentId) {
				stList.remove(i);
				return true;
				
//		    무조건 Student 타입으로 해놓았으니까 다른 타입은 없기때문데 (Student) 캐스팅 할필요 없다				
//			Student student = (Student)stList.get(i); 
//			int temid = student.getStudentId();
//			if (temid == studentId) {
//				stList.remove(i); //객체제거
//				return true; //삭제성공
			}
		}
		return false; //삭제할내용이 없다.
	}
	
	//오버로딩 - string 이름으로 찾아서 제거하는 메서드 추가
	public boolean removeStudent(String studentName) {
		boolean chk = false; // chk 또는 flag
		for (int i = 0; i < stList.size(); i++) {
			Student tmp = (Student)stList.get(i);
			
			if (tmp.getStudentName().equals(studentName)) {
				stList.remove(i);
				chk = true;
				break;
			}
		}
		return chk;
	}
	
	
	//전체리스트 출력해주는 showAll	
	
	//전통적인 자바문법 
	public void showAllStudent() {
		for (int i = 0; i < stList.size(); i++) {
			Student tmp = stList.get(i);
			System.out.println(tmp);
		}
	
	//향상된 for 문법
	//	for(Student tmp : stList) {
	//		System.out.println(tmp);
			//==  System.out.println(student.toString()); 
			//객체가 들어오면 toString method로 호출해서 출력시키겠다라고 상위구조에 정의가 되어있는데 
			//overriding 되어있으므로 id :name 형식으로 출력됨
	//	}
	//	System.out.println();
	}
	
}
