package FuelEnum;
//It is mainly used to define our own (pre-defined) data type.
public enum FEnum {
	PETROL,EV,CNG;
	public String toString() {
		return name().toUpperCase();
	}
}
