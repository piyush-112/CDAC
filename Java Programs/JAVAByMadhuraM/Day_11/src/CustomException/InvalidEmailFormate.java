package CustomException;

public class InvalidEmailFormate extends Exception {
	public InvalidEmailFormate(String str){
		super(str);
	}
}
