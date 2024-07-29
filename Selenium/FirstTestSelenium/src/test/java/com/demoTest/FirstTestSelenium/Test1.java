package com.demoTest.FirstTestSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();

        // Fill in the first name field
        driver.findElement(By.id("fname")).sendKeys("Welcome to Pune");

        // Click on the 'Male' radio button
        driver.findElement(By.xpath("//input[@id='male']")).click();
     // to create the Xpath -->go to the element -->right click inspect -->ctrl+f--> type //input[@id='male'] the result is only X 1of1

        // Find the element you want to double-click
        WebElement elementToDoubleClick = driver.findElement(By.id("dblClkBtn"));

        // Create Actions object
        Actions actions = new Actions(driver);

        // Perform double-click on the element
        actions.doubleClick(elementToDoubleClick).perform();

        // Handle alert if present
//        Alert alert = driver.switchTo().alert();
//        String alertText = alert.getText();
//        System.out.println("Alert text: " + alertText);
//        alert.accept(); // Accept the alert (OK button)

        
    }
}
