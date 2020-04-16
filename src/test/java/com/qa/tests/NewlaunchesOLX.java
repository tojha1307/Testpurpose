package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewlaunchesOLX {

static WebDriver driver;
	
@BeforeClass

	public void setUp() {
	
		WebDriverManager.chromedriver().setup();
		
	    driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    
		driver.get("https://www.originsworldofgood.com/user/login");
	     
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
	   
	   }
	
	
	
	@Test
	
	public void NewlaunchesNaviagtion() {
	    
	    
	    driver.findElement(By.xpath("//div[@class='main-nav navbar-fixed container']//ul//li[2]")).click();
	    
	    
		
	}
	
	@AfterClass
	
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
}
