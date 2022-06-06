package repeatingStatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FastPlustOneToN {

	public static void main(String[] args) throws IOException {
		//여러 줄을 입력받을 때 시간초과 우려.
		//BufferedReader, BufferedWriter 사용.
		//마지막에 BufferedWriter.flush
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String T = br.readLine();
		int t = Integer.parseInt(T);
		StringTokenizer s = new StringTokenizer(T);
		
		for(int i=1; i<=t; i++) {
			s = new StringTokenizer(br.readLine());
			bw.write(Integer.parseInt(s.nextToken())+Integer.parseInt(s.nextToken())+"\n");
		}
		bw.close();
	}

}
