package custom_exceptions;

@SuppressWarnings("serial")
public class LicenceExpiryException extends Exception{
	public LicenceExpiryException(String mesg) {
		super(mesg);
	}

}
