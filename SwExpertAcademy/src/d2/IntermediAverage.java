package d2;

import java.util.Scanner;

public class IntermediAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int arr[] = new int[10];
			int max=0;
			int min=10000;
			int avg=0;
			for(int i=0; i<10; i++) {
				arr[i] = sc.nextInt();
				avg += arr[i];
			}
			for(int j=0; j<10; j++) {
				if(arr[j]>max) {
					max = arr[j];
				}
				if(arr[j]<min) {
					min = arr[j];
				}
			}

			System.out.println("#"+test_case+" "+(int)Math.round((double)(avg-max-min)/8));
			//math.ceil은 올림 .floor는 내림, .round는 반올림
		}
		

	}

}
