package client;

import java.util.LinkedList;

import message.Message;

public class SharedResource {
	private LinkedList<Message> _list = new LinkedList<Message>();

	
	public synchronized void   pushNewResource(Message message) {
		// TODO Auto-generated method stub
		_list.add(message);
		notify();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return _list.isEmpty();
	}

	public synchronized  Message  popResource() {
		// TODO Auto-generated method stub
		while(_list.isEmpty())
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Message m = _list.removeLast();
		return m;
	}

	public void doStuff() {
		// TODO Auto-generated method stub
		
	}

}
