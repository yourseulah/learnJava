
public class GoldCustomer extends Customer {
	
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName); //�θ�Ŭ������ ������ (�Ű����� 2��¥��, ����Ʈ ����) ȣ�� (�ڵ����� ȣ��ȵ�)
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	//�޼��� �������̵�
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //bonusPoint ������Ʈ, ���ݹ�ȯ 
		return price - (int)(price * saleRatio); //price�� int�� salesRatio�� double�� ���� casting �������
	}
	
	//showCustomerInfo() �޼���� ����Ŭ���� �״�� ��� 
	

	
	
}
