package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
				Book[] library = new Book[5];
				Book[] copyLibrary = new Book[5];
		
		/*		for(int i = 0; i<library.length; i++) {
					System.out.println(library[i]);
				}*/
				library[0] = new Book("�¹���1", "������");
				library[1] = new Book("�¹���2", "������");
				library[2] = new Book("�¹���3", "������");
				library[3] = new Book("�¹���4", "������");
				library[4] = new Book("�¹���5", "������");
				
				copyLibrary[0] = new Book();
				copyLibrary[1] = new Book();
				copyLibrary[2] = new Book();
				copyLibrary[3] = new Book();
				copyLibrary[4] = new Book();
				
				
				//System.arraycopy(library, 0, copyLibrary, 0, 5);
				// ���� ���� ����. �ּҸ� �����ؼ� �ش� ���� ����Ŵ. ���� ���� �����ϴ� ���� �ƴ�.
				// �� ��ü�� ���� ���ϸ� ������ ��ü �� ���� ��ȭ��.
				
				library[0].setAuthor("�ڿϼ�");
				library[0].setTitle("����");
				
				for(int i=0; i<library.length; i++) {
					copyLibrary[i].setAuthor(library[i].getAuthor());
					copyLibrary[i].setTitle(library[i].getTitle());
				}
				// ���� ���� ����. ���� �迭��ü�� �����Ͽ� ���� �����Ͽ� �Է�.
				// �� ��ü�� ���� ���ص� ������ ��ü �� ���� ��ȭ���� ����.
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