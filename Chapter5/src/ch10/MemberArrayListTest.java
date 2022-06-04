package ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member kim = new Member(1000, "kim");
		Member lee = new Member(1001, "lee");
		Member kang = new Member(1002, "kang");
		
		memberArrayList.addMember(kim);
		memberArrayList.addMember(lee);
		memberArrayList.addMember(kang);
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(1001);
		System.out.println();
		memberArrayList.showAllMember();
		
		 
	}
}
