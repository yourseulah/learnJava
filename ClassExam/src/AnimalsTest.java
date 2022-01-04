
import java.util.*;

// 20211203 pg 259 ������ pg275

class Animals { // ���ϸ�� ������ Ŭ�󽺴� public �������� public X 
	public void move() {
	System.out.println("������ �����Դϴ�.");
	}

}
class Human extends Animals { // Animals Ŭ�� ��� 	
	public void move() {  //move �޼��� �������̵� (overriding)
		System.out.println("����� �����Դϴ�.");
	}
	public void readBook() {
		System.out.println("����� å�� �д´�.");
	}
}
	
class Tiger extends Animals { // Animals Ŭ�� ��� 
	public void move() {  //move �޼��� �������̵� (overriding)
		System.out.println("ȣ���̰� �����Դϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �Ѵ�.");
	}
}

class Eagle extends Animals { // Animals Ŭ�� ��� 		
	public void move() {  //move �޼��� �������̵� (overriding)
		System.out.println("�������� �����Դϴ�.");
	}
	public void flying() {
		System.out.println("�������� ���ư���.");
	}
}

public class AnimalsTest { // ���ϸ�� ������ Ŭ�󽺴� public �������� public X 
	public static void main(String[] args) {
		AnimalsTest aTest = new AnimalsTest () ;
		//�ζ������� ����
//		aTest.moveAnimal(new Human()); 
//		aTest.moveAnimal(new Tiger());
//		aTest.moveAnimal(new Eagle()); // ��ü. �޼���
		
		
		//�̷��� �ϸ� �迭�� �Ҽ��� ����. Ÿ���� ���ƾ� �ϴµ� Human, Eagle, Tiger �� �ٸ��ϱ�
//		Human a1 = new Human(); 
//		Tiger a2 = new Human(); 
//		Eagle a3 = new Human(); 
		
		Animals[] animalArr = new Animals[10]; // �迭��ü���� Human, Tiger, Eagle�� ���ս��Ѽ� �Ҽ� �ִ�.
		for (int i = 0; i < 10; i++) {
			animalArr[i] = new Human();
		}
		
		for (int i = 3; i < 10; i++) {
			animalArr[i] = new Tiger();
		}
		
		for (int i = 5; i < 10; i++) {
			animalArr[i] = new Eagle();
		}
		
		// move �޼��� ȣ��
		for (int i = 0 ; i < animalArr.length; i++) {
			//animalArr[i].move();
		}
		
//		for(int i = 5; i < 10 ; i++) {
//		aTest.moveAnimal(animalArr[i]);
//	}
			
		//-----------------------------------------
		ArrayList<Animals> aniList = new ArrayList<Animals>();
		aniList.add(new Human()); // ��ü �����ϸ鼭 �迭�� �߰�
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		for (Animals item : aniList) {// ����for�� ������ �迭��ü ������ 
			//anilist�� 3���� ��������ϱ� 3���� ��µɰ���
			item.move(); //�������� ���� ������ �޼��� ȣ�� 
			// upcasting �Ǿ��־ item.readBook(), hunting, flying���δ� ����Ҽ� ����.
		}
		
		//������ ������ �°� �ݺ������� Ȱ���Ͽ� ����Ҽ� �ְԵ�.
		for (int i = 0; i < aniList.size(); i++) {
			Animals item = aniList.get(i);
			if (item instanceof Human) { //������ ��ü�� ����Ǿ� �ִµ� �׾ȿ� ���� �ִ��� �𸣴ϱ� �ٿ�ĳ������ �ؾ��h�� �ٵ� �� �ȿ� class Ÿ���� ã������ instanceof�� ��� 
				Human h= (Human)item; //downcasting �ٽõ��ƿԱ� �빮�� 
				h.readBook(); //downcasting �Ǿ����Ƿ� ������ �޼��� ��밡��
			} else if (item instanceof Tiger) {
				Tiger t = (Tiger)item;
				t.hunting();
			} else if (item instanceof Eagle) {
				Eagle e = (Eagle)item;
				e.flying();
			} else {
				System.out.println("�˼� ���� �����Դϴ�");
			}
		}
		
		
		//---------------------------------------------
	
	}	//end main
	
	public void moveAnimal (Animals animal) {
		animal.move(); //������, ������ �ٸ� ���� ���� ������ �������ִٴ� ������ �ִ�.
	}

	
	
	
}	
	