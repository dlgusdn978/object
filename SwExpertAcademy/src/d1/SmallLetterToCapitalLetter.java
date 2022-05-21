package d1;

import java.util.Scanner;

public class SmallLetterToCapitalLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char charArr[] = s.toCharArray();
		
		for(int i=0; i<charArr.length; i++) {
			if(charArr[i]>=97 && charArr[i]<=122) {
				charArr[i] -= 32;	
			}
		}
		System.out.println(charArr);
	}
}
