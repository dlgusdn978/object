package d1;

import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			int Max=0;
			for(int i=0; i<10; i++) {
				int F = sc.nextInt();
				if(F>Max) {
					Max = F;
				}
			}
			System.out.println("#"+test_case+" "+Max);

		}
	}

}
