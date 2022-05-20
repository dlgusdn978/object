package d1;

import java.util.Arrays;
import java.util.Scanner;

public class IntermediateValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int arr[] = new int[T];
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int F = sc.nextInt();
			arr[test_case-1]=F;
		}
		Arrays.sort(arr);
		System.out.println(arr[T/2]);
	}
	//정렬쓰면 인덱싱을 통해 중간 값 찾기 수월함.

}
