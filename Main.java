import client.Client;
import client.SharedResource;

import server.Server;
public class Main {
	public static void main(String[] argv)
	{
		System.out.println("Hello out there!");
		SharedResource sr = new SharedResource();
		Client client = new Client("Mao",sr);
		Client client1 = new Client("Memhao",sr);
		Server server = new Server("Xenia", sr);
		System.out.println(client);

		client.start();
		client1.start();
		server.start();
	
	}
}
