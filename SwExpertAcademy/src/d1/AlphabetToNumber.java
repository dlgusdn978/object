package d1;

import java.util.Scanner;

public class AlphabetToNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] charArr = s.toCharArray();
		for(int i=0; i<charArr.length;i++) {
			System.out.print(charArr[i]-64+" ");
		}
	}

}
