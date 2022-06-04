package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member kim = new Member(1000, "kim");
		Member lee = new Member(1001, "lee");
		Member kang = new Member(1002, "kang");
		Member ko = new Member(1001, "ko");
		
		memberHashSet.addMember(kim);
		memberHashSet.addMember(lee);
		memberHashSet.addMember(kang);
		memberHashSet.addMember(ko);
		
		memberHashSet.showAllMember();
	
		
		 
	}
}
