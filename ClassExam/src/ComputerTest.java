
public class ComputerTest {

	public static void main(String[] args) {
		// Computer c1 = new Computer(); //추상클래스 자체는 객체 생성을 하지 않는다 - 따라서 틀린문법

		Computer c2 = new DeskTop();
		c2.turnOn();
		c2.display();
		c2.typing();
		c2.turnOff();

	}

}
