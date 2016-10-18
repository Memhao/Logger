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
		int i = 0;
		while(i<5)
		{
			i++;
			_shared.pushNewResource(new Message("ssssssss",Priority.DEBUG));
			System.out.println(i);
		}
	}
}
