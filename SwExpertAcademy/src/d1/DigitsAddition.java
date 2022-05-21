package d1;

import java.util.Scanner;

public class DigitsAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        int value =0;
		while((T/10)!=0 || (T%10)!=0) {
			value += (T%10);
			T /= 10;
		}
		System.out.println(value);
	}

}
