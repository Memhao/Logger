package client;

import java.util.LinkedList;

import message.Message;
import message.Priority;

public class SharedResource {
	private LinkedList<Message> _list = new LinkedList<Message>();

	
	public synchronized void   pushNewResource(Message message) {
		// TODO Auto-generated method stub
			_list.add(message);
			System.out.println("Message:"+message+" has been notified");
			notify();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return _list.isEmpty();
	}

	public synchronized  Message  popResource() {
		// TODO Auto-generated method stub
		
		Message m ;
		while(_list.isEmpty())
		{
			try {
				System.out.println("Server is waiting for a message...");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(!_list.isEmpty())
		{
			m = _list.removeLast();
		}else
			m = new Message("NA", Priority.CRITICAL);
		
		System.out.println("Message:"+m+" has been consumed");
		return m;
	}

	public void doStuff() {
		// TODO Auto-generated method stub
		
	}

}
