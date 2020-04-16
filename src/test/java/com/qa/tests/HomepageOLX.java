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

public class HomepageOLX {

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
	
	public void HomeNavigation() {
	    
	    
	    driver.findElement(By.id("edit-name")).sendKeys("udittaFE");
		
		driver.findElement(By.id("edit-pass")).sendKeys("Olx2020@123");
		
		driver.findElement(By.id("edit-submit")).click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		
	}
	
	@AfterClass
	
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
}
