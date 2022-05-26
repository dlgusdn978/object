package d2;

import java.util.Scanner;

public class Sudoku {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int[][] sudoku = new int[10][10];
			
			for(int i=1; i<=9; i++) { // ���� for�� ����ؼ� 9x9 �迭 ���� �� �� ����
				for(int j=1; j<=9; j++) {
					sudoku[i][j]= sc.nextInt();
				}
			}
			
			
			int tlCorrect = 0;
			int bCorrect = 0;
			for(int i=1; i<=9; i++) {//������ ��, ������ ���� 45�� �´��� Ȯ��.
				int transverse = 0;
				int length = 0;
				
				for(int j=1; j<=9; j++) {
					transverse += sudoku[i][j];
					length += sudoku[j][i];
				}
				if(transverse==45 && length==45) {
					tlCorrect++;
				}
				
				
			}
			
			
			
			for(int i=0; i<3; i++) {// ū 3x3��� ����
				for(int j=0; j<3; j++) {		
					int block=0;
					for(int k=0; k<3; k++) {//���� 3x3��� ����.
						for(int l=0; l<3; l++) {// 3x3����� ��?
							block += sudoku[(3*i+1)+k][(3*j+1)+l];
						}
					}
					if(block==45) {
						bCorrect++;
					}
				}
			}

			if(tlCorrect==bCorrect) {
				System.out.println("#"+test_case+" "+1);
			} else {
				System.out.println("#"+test_case+" "+0);
			}
			
			
			
		}
	}
}
