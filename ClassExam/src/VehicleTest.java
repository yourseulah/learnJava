import java.util.*;


public class VehicleTest {

	public static void main(String[] args) {
		// ArrayList ���
		ArrayList<Vehicle> vList = new ArrayList<Vehicle>();// ���� ��ü�� ������ �迭
		Vehicle v1 = new Sedan("Ƽ��"); //������ ���� ������ �Ű������� �ϳ��ִ°ɷ� ��������ϱ�
		Vehicle v2 = new Suv("�ڳ�");
		Vehicle v3 = new Truck("����");
		Vehicle v4 = new Sedan("��Ƽ��");
		Vehicle v5 = new Truck("��������");
		
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);
		vList.add(v5);
		//�Ʒ��� ���� ���� �� �߰��ص� ��
		//vList.add(new Sedan()); 9���� �Ǵ� 12���ΰ� ����
		for (Vehicle v : vList ) { //���� for ����
			v.move(); //������ ��ü�� �°� ȣ���(������)
			
		}
		
		
	}

}
