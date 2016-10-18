package message;

public class Message {
	private String _mesaj;
	private Priority _priority;
	
	public Message(String measj, Priority prio)
	{
		_mesaj = measj;
		_priority = prio;
	}
	
	public String toString()
	{
		return "["+_priority.toString()+"]"+" : "+_mesaj;
	}
}
