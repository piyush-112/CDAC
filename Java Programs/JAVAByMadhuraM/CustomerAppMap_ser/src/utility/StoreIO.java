package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import customer_aaplication.com.core.Customer;

public class StoreIO {
	public static void storeDataSer(Map<String,Customer> custMap,String filename) throws FileNotFoundException, IOException
	{
		//javaapp-->obj o/ps--->fileops--->fname
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename)))
		{
			out.writeObject(custMap);
		}
	}
	
	
	
	public static Object restoreDataDeser(String fname) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		//javaapp<--obj i/ps<---fileips<---fname
		try(ObjectInputStream in= new ObjectInputStream(new FileInputStream(fname)))
		{
			
			
				
			return in.readObject();
			
			
		}
	}

}
