
public class ComputerTest {

	public static void main(String[] args) {
		// Computer c1 = new Computer(); //�߻�Ŭ���� ��ü�� ��ü ������ ���� �ʴ´� - ���� Ʋ������

		Computer c2 = new DeskTop();
		c2.turnOn();
		c2.display();
		c2.typing();
		c2.turnOff();

	}

}
