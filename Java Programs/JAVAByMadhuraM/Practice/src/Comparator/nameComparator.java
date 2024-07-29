package Comparator;

import java.util.Comparator;

public class nameComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getNm().compareTo(o2.getNm());
	}


}
