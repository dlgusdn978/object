package repeatingStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintlnN {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int i=1; i<=T; i++) {
			System.out.println(i);
		}
	}

}
