package d2;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int numberOfStudent = sc.nextInt();
			int studentNumber = sc.nextInt();
			double[] total = new double[numberOfStudent];
			double[] sortedTotal = new double[numberOfStudent];
			
			for(int i=0; i<numberOfStudent; i++) {
				int midT = sc.nextInt();
				int finalT = sc.nextInt();
				int hw = sc.nextInt();
				total[i] = (double)(midT*0.35)+(double)(finalT*0.45)+(double)(hw*0.2);
				sortedTotal[i] = total[i];
			}
			Arrays.sort(sortedTotal);
			
			for(int j=0; j<numberOfStudent;j++) {
				if(total[studentNumber-1]==sortedTotal[j]) { //4번재 학생의 점수와 sortedTotal 배열의 j번째 점수가 같으면
					int rank = (numberOfStudent - j);
					if (rank <= numberOfStudent/10) {
						System.out.println("#"+test_case+" A+");
					} else if(rank<= (numberOfStudent/10)*2) {
						System.out.println("#"+test_case+" A0");
					}else if(rank<= (numberOfStudent/10)*3) {
						System.out.println("#"+test_case+" A-");
					}else if(rank<= (numberOfStudent/10)*4) {
						System.out.println("#"+test_case+" B+");
					}else if(rank<= (numberOfStudent/10)*5) {
						System.out.println("#"+test_case+" B0");
					}else if(rank<= (numberOfStudent/10)*6) {
						System.out.println("#"+test_case+" B-");
					}else if(rank<= (numberOfStudent/10)*7) {
						System.out.println("#"+test_case+" C+");
					}else if(rank<= (numberOfStudent/10)*8) {
						System.out.println("#"+test_case+" C0");
					}else if(rank<= (numberOfStudent/10)*9) {
						System.out.println("#"+test_case+" C-");
					}else {
						System.out.println("#"+test_case+" D0");
					}
				}
			}
			
			
		}
	}

}
