
public class CarTest {

	public static void main(String[] args) {
		// Car Ŭ�� �׽�Ʈ
		Car c1 = new Car ();
		Car c2 = new Car ("Bubblebee");
		Car c3 = new Car ("Mercedes", 100);
					
		System.out.println(c1.getCarName());
		System.out.println(c1.getCarSpeed());
		System.out.println("���̸� :" + c1.getCarName() + ", �ӵ� : " + c1.getCarSpeed());
		
		System.out.println(c2.getCarName());
		System.out.println(c2.getCarSpeed());
		
		// �̹� ������� ��ü ����/�����Ҷ� �ٷ� ��ü�̸����� �Է°���
		c1.setCar("tico", 60); //ȣ��
		System.out.println(c1.getCarName());
		System.out.println(c1.getCarSpeed());
		
		c3.setCar("audi", 120); //ȣ��
		System.out.println("���̸� :" + c3.getCarName() + ", �ӵ� : " + c3.getCarSpeed());
	
		c3.setSpeedUp(50); //ȣ��
		System.out.println(c3.getCarSpeed());	
		
		c3.setSpeedDown(50); //ȣ��
		System.out.println(c3.getCarSpeed());	
	
	}

}
