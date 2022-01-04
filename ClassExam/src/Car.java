
public class Car { //Car�� ��ü�� ������� �ϴ°�
	// ����, �ӵ��� ������� �� ����
	String carname;
	int carspeed;

	//�������� ��������
	public Car(String pCarName) {
		carname = pCarName;
	}
	
	// ����, �ӵ��� ��������
	public Car(String pCarName, int pCarSpeed) {
		carname = pCarName;
		carspeed = pCarSpeed;
	}
	
	// �Ű����� ���� �������� (����Ʈ) - �����ڸ� �� �ʿ��ϴ�
	// ����Ʈ�� �������� ��� �⺻�� ���� ('�ڵ���', 150)
	public Car () {
		carname = "�ڵ���";
		carspeed = 150;
	}
		
	// ������ ���� �Ǿ�� �ϱ� �޼��� - ȣ�� �� ����
	// get Car ���忡�� �ִ°� �׷��� return���� ���� �ִ�. CarText ���忡�� �������°�  
	// set Car ���忡�� �����ϴ°�. �������°� ��� void. CarText���忡���� ������ �䱸�ϴ°�. 
	// ����, �ӵ� ���� �б� get
	public String getCarName() {
		return carname;
	}
	
	public int getCarSpeed() {
		return carspeed;
	}
	
	// ����, �ӵ� ���� ���� set
	public void setCarName(String pCarName) {
		carname= pCarName;
	}
	public void setCarName (int pCarSpeed) {
		carspeed = pCarSpeed;
	}
	
	// ����, �ӵ� ���� ���� set 
	public void setCar(String pCarName, int pCarSpeed) {
		carname = pCarName;
		carspeed = pCarSpeed;
	}
	
	// �־��� ������ �ӵ� ����
	public void setSpeedUp(int pCarSpeed) {  
		carspeed += pCarSpeed; //carspeed = pCarSpeed + carspeed
	}
	
//	or  - return �ϴ°� ���� ����� �����ϱ� ���� �� return ������ �ʾƵ� ��. â�� ����ȭ/ �ϰ��� 
//	public int setSpeedUp(int pCarSpeed) {
//		carspeed += pCarSpeed; //carspeed = pCarSpeed + carspeed
//		return carspeed; 
//	}
	
	// �־��� ������ �ӵ� ���� 
	public void setSpeedDown(int pCarSpeed) {
		carspeed -= pCarSpeed;
	}

	//������ Ŭ�������� ��ü�����ϰ� �׽�Ʈ (5��)
		

}