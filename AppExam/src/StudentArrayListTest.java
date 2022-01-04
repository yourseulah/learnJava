
public class StudentArrayListTest {

	public static void main(String[] args) {
		StudentArrayList stList = new StudentArrayList();
		Student st1 = new Student(1, "용복이");
		Student st2 = new Student(2, "현진이");
		Student st3 = new Student(3, "방찬");
		Student st4 = new Student(4, "창빈");
		Student st5 = new Student(5, "한지성");
		Student st6 = new Student(6, "이리노");
		stList.addStudent(st1); // = stList.addStudent(new Student(1, "용복이");
		stList.addStudent(st2);
		stList.addStudent(st3);
		stList.addStudent(st4);
		stList.addStudent(st5);
		stList.addStudent(st6);
		
		stList.showAllStudent();
		System.out.println();
		
		//멤버 6 삭제
		if (stList.removeStudent(6) == true) {
			System.out.println("삭제성공\n");
		} else {
			System.out.println("삭제실패");
		}
		stList.showAllStudent();
		
		System.out.println();
		
		//멤버 한지성 삭제
		if(stList.removeStudent("한지성")) {
			System.out.println("삭제성공");
		} else {
			System.out.println("삭제실패");
		}
		stList.showAllStudent();
		
		
	}

}
