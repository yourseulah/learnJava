

public class Animal {
	//�Ӽ� ����
	String name; //�����̸�
	int	weight; //ũ��(������)
	int speed; //�޸��� �ӵ�

	//����Ʈ (����), �Ű����� 1�� : ���� �̸�, ũ��(30~200), �ӵ��� ����Ʈ�� ����
	public Animal() {
		name = "����";
		weight= 30;
		speed = 0;
	}
	
	//������ (Ŭ������� ����, ��ȯŸ�� ����(return�� ����), �������� �޼��� ���� ����� ����)
	//�����ε��Ȼ����� (�Ű����� 1��: �����̸�)
	public Animal(String aName) { //�Ű����� �ִ� ������ 
		name = aName;
	}
	
	//�����ε��Ȼ����� (�Ű����� 2��: �����̸�, ũ��)
	public Animal(String aName, int aWeight) { //�Ű����� �ִ� ������ 
		name = aName;
		weight = aWeight;
	}
	
	//�޼��� ����
	// get set ���� ���� -- !!!!! ��¥ �߿� !!!!!
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void setName(String aName) {
		name = aName;
	}
	public void setWeight(int aWeight) {
		weight = aWeight;
	}
	public void setSpeed(int aSpeed) {
		speed = aSpeed;
	}
	
	
	//�޸��� �ӵ� ����(�⺻ ����(10), �־��� �� ����) : 0 ~ 100 ���̸� ����
	
	public void speedUp() {
		if (speed + 10 >100) { // ���� �ӵ��� �߰��� �ӵ��� �����ؼ� 100���� ū�� Ȯ��
			speed = 100;
		} else {
			speed += 10;
		}
	}
	
	public void speedUp(int aSpeed) {
		if (speed + aSpeed > 100) { // ���� �ӵ��� �߰��� �ӵ��� �����ؼ� 100���� ū�� Ȯ��
			speed = 100;
		} else {
			speed += aSpeed;
		}
	}
	
//	public int speedUp() {
//		  if (0 <= speed && speed <= 100) { //������ Ȱ��
//				speed += 10;
//				return speed;
//			}
//			else {
//				System.out.println("error");
//				return speed;
//			}
//		}
	
	// get �̳� set�� Ư���� ��쿡 ���°� ����.
	public void setSpeedUp () {
		if (speed + 10 > 100) { //�̰� 100 �� ������ ������ �������� 
			speed = 100 ; //������ 100���� 
		}
		else { //�ƴϸ� 
			speed += 10; //�⺻����
		}
	}
	
//	public void SpeedUp (int pSpeed) {
//		if (speed + pSpeed >100) {
//			speed = 100;
//		}
//		else {
//			speed += pSpeed;
//		}
//	}

	//�޸��� �ӵ� ����(�⺻ ����(10), �־��� �� ����) : 0 ~ 100 ���̸� ����
	public void speedDown () {
		if (speed - 10 < 0) {
			speed = 0;
		}
		else {
			speed -= 10;
		}
	}
	
	public void speedDown (int aSpeed) {
		if (speed - aSpeed < 0) {
			speed = 0;
		}
		else {
			speed -= aSpeed;
		}
	
	}
}