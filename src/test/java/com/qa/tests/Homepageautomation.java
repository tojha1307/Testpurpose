package com.qa.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homepageautomation {
	
	
	
	static WebDriver driver;

	
	@BeforeClass(description="This method will invoke chromebrowser")
	
	public void Invokebrowser() throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	
    driver=new ChromeDriver();
    
	//Thread.sleep(5000);

    
    driver.manage().window().maximize();
		
   }

    @BeforeMethod(description="This method will open chromebrowser and enter the URL")
    public void openbrowser() throws InterruptedException {
	
	driver.get("https://www.originsworldofgood.com");
	
	Thread.sleep(5000);
	
	System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
    
	Thread.sleep(5000);

    
  }

    @Test(description="This method will login the user")
    public void Login() throws InterruptedException {
    
    	driver.findElement(By.id("edit-name")).sendKeys("udittaFE");
    	
    	driver.findElement(By.id("edit-pass")).sendKeys("Olx2020@123");
    	
    	Thread.sleep(2000);

       driver.findElement(By.id("edit-submit")).click();
    
}
   
   @Test(description="This method will login the user")
   public void Homepage() throws InterruptedException {
	   System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
	   
	   System.out.println();
	   
	   driver.findElement(By.id("edit-submit")).click();
	   
	   Thread.sleep(2000);
 
   }  
  
   
   
   @AfterMethod
	  public void aftermethod()
	  {
	    System.out.println("AfterMethod");
	  }
	  @AfterClass
	  public void afterClass()
	  {
	    System.out.println("AfterClass");
 }
}
