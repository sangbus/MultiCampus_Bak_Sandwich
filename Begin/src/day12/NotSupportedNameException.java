package day12;
public class NotSupportedNameException extends Exception{

	public NotSupportedNameException() {
		super("NotSupportedNameException");
	}
	public NotSupportedNameException(String msg)
	{
		super(msg);
	}
}
