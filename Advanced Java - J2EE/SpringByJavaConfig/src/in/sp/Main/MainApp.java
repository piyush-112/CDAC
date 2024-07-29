package in.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.StudentApp;
import in.sp.controller.JavaController;

public class MainApp {

	public static void main(String[] args) {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext();// used when we do config using XML		
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JavaController.class);
		StudentApp std1=(StudentApp) ctx.getBean("stdId");
		std1.Display();
		
		

	}

}
