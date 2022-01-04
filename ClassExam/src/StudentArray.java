
public class StudentArray {

	public static void main(String[] args) {
		// Student 객체 배열 테스트 
		Student[] st = new Student[5];
		
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		
		st[0] = new Student(1, "슬아");
		st[1] = new Student(2, "아라");
		st[2] = new Student(3, "으니");
		st[3] = new Student(4, "보영");

		for (int i = 0; i < st.length; i++) {
			st[i].showStudentInfo();
		}
		
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		
//		for (int i = 4; i < 5; i--) {
//			st[i].showStudentInfo();
//		}
				
		Student st1 = new Student("홍길동"); // Id까지 같이 만들어짐
		System.out.println(st1.getStudentName() + ":" + st1.getStudentId());
			st1.showStudentInfo();
		
		
	}

}
