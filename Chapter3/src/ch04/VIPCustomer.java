package ch04;

public class VIPCustomer extends Customer {

	double salesRatio;
	String agentID;
	
	public VIPCustomer() {
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

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int) price * salesRatio;
		return super.calcPrice(price);
	}
	
}
