package d1;

import java.util.Scanner;

public class CalendarCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			Scanner scan = new Scanner(System.in);
			String date = scan.nextLine();
			String year = date.substring(0,4);
			String month = date.substring(4,6);
			String day = date.substring(6,date.length());
			
			int iMonth = Integer.parseInt(month);
			int iDay = Integer.parseInt(day);
			switch(Integer.parseInt(month)) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if(iDay>0 && iDay<=31) {
					System.out.println("#"+test_case+" "+year+"/"+month+"/"+day);
				} else{
					System.out.println("#"+test_case+" "+(-1));
				}
				break;
			case 2:
				if(iDay>0 && iDay<=28) {
					System.out.println("#"+test_case+" "+year+"/"+month+"/"+day);
				} else{
					System.out.println("#"+test_case+" "+(-1));
				}
				break;
			case 4: case 6: case 9: case 11:
				if(iDay>0 && iDay<=30) {
					System.out.println("#"+test_case+" "+year+"/"+month+"/"+day);
				} else{
					System.out.println("#"+test_case+" "+(-1));
				}
				break;
				default:
					System.out.println("#"+test_case+" "+(-1));
			}
			
		}
	}
}
