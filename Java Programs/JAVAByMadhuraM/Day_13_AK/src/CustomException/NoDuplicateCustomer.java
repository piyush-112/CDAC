package CustomException;

public class NoDuplicateCustomer extends Exception {
	public NoDuplicateCustomer(String str) {
		super(str);
	}
}
