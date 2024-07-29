package Comparator;


public class Emp {
	private int id;
	private String nm;
	private int sal;
	
	public Emp(int id, String nm, int sal) {
		super();
		this.id = id;
		this.nm = nm;
		this.sal = sal;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "EmployeeComparable [id=" + id + ", nm=" + nm + ", sal=" + sal + "]";
	}
}
