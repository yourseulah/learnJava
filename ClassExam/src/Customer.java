
public class Customer {
// 11/30 ����̶� pg 232 - 234  ====   12/30 pg 262
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//����Ʈ ������
	public Customer() {	
		intiCustomer();
	}
	
	//�����ε��� ������ 
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName; 
		intiCustomer();
	}
	
	//CustomerTest1�� �̸��������پ��� ���ؼ� get set �Է� 
	public String getCusotmerName() {
		return customerName;
	}

	
	// �����ڿ��� ����� �޼���
	private void intiCustomer() {  // public ��� private���� ���൵ ������� - ���������� �ܺο��� ���� �Ұ����ϵ���
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //bonusPoint ������Ʈ, ���ݹ�ȯ 
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + ":" + customerGrade + ":" + bonusPoint;
		
	}
}
