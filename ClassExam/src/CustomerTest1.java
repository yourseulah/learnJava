import java.util.*;

public class CustomerTest1 {

	public static void main(String[] args) {
		// Ŭ�� ��� �׽�Ʈ
		//Customer cus = new Customer(); //�θ�(����)Ŭ���� ��ü ���� 
		//VIPCustomer vip = new VIPCustomer(); //�ڽ�(����)Ŭ���� ��ü ����
		//System.out.println(vip.bonusPoint); //����Ŭ���� ������� ��밡�� 
		//System.out.println(vip.customerID); //���� Ŭ���� ��������� protected�� ����Ǿ��� ��� ���� ���� 
		ArrayList<Customer> customerList = new ArrayList<Customer>(); //ArryaList�� ������ ��ǵ� ��ܿ� import java.util* �߰�
		Customer a1 = new Customer(1001, "�̼���");
		Customer a2 = new Customer(1002, "�Ż��Ӵ�");
		Customer a3 = new GoldCustomer(1003, "ȫ�浿");
		Customer a4 = new GoldCustomer(1004, "������");
		Customer a5 = new VIPCustomer(1005, "������", 1234);
		customerList.add(a1);
		customerList.add(a2);
		customerList.add(a3);
		customerList.add(a4);
		customerList.add(a5);
		
		System.out.println("============�⺻����=============");
		for(int i = 0; i < customerList.size(); i++	) {
			Customer abc = customerList.get(i); // �־��� �ε����� ��ü ��ȯ 
			System.out.println(abc.showCustomerInfo());
		}
		// : �����ʿ� �ִ� �ָ� �������� �̾ƿ´�. item�� ��� ��������ϱ� ���ŵǴϱ� 
		System.out.println("============�⺻����=============");
		for(Customer item : customerList) { //downcasting?
			System.out.println(item.showCustomerInfo());
		}
		
		System.out.println("=========�������� price=========");
		int price = 10000; 
		for(Customer item: customerList) { //item ��������
			int cost = item.calcPrice(price); //�ݾ��� ��ȯ�ǰ� ���ʽ��� ���ο� ����
			System.out.println(item.getCusotmerName() + "�ݾ� : " + cost);
		//�̸��� �̾ƾ��� ���ؼ� CustomerŬ�󽺿� get set �Է� 	
	
		}

		System.out.println("========�� ������ ��ް� price =======");
		for(Customer item : customerList) { 
			System.out.println(item.showCustomerInfo());
		}
	}

}























