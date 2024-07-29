package Lambda;

public class AdditionApp {

	public static void main(String[] args) {
		AddInterface add=(int a,int b)-> {
			return a+b;
		};
		System.out.println(add.Addition(44, 11));
	}

}
