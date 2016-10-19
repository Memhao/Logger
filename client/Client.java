package client;


import message.Message;
import message.Priority;

public class Client extends Thread{
	private String _nume;
	private SharedResource _shared;
	public Client(String nume, SharedResource shared)
	{
		_nume = nume;
		_shared = shared;
	}
	public String toString()
	{
		return _nume;
	}
	public void run()
	{

		for(;;){
			try {
				Thread.sleep(2500);
				System.out.println("Client is on the floor");
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("#[CLIENT] ID :"+this.getId());

			for(int i = 0; i < 5; i++){

				_shared.pushNewResource(new Message("Message:"+Math.random()*i,Priority.DEBUG));
			}
		}
	}
}
