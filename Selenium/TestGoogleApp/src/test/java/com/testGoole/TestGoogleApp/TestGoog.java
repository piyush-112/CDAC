package com.testGoole.TestGoogleApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoog {

    public static void main(String[] args) {

        
        
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.co.in/");
        driver.manage().window().maximize();

        // Locate the search box and input search term
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("mission");

        // Locate and click the search button
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.submit();
 
        WebElement imagesTab = driver.findElement(By.linkText("Images"));
        imagesTab.click();
     
    }
}
