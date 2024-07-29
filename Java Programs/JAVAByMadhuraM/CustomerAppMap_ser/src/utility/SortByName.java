package utility;

import java.util.Comparator;

import customer_aaplication.com.core.Customer;

public class SortByName implements Comparator<Customer> {
	

	@Override
	public int compare(Customer o1, Customer o2) {
		
		return o2.getfName().compareTo(o1.getfName());
	}
}
	
