package com.testmyApp.TesttypeofTriangleApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestriangleApp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://127.0.0.1:5500/HTML/TypeOftriangle.html");
		driver.manage().window().maximize();
		
		
		//send the side1 length
		driver.findElement(By.id("side1")).sendKeys("22");
		
		//send the side2 length
		driver.findElement(By.id("side2")).sendKeys("33");
		
		//send the side3 length
		driver.findElement(By.id("side3")).sendKeys("22");
		
		
		
		//click on the "Determine type" to check the type of the triangle
		driver.findElement(By.xpath("//button[@type='button']")).click();
		{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}

}
