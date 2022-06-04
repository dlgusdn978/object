package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	
	private HashSet<Member> arrayList;
	public MemberHashSet() {
		arrayList = new HashSet<>();
	}
	public MemberHashSet(int size) {
		arrayList = new HashSet<>(size);
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberID) {
		/*for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				arrayList.remove(i);
				return true;
			}
					
		}
		*/
		
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberID + "¾øÀ½");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
 
		}
	}
}
