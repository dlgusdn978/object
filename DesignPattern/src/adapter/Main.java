package adapter;

public class Main {

	public static void main(String[] args) {
		//interface�� Ȱ���Ͽ� �����Ű�� adapter ����.
		
		HairDryer hairDryer = new HairDryer();
		connect(hairDryer);

		Cleaner cleaner = new Cleaner();
		Electronic110V adapter = new SocketAdapter(cleaner);
		connect(adapter);
		
		AirConditioner airConditioner = new AirConditioner();
		Electronic110V airAdapter = new SocketAdapter(airConditioner);
		connect(airAdapter);
	}
	
	public static void connect(Electronic110V electronic110V) {
		electronic110V.powerOn();
	}
}
