package custom.exceptions;

@SuppressWarnings("serial")
public class SameNameAndBirthdateException extends Exception{
	//For custom message in runtime
	public SameNameAndBirthdateException(String msg) {
		super(msg);
}
}