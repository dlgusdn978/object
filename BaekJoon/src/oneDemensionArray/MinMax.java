package oneDemensionArray;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		
		int min = Integer.MAX_VALUE;
		int max = 0;
		for(int i=0; i<T; i++) {
			arr[i]=sc.nextInt();
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(min+" "+max);

	}

}
