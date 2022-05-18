package ch01;

public class VIPCustomer extends Customer {

	double salesRatio;
	String agentID;
	
	public VIPCustomer(int customerID, String customerName) {
		
		super(customerID, customerName);
		//super는 하위클래스가 상위클래스의 참조 값을 가진다.
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	
	
	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
}
