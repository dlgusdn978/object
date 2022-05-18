package ch02;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의  등급은" + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다. ";
	}
	
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	//클래스 상속은 이미 구현된 클래스를 상속받아서 속성이나 기능을 확장하여 클래스를 구현함.
	//구현된 클래스보다 더 구체적인 기능을 가진 클래스를 구현해야할 때 기존 클래스 상속. 
	//if else 구문이 너무 많으면 상속을 생각해볼 여지가 있음.
}
