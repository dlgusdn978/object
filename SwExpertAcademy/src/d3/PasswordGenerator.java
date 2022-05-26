package d3;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int arr[] = new int[9];
			arr[0]=0;
			
			for(int i=1; i<=8;i++) {//8자리 수를 입력받음. 9550 9556 9550 9553 9558 9551 9551 9551
				arr[i] = sc.nextInt();
			}
			
			while(arr[8]>0) {
				for(int i=1; i<=5; i++) {
					for(int j=0; j<=7; j++) {
						arr[j] = arr[j+1];
						
					}
				
				arr[8]= arr[0];
				arr[8]-=i;
				}
			}
			//1, 4, 5, 6, 7, 9, 
			arr[8]=0;
			System.out.print("#"+test_case+" ");
			for(int i=1; i<=8;i++) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
