package ch01;

public class VIPCustomer extends Customer {

	double salesRatio;
	String agentID;
	
	public VIPCustomer(int customerID, String customerName) {
		
		super(customerID, customerName);
		//super�� ����Ŭ������ ����Ŭ������ ���� ���� ������.
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
