package singleton;

public class Aclazz {

	//������ class��� �Ⱦ��� ��쵵 ����.
	
	private SocketClient socketClient;
	
	public Aclazz() {
		this.socketClient = SocketClient.getInstance();
		//this.socketClient = new SocketClient();
	}
	
	public SocketClient getSocketClient() {
		return this.socketClient;
	}
}
