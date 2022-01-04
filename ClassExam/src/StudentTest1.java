
public class StudentTest1 {

	public static void main(String[] args) {
		// Student 클래스 테스트 
		
		//클라스 이름으로 접근 가능 Static 변수를 
//		System.out.println(Student.getSerialNum()); //객체 생성하지 않고도 접근 가능 private 일때 
		System.out.println(Student.serialNum); // public일때 가능. private으로 막아버리면 이건 못씀. get으로 해야함 
		
		
		//객체생성 st1, st2 = new 
		Student st1 = new Student(); //디폴트 생성자 
		st1.setStudentName("홍길동"); //1번실행 s1 studentID는 고정 
		//System.out.println(st1.studentName); //public 멤버변수이므로 가능
		//System.out.println(st1.getStudentName()); //public 메서드이므로 가능
		//st1.serialNum++;
		
		System.out.println(st1.serialNum); //static 변수 읽기

		System.out.println(st1.getStudentName() + ":" + st1.studentId);
		
		Student st2 = new Student (); //2번째 실행 s2 studentID는 고정
		st2.setStudentName("김삿갓");
		System.out.println(st2.serialNum); //
		System.out.println(st1.serialNum); //st2에서 생성시 증가했으므로 증가됨
		System.out.println(st2.getStudentName() + ":" + st2.studentId);
		
		System.out.println(Student.serialNum); // 객체 없이도 클라스 이름으로 속성에 접근할수 있다. 일반적으로 안되는데 static은 가능 
		System.out.println(st2.getStudentName() + ":" + st2.studentId);
		
//		System.out.println(st1.getSerialNum());
//		System.out.println(Student.getSerialNum()); // 앞에 static으로 있어서 클라스명.메서드명 - 객체 생성과 무관
			
		
	}

	    
	
	
	
	
	
	
}
