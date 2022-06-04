package ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	public MemberArrayList(int size) {
		arrayList = new ArrayList<>(size);
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
