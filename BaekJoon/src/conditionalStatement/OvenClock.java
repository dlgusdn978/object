package conditionalStatement;

import java.util.Scanner;

public class OvenClock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int runtime = sc.nextInt();
		
		if(minute + runtime<60) {
			System.out.println(hour+" "+(minute+runtime));
		} else if (minute + runtime >=60){
			int hRuntime = (hour+((minute+runtime)/60));
			int mRuntime = (minute+runtime)%60;
			
			if(hRuntime >=24) {
				System.out.println((hRuntime-24)+" "+mRuntime);
			} else {
				System.out.println(hRuntime+" "+ mRuntime);
			}
		} 

	}

}
