package ch23;

import java.util.ArrayList;
import java.util.Scanner;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();
		System.out.print("몇 권 입력하실? : ");
		Scanner scan = new Scanner(System.in);
		int userValue = scan.nextInt();
		
		for(int j = 0; j<userValue; j++) {
			library.add(new Book("태백산맥"+(j+1), "조정래"));
			library.get(j).showInfo();
		}
		System.out.println("할당된 배열의 공간은 : " + library.size());
		
		
		
	}
}
