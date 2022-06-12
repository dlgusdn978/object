package ch13;

public class Member {
	private int memberID;
	private String memberName;
	
	public Member(int memberID, String memberName){
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	//hashcode �����Ǹ� ���� �ּҰ� �ƴ� ��ü ���� ���� ��ȯ�ϰ�
	//equals �����Ǹ� ���� ���ΰ� ���ϰ� �ش� ��ü�� ȣ��
	//�ߺ����� �����ϸ� �˻� ������ ȿ������ �ӵ� �����϶�
	//�ߺ����� �����ϴ� ��� ���� ����� ��ü�� value�� �����.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(this.memberID == member.memberID) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberID;
	}

	@Override
	public String toString() {
		return "ID��" + memberID + " �̸���" + memberName;
	}
}
