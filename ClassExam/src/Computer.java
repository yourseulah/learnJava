// �߻� Ŭ���� abstract class pg 281


public abstract class Computer {  //�ϳ��� �߻�޼��尡 �������ٸ� �߻�Ŭ�󽺷� �������־�� �Ѵ�. �߻�Ŭ�󽺰� �ִٴ°� �ȿ� ����Ŭ�󽺵鿡�� ������ �ֱ� ���Ѱ�.
	//public void display(); //�������� - ������ ����.
	//public void typing();  //�������� - ������ ����.
	
	public abstract void display(); // �߻� �޼���
	public abstract void typing(); // �߻� �޼���
	
	public void turnOn() {
		System.out.println("������ �Ҵ�.");
	}
	public void turnOff() {
		System.out.println("������ ����.");
	}
}
