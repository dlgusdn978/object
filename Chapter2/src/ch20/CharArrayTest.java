package ch20;

public class CharArrayTest {

	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char ch = 'A';
		
		//�迭�� �� ������ ���ڿ� ����
		for(int i = 0; i<alphabets.length; i++) {
			alphabets[i] = ch++;
		}
		//character type�� alpha ������ �����ϰ� alphabets �迭�� ��� ����ŭ �ݺ���
		for(char alpha : alphabets) {
			System.out.println( alpha + ", "+ (int) alpha);
		}
	}
}
