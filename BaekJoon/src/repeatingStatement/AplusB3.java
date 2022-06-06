package repeatingStatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AplusB3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for(int i=1; i<=T; i++) {
			String str = br.readLine();
			st = new StringTokenizer(str);
			String[] arr = str.split(" ");
			int plus = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
			bw.write("Case #"+i+": "+arr[0]+" + "+arr[1]+" = "+plus+"\n");
		}
		bw.close();
	}

}
