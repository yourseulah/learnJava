
//Object Class pg351 
public class BookClass { // ObjectŬ������ ����Ŭ���� 
	int bookNumber;
	String bookTitle;
	
	public BookClass(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() { //������
		return bookTitle + ":" + bookNumber;
	}
	
	
}
