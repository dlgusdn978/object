package d2;

import java.util.Scanner;

public class StringPattern {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			String s = sc.next();
			//char charArr[] = s.toCharArray(); //koreakoreakorea.....
			for(int i=1; i<=s.length();i++) {
				if(s.substring(0, i).contentEquals(s.substring(i,2*i))) {
					System.out.println("#" + test_case + " "+ i);
					break;
				}
			}
			
			
		/*	int i=1;
			while(!(s.substring(0, i).contentEquals(s.substring(i,2*i)))) {
				i++;
			}
			
			System.out.println("#" + test_case + " "+ i);
			*/
			
			/*for(int i=0; i<s.length()/2; i++) {
				//if(charArr[0]==charArr[i+1]);
				if(s.substring(0, i).contentEquals(s.substring(i,2*i))) {
					System.out.println("마디길이는 : "+ i);
				}
			}*/
		}
	}

}
