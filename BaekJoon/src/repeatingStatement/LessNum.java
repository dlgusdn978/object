package repeatingStatement;

import java.io.IOException;
import java.util.Scanner;

public class LessNum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int intNum = sc.nextInt();
		int num = sc.nextInt();
		
		int arr[] = new int[intNum];
		
		for(int i=0; i<intNum; i++) {
			int num2 = sc.nextInt();
			arr[i]=num2;
		}
		for(int i=0; i<intNum; i++) {
			if(arr[i]<num) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
