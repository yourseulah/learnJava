
public class AnimalTest {

	public static void main(String[] args) {
		// Ŭ���� �����Ͽ� �׽�Ʈ (����, ȣ����, �ڳ���, �⸰ ...)
	
		Animal a1 = new Animal (); //����Ʈ ����
		System.out.println(a1.getName());
		System.out.println(a1.getWeight());
		System.out.println(a1.getSpeed());
		System.out.println(a1.getName() + "�� �����Դ� " + a1.getWeight() + "�̰�, �ӵ���" + a1.getSpeed() + "�̴�");
		
		a1.setName("����");
		a1.setWeight(150);
		a1.setSpeed(20);
		System.out.println(a1.getName() + "�� �����Դ� " + a1.getWeight() + "�̰�, �ӵ���" + a1.getSpeed() + "�̴�");
		
		Animal a2 = new Animal ("ȣ����");
		a2.setWeight(200);
		a2.setSpeed(30);
		System.out.println(a2.getName() + "�� �����Դ� " + a2.getWeight() + "�̰�, �ӵ���" + a2.getSpeed() + "�̴�");
		
		a2.speedUp(300);
		System.out.println(a2.getName() + "�� �����Դ� " + a2.getWeight() + "�̰�, �ӵ���" + a2.getSpeed() + "�̴�");
		a2.speedDown(120);
		System.out.println(a2.getName() + "�� �����Դ� " + a2.getWeight() + "�̰�, �ӵ���" + a2.getSpeed() + "�̴�");
		
		
//		Animal a3 = new Animal ("�ڳ���", 300);
//		System.out.println(a3.getName() + "�� �����Դ� " + a3.getWeight() + "�̰�, �ӵ���" + a2.getSpeed() + "�̴�");
		
	}
}
