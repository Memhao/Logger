package server;

import client.SharedResource;
import message.Message;

public class Server extends Thread{
	private String _nume;
	private SharedResource _shared;
	public Server(String nume, SharedResource shared)
	{
		_nume = nume;
		_shared = shared;
	}
	public String toString()
	{
		return _nume;
	}
	public String sendMessage(Message message)
	{
		return message.toString();
	}
	public void run()
	{
		while(true){
			Message res = _shared.popResource();
			System.out.println(res);
		}

	}
}