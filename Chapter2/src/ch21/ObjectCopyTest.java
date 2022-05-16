package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
				Book[] library = new Book[5];
				Book[] copyLibrary = new Book[5];
		
		/*		for(int i = 0; i<library.length; i++) {
					System.out.println(library[i]);
				}*/
				library[0] = new Book("태백산맥1", "조정래");
				library[1] = new Book("태백산맥2", "조정래");
				library[2] = new Book("태백산맥3", "조정래");
				library[3] = new Book("태백산맥4", "조정래");
				library[4] = new Book("태백산맥5", "조정래");
				
				copyLibrary[0] = new Book();
				copyLibrary[1] = new Book();
				copyLibrary[2] = new Book();
				copyLibrary[3] = new Book();
				copyLibrary[4] = new Book();
				
				
				//System.arraycopy(library, 0, copyLibrary, 0, 5);
				// 얕은 복사 수행. 주소만 복사해서 해당 값을 가리킴. 실제 값을 복사하는 것은 아님.
				// 원 객체의 값이 변하면 복사한 객체 내 값도 변화함.
				
				library[0].setAuthor("박완서");
				library[0].setTitle("나목");
				
				for(int i=0; i<library.length; i++) {
					copyLibrary[i].setAuthor(library[i].getAuthor());
					copyLibrary[i].setTitle(library[i].getTitle());
				}
				// 깊은 복사 수행. 실제 배열객체를 생성하여 값을 복사하여 입력.
				// 원 객체의 값이 변해도 복사한 객체 내 값은 변화하지 않음.
				System.out.println("== library ==");
				for(Book book : library) {
					System.out.println(book); //address
					book.showInfo(); // info
				}
				
				System.out.println("== copy library ==");
				for(Book book : copyLibrary){
					System.out.println(book);
					book.showInfo();
				}
				
				
	}
}
