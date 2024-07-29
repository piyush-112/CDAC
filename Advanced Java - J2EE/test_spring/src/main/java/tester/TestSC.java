package tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSC {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext ctx=
				new ClassPathXmlApplicationContext("bean-config.xml")){
			System.out.println("SC up in running!");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
