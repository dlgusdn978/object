package conditionalStatement;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		if(minute >=45 && minute <=59) {
			System.out.println(hour + " " +(minute-45));
		} else if(minute >=0 && minute <45) {
			if(hour>=1 && hour<=23) {
				System.out.println((hour-1)+" "+(minute+15));
			} else if(hour==0) {
				System.out.println((hour+23)+" "+(minute+15));
			}
		}

	}

}
