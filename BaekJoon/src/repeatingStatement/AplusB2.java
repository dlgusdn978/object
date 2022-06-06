package repeatingStatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AplusB2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for(int i=1; i<=T; i++) {
			st = new StringTokenizer(br.readLine());
			int plus = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
			bw.write("Case #"+i+": "+plus+"\n");
		}
		bw.close();
	}

}
