package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNglogin {
	
	

	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			
		WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	
	

	driver.get("https://ezcontent.srijan.net/user/login");
	
	Thread.sleep(5000);
	
	driver.findElement(By.id("edit-name")).sendKeys("editor@srijan.net");
	
	driver.findElement(By.id("edit-pass")).sendKeys("editor@123");
	
	driver.findElement(By.id("edit-submit")).click();
	
	Thread.sleep(5000);
	
		
   }

}




