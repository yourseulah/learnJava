
public class Ex1130_3 {

	public static void main(String[] args) {
		// ���� ����(�Ϲ����� ����)
		
		//��ü�迭 ó��
		Book[] bookArr1 = new Book[3]; // Book ��ü�� ������ �迭���� ���� 
		Book[] bookArr2 = new Book[3]; // Book ��ü�� ������ �迭���� ����
		
		bookArr1[0] = new Book("�¸ƻ��", "������"); //����
		bookArr1[1] = new Book("���̾�", "�츣���켼");
		bookArr1[2] = new Book("��Ի���ΰ�", "���ù�");
		
		String[] strArr = {"�ڹ�", "�ȵ���̵�", "c", "�ڹٽ�ũ��Ʈ", "���̽�"};
		
		for(int i = 0; i< bookArr2.length; i++) {
		bookArr2[i] = new Book(); // �ϴ� ����Ʈ �����ڷ� �����ص�
		}
		
		System.out.println("================����===================");
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}	
			
		System.out.println("================�纻===================");
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		//�������� - ������
		for(int i = 0; i < bookArr1.length; i++) { //���� �迭 ���̸�ŭ ���� (����)  ��ü�� ������ Arraycopy�� ���� �ȵȴ�.
			bookArr2[i].setBookName(bookArr1[i].getBookName());
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());
		}
		
		System.out.println("================����===================");
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}	
			
		System.out.println("================�纻===================");
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		//�纻�� 3��° å�� ����
		bookArr2[2].setBookName("�ڹ����α׷���");
		bookArr2[2].setAuthor("ȫ�浿");
		
		System.out.println("================����===================");
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}	
			
		System.out.println("================�纻===================");
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		//������ 2��° å�� ����
		bookArr1[1].setBookName("�ڹ�");
		bookArr1[1].setAuthor("���");
		
		
		System.out.println("================����===================");
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}	
			
		System.out.println("================�纻===================");
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		//���� ������ ������ �纻���� ������ ���شٶ�� �� Ȯ���Ϸ��� 
		
		for (String lang: strArr) { //���������� ���� ���
			System.out.print(lang + " ");
		}
		System.out.println();
		for(int i = 0; i< strArr.length; i++) {
			System.out.print(strArr[i] + " "); 
		}

	}
	}
