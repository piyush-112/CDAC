package Com.CustException;

@SuppressWarnings("serial")
//Custom Exception class for checking the speed
public class SpeedOutOfRangeException extends Exception {
	public SpeedOutOfRangeException(String msg) {
		super(msg);
	}
}
