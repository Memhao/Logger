import client.Client;
import client.SharedResource;

import server.Server;
public class Main {
	public static void main(String[] argv)
	{
		System.out.println("Hello out there!");
		SharedResource sr = new SharedResource();
		Client client0 = new Client("Mao",sr);
		Client client1 = new Client("Memhao",sr);
		Client client2 = new Client("Maoaa",sr);
		Client client3 = new Client("Memhaoaa",sr);
		
		Server server0 = new Server("Xenia", sr);
		Server server1 = new Server("XCniaa", sr);
		Server server2 = new Server("Fenia", sr);
		Server server3 = new Server("FFniaa", sr);

		server0.start();
		client0.start();

	
	}
}
