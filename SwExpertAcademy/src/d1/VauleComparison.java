package d1;

import java.util.Scanner;

public class VauleComparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int A=sc.nextInt();
			int F=sc.nextInt();
			
			if(A<F) {
				System.out.println("#"+test_case+" <");
			} else if (A==F) {
				System.out.println("#"+test_case+" =");
			} else {
				System.out.println("#"+test_case+" >");
			}

		}
		sc.close();
	}

}
