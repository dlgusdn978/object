package conditionalStatement;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		if(T%100==0) {
			if(T%400==0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		} else if(T%4==0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
