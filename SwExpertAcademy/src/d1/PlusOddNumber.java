package d1;

import java.util.Scanner;
import java.io.FileInputStream;

class PlusOddNumber
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) // 3줄 
		{
			int sum = 0;
			for(int j=0; j<10; j++) { // 10개 입력받기
				T=sc.nextInt();
				if(T%2==1) {
					sum += T;
				}
			}
			System.out.println("#"+test_case+" "+sum);
		}
	}
}