package d2;

import java.util.Scanner;

public class MatrixMaxValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		//NxN 행렬의 값을 더해서 새로운 행렬을 만들어 대입하고 합연산?
		for(int test_case=1; test_case<=T; test_case++) {
			int F = sc.nextInt();
			sc.nextInt();
			int N = sc.nextInt();
			sc.nextInt();
			int[][] arr = new int[F][F];
			
			for(int i=0; i<F; i++) {
				for(int j=0; j<F; j++) {
					arr[i][j]=sc.nextInt();
					
				}
			}
			//첫 행렬에 값 넣는 것까지 완성.
			//이제 해야할 일은 값 더해서 두번째 행렬로.
			
			
			int max=0;
			for(int i=0; i<F-N+1; i++) {
				for(int j=0; j<F-N+1; j++) {
					int tmp=0;
					for(int k=0; k<N; k++) {
						for(int l=0; l<N; l++) {
							tmp += arr[i+k][j+l];
							if(max<tmp) {
								max=tmp;
								
							}
						}
						
					}
						
				}
			}
			System.out.println("#"+test_case+" "+max);
			sc.nextLine();
		}
	}

}
