package d2;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {//���̽� �ݺ���
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
		//0��0�� 1
		//1�� 0�� 1, 1�� 1�� 1
		//2�� 0�� 1, 2�� 1�� 2, 2��2�� 1
		//3�� 0�� 1, 3�� 1�� 3(42), 3�� 2�� 3, 3�� 3�� 1
	}

}
