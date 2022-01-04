//Object Class - toSTring method pg354
public class BookClassTest {

	public static void main(String[] args) {
		BookClass book = new BookClass(123456, "개미");
		System.out.println(book.toString()); // toString method
		System.out.println(book); //객체명을 출력하면 toString() 메서드와 동일한 결과
	}
   
}
