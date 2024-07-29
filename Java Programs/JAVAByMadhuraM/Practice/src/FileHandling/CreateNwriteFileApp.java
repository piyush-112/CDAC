package FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class CreateNwriteFileApp {
	public static void main(String x[]) {
		File myfile=new File("D:\\CDAC\\JAVAByMadhuraM\\Practice\\src\\FileHandling\\ABC.txt");
		/*
		try {
			
			//creating a file
			if(myfile.createNewFile()) {
				System.out.println("File create Successfully");
			}
			9else {
				System.out.println("File not created");
			} 
			
			
			//code to write inside of created file
			
			FileWriter fileWriter = new FileWriter("D:\\CDAC\\JAVAByMadhuraM\\Practice\\src\\FileHandling\\ABC.txt");
			fileWriter.write("These is my first file\n okay by by Ankjwfjwkfjwfnwu!");
			System.out.println("Writting done successfully");
			fileWriter.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
			
		//Reading a data from the file
		try {
			Scanner sc=new Scanner("D:\\CDAC\\JAVAByMadhuraM\\Practice\\src\\FileHandling\\aniket.txt");
			while(sc.hasNextLine()) {
				String line=sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		*/
		//delete the file
		if(myfile.delete()) {
			System.out.println("file Delete successfully"+myfile.getName());
		}
		else {
			System.out.println("not Deleted");
		}
	}
}
