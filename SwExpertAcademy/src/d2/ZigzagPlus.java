package d2;

import java.util.Scanner;

public class ZigzagPlus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			int sum = 0;
			for(int i=1; i<=N; i++) {
				if(i%2==1) {
					arr[i-1]=i;
				}else {
					arr[i-1]=-i;
				}
			}
			for(int j=1; j<=N; j++){
				sum += arr[j-1];
			}
			System.out.println("#"+test_case+" "+sum);
		}

	}

}
