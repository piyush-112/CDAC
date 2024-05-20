package custom_exceptions;

@SuppressWarnings("serial")
public class FuelTypeException extends Exception{
	public FuelTypeException(String mesg) {
		super(mesg);
	}

}
