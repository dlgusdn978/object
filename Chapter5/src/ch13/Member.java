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
	//hashcode 재정의를 통해 주소가 아닌 객체 내부 값을 반환하고
	//equals 재정의를 통해 내부값 비교하고 해당 객체를 호출
	//중복값이 존재하면 검색 연산의 효율성과 속도 대폭하락
	//중복값이 존재하는 경우 먼저 선언된 객체의 value로 덮어씌움.
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
		return "ID는" + memberID + " 이름은" + memberName;
	}
}
