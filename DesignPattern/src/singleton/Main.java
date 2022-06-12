package singleton;

public class Main {

	public static void main(String[] args) {
		Aclazz aClazz = new Aclazz();
		Bclazz bClazz = new Bclazz();
		
		SocketClient aClient = aClazz.getSocketClient();
		SocketClient bClient = bClazz.getSocketClient();
		
		System.out.println("두개의 객체가 동일한가");
		System.out.println(aClient.equals(bClient));
		
		//constructor를 private로 선언하고
		//해당 객체를 사용하고 싶으면 getInstance를 통해서만 사용하도록.
		//하나의 자원을 공유하는 경우 사용하는 방식.
	}
}
