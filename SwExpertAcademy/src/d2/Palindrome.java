package d2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			String word = sc.next(); //���� �Է¹���
			char arr[] = word.toCharArray();//�Է¹޾Ƽ� �迭 ĭ���� ���ĺ�
			int sum=0;
			for(int i=0; i<Math.ceil(arr.length/2);i++) {
				if(arr[i]==arr[arr.length-i-1]) {
					sum++;
				} 
			}
			if(sum==Math.ceil(arr.length/2)) {
				System.out.println("#"+test_case+" "+1);
			} else {
				System.out.println("#"+test_case+" "+0);
			}

	}

}
}