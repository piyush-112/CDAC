package Com.CustException;

@SuppressWarnings("serial")
//Custome Exception class for Licesence check
public class LicenseExpiredException extends Exception {
	public LicenseExpiredException(String msg) {
		super(msg);    //pass msg to the super constructor
	}
}
