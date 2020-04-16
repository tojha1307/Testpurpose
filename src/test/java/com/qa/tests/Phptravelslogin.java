package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Phptravelslogin {
	
	
	static WebDriver driver;
	
	@BeforeMethod

	public void setUp() {
	
		WebDriverManager.chromedriver().setup();
		
	    driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    
		driver.get("https://www.phptravels.net/home");
	   
	   
	   }
	
	@Test(priority=1,groups="curURL")
	
	public void pageUrl() {
		
	String CurURL= driver.getCurrentUrl();
		   
		System.out.println("Current URL is : " + CurURL);
		
		
	    Assert.assertEquals(CurURL, "https://www.phptravels.net/home", "curURL does not matched");
		
		
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    
	}

	
	@Test(priority=2,groups="pageTitle")
	
	public void pageTitle() {
		

		String pageTitle=driver.getTitle();
		
		System.out.println("Current page Title is : " + pageTitle);
		
		Assert.assertEquals(pageTitle, "PHPTRAVELS | Travel Technology Partner", "pageTitle does not matched");

	}
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.quit();
		
	}
}


