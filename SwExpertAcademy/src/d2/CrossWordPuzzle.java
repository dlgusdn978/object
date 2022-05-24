package d2;

import java.util.Scanner;

public class CrossWordPuzzle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int N = sc.nextInt(); // ����, ������ ����
			int K = sc.nextInt(); // �ܾ��� ����
			int arr[][] = new int[N][N];
			for(int i=1; i<=N; i++) {// ������ �迭 N�� N�� �����.
				for(int j=1; j<=N; j++) {
					arr[i-1][j-1]=sc.nextInt(); //�Է� ���� ���� �迭�� ������� ����. 
				}
			}
			//��������� �迭�� ��� ���� ���� ����.
			
			int correctWord=0;
			
			for(int i=1;i<=N;i++) {//���ο� �ܾ���� k��ŭ�� ������ �ִ��� üũ
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
				
			}//���ο��� �������� ã��.
			
			for(int i=1; i<=N; i++) {//���ο� �ܾ���� k��ŭ�� ������ �ִ��� üũ.
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
				
			}//���ο��� �������� ã��.
			System.out.println("#"+test_case+" "+correctWord);
		}

	}

}
