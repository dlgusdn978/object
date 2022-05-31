package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecorateWall {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		
		for(int test_case=1; test_case<=T; test_case++) {
			int N = Integer.parseInt(bf.readLine());
			int A = Integer.parseInt(bf.readLine());
			int B = Integer.parseInt(bf.readLine());
			
			int min1= Integer.MAX_VALUE;
			
			for(int R=1; R<=N; R++) {
				for(int C=1; C*R<=N && C<=R; C++) {
					int min = A*(R-C)+B*(N-R*C);
					min1 = Math.min(min, min1);
				}

			// 1*[r-c]+1*[37-r*c]
			
			}
			System.out.println("#"+test_case+" "+min1);
		}
	}

}
