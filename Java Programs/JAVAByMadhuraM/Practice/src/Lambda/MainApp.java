package Lambda;

public class MainApp  {
	public static void main(String x[]) {
		First f=() -> System.out.println("Hiiii lambda");
		f.show();
	}
}
