
// 2021/12/30 pg 262
public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	//�� ����Ҽ� �ִ� ���� 7�� �θ�Ŭ�󽺿� �ִ� �� ���ļ�
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); //�θ�Ŭ������ ������ (�Ű����� 2��¥��, ����Ʈ ����) ȣ�� (�ڵ����� ȣ��ȵ�)
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	//�޼��� �������̵�
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //bonusPoint ������Ʈ, ���ݹ�ȯ 
		return price - (int)(price * saleRatio); //price�� int�� salesRatio�� double�� ���� casting �������
	}	
	
	//�޼��� �������̵�
	public String showCustomerInfo() {
//		return customerName + ":" + customerGrade + ":" + bonusPoint; �� ������ ������ ����ϸ鼭
		return super.showCustomerInfo()	+ ":" + agentID;
		
	}
	
	
	
}
