
public class Book {
	//멤버변수 (속성)
	private String bookName;
	private String author;
	
	//디폴트 생성자 - 오류나지 않게
	public Book() {
	}
	
	//오버로딩된 생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	//메서드
	//get (읽는거 - return문 꼭 필요) set (주어야함 - return문 필요없음) 문자열 규칙 
	//get set 다음에 멤버 변수의 첫글자를 대문자로 작성해야함 
	//다른 문자는 동일해야 함 
	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}
	
	public void setBookName (String bookName) {
		this.bookName = bookName;
	}
	
	public void setAuthor (String author) {
		this.author = author;
	}
	
	public void showBookInfo() { //show로 시작하면 나머지 단어는 원하는대로
		System.out.println(getBookName() + ":" + getAuthor());
	}
	//오버로딩된 메서드 
	//진입점 (보통은 사용안함) public static void main - static이라서 객체생성과 무관
}
