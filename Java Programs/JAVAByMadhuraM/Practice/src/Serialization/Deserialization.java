package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String x[]) {
		try {
			FileInputStream fi=new FileInputStream("StudSerial.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			studentApp std=(studentApp) oi.readObject();
			System.out.println(std.getAge());
			System.out.println(std.getClass());
			System.out.println("Deserailzation complete");
			oi.close();
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
