
public class Book {
	//������� (�Ӽ�)
	private String bookName;
	private String author;
	
	//����Ʈ ������ - �������� �ʰ�
	public Book() {
	}
	
	//�����ε��� ������
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	//�޼���
	//get (�д°� - return�� �� �ʿ�) set (�־���� - return�� �ʿ����) ���ڿ� ��Ģ 
	//get set ������ ��� ������ ù���ڸ� �빮�ڷ� �ۼ��ؾ��� 
	//�ٸ� ���ڴ� �����ؾ� �� 
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
	
	public void showBookInfo() { //show�� �����ϸ� ������ �ܾ�� ���ϴ´��
		System.out.println(getBookName() + ":" + getAuthor());
	}
	//�����ε��� �޼��� 
	//������ (������ ������) public static void main - static�̶� ��ü������ ����
}
