package proxy;

public class Main {

	public static void main(String[] args) {
		
			Browser browser = new Browser("www.naver.com");
			
			browser.show();
			browser.show();
			browser.show();
			
			System.out.println();
			
			IBrowser browser2 = new BrowserProxy("www.naver.com");
			browser2.show();
			browser2.show();
			browser2.show();
			
		
	}

}
