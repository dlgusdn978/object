package d1;

import java.util.Scanner;

public class DigitsAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   ���� ���� �׽�Ʈ ���̽��� �־����Ƿ�, ������ ó���մϴ�.
		*/

        int value =0;
		while((T/10)!=0 || (T%10)!=0) {
			value += (T%10);
			T /= 10;
		}
		System.out.println(value);
	}

}
