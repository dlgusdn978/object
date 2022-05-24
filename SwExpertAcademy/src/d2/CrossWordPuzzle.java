package d2;

import java.util.Scanner;

public class CrossWordPuzzle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int N = sc.nextInt(); // 가로, 세로의 길이
			int K = sc.nextInt(); // 단어의 길이
			int arr[][] = new int[N][N];
			for(int i=1; i<=N; i++) {// 이차원 배열 N행 N열 만들기.
				for(int j=1; j<=N; j++) {
					arr[i-1][j-1]=sc.nextInt(); //입력 받은 값을 배열에 순서대로 넣음. 
				}
			}
			//여기까지가 배열에 모든 값을 넣은 상태.
			
			int correctWord=0;
			
			for(int i=1;i<=N;i++) {//가로에 단어길이 k만큼의 공간이 있는지 체크
				int able=0;
				for(int j=1; j<=N; j++) {
					if(arr[i-1][j-1]==1) {
						able++;
					} else if(arr[i-1][j-1]==0) {
						if(able==K) {
							correctWord++;
							able=0;
						} else {
							able=0;
						}
					}
					
				}
				
				if(able==K) {
					correctWord++;
				}
				
			}//가로에서 최적공간 찾음.
			
			for(int i=1; i<=N; i++) {//세로에 단어길이 k만큼의 공간이 있는지 체크.
				int able=0;
				for(int j=1; j<=N; j++) {
					if(arr[j-1][i-1]==1) {
						able++;
					} else if(arr[j-1][i-1]==0) {
						if(able==K) {
							correctWord++;
							able=0;
						} else {
							able=0;
						}
					}
				}
				if(able==K) {
					correctWord++;
				}
				
			}//세로에서 최적공간 찾음.
			System.out.println("#"+test_case+" "+correctWord);
		}

	}

}
