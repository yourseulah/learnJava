
// 2021/12/30 pg 262
public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	//총 사용할수 있는 변수 7개 부모클라스에 있는 거 합쳐서
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); //부모클래스의 생성자 (매개변수 2개짜리, 디폴트 말고) 호출 (자동으로 호출안됨)
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	//메서드 오버라이딩
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //bonusPoint 업데이트, 가격반환 
		return price - (int)(price * saleRatio); //price는 int형 salesRatio는 double형 따라서 casting 해줘야함
	}	
	
	//메서드 오버라이딩
	public String showCustomerInfo() {
//		return customerName + ":" + customerGrade + ":" + bonusPoint; 이 내용을 고스란히 사용하면서
		return super.showCustomerInfo()	+ ":" + agentID;
		
	}
	
	
	
}
