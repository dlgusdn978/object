package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=T; tc++) {
			String str = br.readLine();
			String sy = str.substring(0,4);
			String sm = str.substring(4,6);
			String sd = str.substring(6,8);
			
			int y = Integer.parseInt(str.substring(0, 4));
			int m = Integer.parseInt(str.substring(4, 6));
			int d = Integer.parseInt(str.substring(6, 8));
			
			if(m == 1 || m==3 || m==5 || m==7|| m==8|| m==10|| m==12) {
				if(d>=1 && d<=31) {
					System.out.println("#"+tc+" "+sy+"/"+sm+"/"+sd);
				} else {
					System.out.println("#"+tc+" "+-1);
				}
				
			} else if(m==4|| m==6|| m==9||m==11) {
				if(d>=1 && d<=30) {
					System.out.println("#"+tc+" "+sy+"/"+sm+"/"+sd);
				}else {
					System.out.println("#"+tc+" "+-1);
				}
				
			} else if(m==2) {
				if(d>=1 && d<=28) {
					System.out.println("#"+tc+" "+sy+"/"+sm+"/"+sd);
				} else {
					System.out.println("#"+tc+" "+-1);
				}
			} else {
				System.out.println("#"+tc+" "+-1);
			}
		}
	}

}
