package in.sp.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.StudentApp;

@Configuration
public class JavaController {
 
	@Bean
	public StudentApp stdId() {
		StudentApp std=new StudentApp();
		std.setName("Ram");
		std.setRoll(99); 
		std.setEmail("ram@gmail.com");
		
		return std;
		
	}
	
}
