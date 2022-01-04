
//Object Class pg351 
public class BookClass { // Object클래스의 하위클래스 
	int bookNumber;
	String bookTitle;
	
	public BookClass(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() { //재정의
		return bookTitle + ":" + bookNumber;
	}
	
	
}
