package ch13;

import java.util.TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("ȫ�浿");
		set.add("������");
		set.add("�̼���");
		
		System.out.println(set);
		
		
		/*MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member kim = new Member(1000, "kim");
		Member lee = new Member(1001, "lee");
		Member kang = new Member(1002, "kang");
		Member ko = new Member(1001, "ko");
		
		memberTreeSet.addMember(kim);
		memberTreeSet.addMember(lee);
		memberTreeSet.addMember(kang);
		memberTreeSet.addMember(ko);
		
		memberTreeSet.showAllMember();
	
		
		 */
	}
}
