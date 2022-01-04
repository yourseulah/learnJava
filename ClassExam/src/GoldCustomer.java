
public class GoldCustomer extends Customer {
	
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName); //부모클래스의 생성자 (매개변수 2개짜리, 디폴트 말고) 호출 (자동으로 호출안됨)
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	//메서드 오버라이딩
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //bonusPoint 업데이트, 가격반환 
		return price - (int)(price * saleRatio); //price는 int형 salesRatio는 double형 따라서 casting 해줘야함
	}
	
	//showCustomerInfo() 메서드는 상위클래스 그대로 사용 
	

	
	
}
