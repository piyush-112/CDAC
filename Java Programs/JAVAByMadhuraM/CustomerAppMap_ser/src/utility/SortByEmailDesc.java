package utility;

import java.util.Comparator;

public class SortByEmailDesc implements Comparator<String>{
	
	public int compare(String s1,String s2)
	{
		
		return s2.compareTo(s1);
		
	}
	
	

}
