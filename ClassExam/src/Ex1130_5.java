import java.util.*; //�ܺ� ���̹����� ���� 
public class Ex1130_5 {

	public static void main(String[] args) {
		// ArrayList Ŭ���� Ȱ��
		ArrayList<Book> library = new ArrayList<Book>(); //���׸� Ÿ������ ����

//		Book abc = new Book("�¹���","������");
//		library.add(abc);
		//or
		library.add(new Book("�¹���", "������")); //inline ��ü����
		library.add(new Book("���̾�", "�츣���켼")); 
		library.add(new Book("��Ի���ΰ�", "���ù�"));
		
		System.out.println("===========================");
		for (int i = 0 ; i < library.size(); i++) { //�޼����� �ݵ�� ��ȣ�� �־�� �Ѵ�. �Ӽ��̸� ��ȣX
			//�ӽú����� ��ȯ
			Book book = library.get(i); // ��ü�� ��ȯ
			book.showBookInfo();
		}
		
		//���� for��
		System.out.println("==========���� for�� ===========");
		for (Book abc:library) {
			abc.showBookInfo();
		}
		
		  
	}

}
