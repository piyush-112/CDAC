package Com.CustException;

@SuppressWarnings("serial")
///Exceotion declaration for FuelChecking
public class FuelNotSupportException extends Exception {   
	public FuelNotSupportException(String msg) {
		super(msg);
	}

}
