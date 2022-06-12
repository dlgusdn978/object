package singleton;

public class Aclazz {

	//예약어라서 class라고 안쓰는 경우도 있음.
	
	private SocketClient socketClient;
	
	public Aclazz() {
		this.socketClient = SocketClient.getInstance();
		//this.socketClient = new SocketClient();
	}
	
	public SocketClient getSocketClient() {
		return this.socketClient;
	}
}
