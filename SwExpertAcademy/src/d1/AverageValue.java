package d1;

import java.util.Scanner;

public class AverageValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			double sum =0;
			for(int i=0; i<10; i++) {
				T=sc.nextInt();
				sum += T;
			}
			System.out.println("#"+test_case+" "+Math.round(sum/10));
	
		}
	}
	
	//Math.round �� ���� �ݿø�
	//Math.ceil �� ���� �ø�
	//Math.floor �� ���� ����

}
