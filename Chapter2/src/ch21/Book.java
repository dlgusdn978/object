package ch21;

public class Book {

	private String title;
	private String author;
	
	public Book() {};
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	//this는 인스턴스 자신을 가리키는 키워드.
	//파라미터로 들어온 값을 객체 내부 변수에 대입한다.(변수 이름 같아서)
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(title + "," + author);
	}
}
