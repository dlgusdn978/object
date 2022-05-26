package d2;

import java.util.Scanner;

public class PlusHour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int h1 = sc.nextInt(); int m1 = sc.nextInt(); 
			int h2 = sc.nextInt(); int m2 = sc.nextInt();
			int newHour = h1+h2;
			int newMinute = m1+m2;
			if(newHour>12 && newMinute>=60) {
				newHour -= 11;
				newMinute -= 60;
			} else if(newHour>12) {
				newHour -= 12;
			} else if(newMinute>=60) {
				newMinute -= 60;
				newHour += 1;
				if(newHour>12) {
					newHour -= 12;
				}
			}
			System.out.println("#"+test_case+" "+newHour+" "+newMinute);
		}

	}

}
