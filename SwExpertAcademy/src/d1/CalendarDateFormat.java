package d1;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CalendarDateFormat {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++){
		try {
			Scanner scan = new Scanner(System.in);
			String strDate = scan.nextLine();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			sdf.setLenient(false);
			Date date = new Date(sdf.parse(strDate).getTime());
			SimpleDateFormat slashSdf = new SimpleDateFormat("yyyy/MM/dd");
			String sDate = slashSdf.format(date);
			
			System.out.println("#"+test_case+"/t"+ sDate);
		} catch(ParseException e) {
			System.out.println("#"+test_case+"\n"+(-1));
		}
	}
	}

}
