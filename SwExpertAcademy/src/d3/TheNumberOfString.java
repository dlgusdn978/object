package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TheNumberOfString {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int test_case=1; test_case<=10; test_case++) {
			int T = Integer.parseInt(br.readLine());
			String string = br.readLine();
			String sentence = br.readLine();
			int count =0;
			
			for(int i=0; i<=sentence.length()-string.length();i++) {
				if(string.equals(sentence.substring(i, i+string.length()))) {
					count++;
				}
			}
			
			System.out.println("#"+test_case+" "+count);
		}
	}
}
