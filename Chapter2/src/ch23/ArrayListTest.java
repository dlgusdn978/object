package ch23;

import java.util.ArrayList;
import java.util.Scanner;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();
		System.out.print("�� �� �Է��Ͻ�? : ");
		Scanner scan = new Scanner(System.in);
		int userValue = scan.nextInt();
		
		for(int j = 0; j<userValue; j++) {
			library.add(new Book("�¹���"+(j+1), "������"));
			library.get(j).showInfo();
		}
		System.out.println("�Ҵ�� �迭�� ������ : " + library.size());
		
		
		
	}
}
