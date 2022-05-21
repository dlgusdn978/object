package d2;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {//케이스 반복문
			int F = sc.nextInt();
			System.out.println("#"+test_case);
			int[][] arr = new int[F][F];
			int sum =0;
			for(int i=1; i<=F; i++) {
				for(int j=1; j<=i; j++) {
					if(i==j||j==1) {
						arr[i-1][j-1]=1;
						System.out.print(arr[i-1][j-1]);
						System.out.print(" ");
					} else {
						//System.out.print((int)arr[i-2][j-1]+(int)arr[i-1][j]);
						arr[i-1][j-1] = arr[i-2][j-2]+arr[i-2][j-1];
						System.out.print(arr[i-1][j-1]);
						System.out.print(" ");
						
					}
					//System.out.print(j);
				}
				System.out.println();
			}
		}
		//i=4, j=1 
		//0행0열 1
		//1행 0열 1, 1행 1열 1
		//2행 0열 1, 2행 1열 2, 2행2열 1
		//3행 0열 1, 3행 1열 3(42), 3행 2열 3, 3행 3열 1
	}

}
