package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.channels.FileLockInterruptionException;

public class Serial  {
	
	public static void main(String x[]){
try {
		//create object of the student class
		studentApp s=new studentApp(1,"Rama",23);
		//Write data to file
		
			FileOutputStream fos=new FileOutputStream("Stu dSerial.txt");
			
			//Convert the object into the byte stream to do that we have class
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			//How to serialize
			oos.writeObject(s);
			oos.flush();
			oos.close();
			
			
			System.out.println("Object stared is transfer to file object!!");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
