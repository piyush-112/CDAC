package custom.exceptions;

@SuppressWarnings("serial")
public class DuplicatePhoneNumberException extends Exception{
	//For custom message in runtime
	public DuplicatePhoneNumberException(String msg) {
		super(msg);
	}
}
