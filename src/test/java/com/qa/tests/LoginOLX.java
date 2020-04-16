package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import CommonUtillity.Commonclasses;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginOLX {

static WebDriver driver;
	
	@BeforeClass

	   public void setUp() {
	
       WebDriverManager.chromedriver().setup();
		
	    driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	
	}
	
	        
            @Test(priority=1)
	       
            public void Applogin() {
		
		    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		    
			driver.get("https://www.originsworldofgood.com/user/login");
		     
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

			driver.findElement(By.id("edit-name")).sendKeys("udittaFE");
				
			driver.findElement(By.id("edit-pass")).sendKeys("Olx2020@123");
				
			driver.findElement(By.id("edit-submit")).click();
				
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
	}
   

       @Test(priority=2)
	
	   public void pageUrl() {
		
	   String CurURL= driver.getCurrentUrl();
		   
	   System.out.println("Current URL is : " + CurURL);
		
		
	   Assert.assertEquals(CurURL, "https://www.originsworldofgood.com/home", "curURL does not matched");
		
	   driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
	
       }
	
       
    @Test(priority=3)
       
         public void Newlaunches() throws InterruptedException {
    	   
    	 Thread.sleep(5000);  
    	   

         
         driver.findElement(By.xpath("//div[@class='main-nav navbar-fixed container']//ul//li[2]")).click();
         
         Thread.sleep(3000);
        
         
         //Javascript is used to scroll down the page 
         
         JavascriptExecutor jse = (JavascriptExecutor)driver;
         jse.executeScript("window.scrollBy(0,1200)");
         
         //driver.findElement(By.xpath("//button[text()='See More']")).click();
         
         //driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
         
         String CurURL= driver.getCurrentUrl();
  		   
  	     System.out.println("Current URL is : " + CurURL);
  		
  		
  	     Assert.assertEquals(CurURL, "https://www.originsworldofgood.com/newlaunches", "curURL does not matched");
  		
  	     driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
  	     
  	     
         
    	 
    	   
       }
      
       @Test(priority=4)
       
       public void GoodNews() throws InterruptedException {
    	   
    	   
    	  Thread.sleep(5000);
    	  
    	  driver.findElement(By.xpath("//div[@class='main-nav navbar-fixed container']//ul//li[3]")).click();
    	  
    	  Thread.sleep(3000);
          
          String CurURL= driver.getCurrentUrl();
   		   
   	     System.out.println("Current URL is : " + CurURL);
   		
   		
   	     Assert.assertEquals(CurURL, "https://www.originsworldofgood.com/trending", "curURL does not matched");
   		
   	     driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
          
     	   
    	   
       }
       
         @Test(priority=5)
       
          public void OffToaGoodStart() throws InterruptedException {
    	   
    	   
    	  Thread.sleep(5000);
    	  
      	 driver.findElement(By.xpath("//div[@class='main-nav navbar-fixed container']//ul//li[4]")).click();
    	  
    	  Thread.sleep(3000);
          
          String CurURL= driver.getCurrentUrl();
   		   
   	     System.out.println("Current URL is : " + CurURL);
   		
   		
   	     Assert.assertEquals(CurURL, "https://www.originsworldofgood.com/levels", "curURL does not matched");
   		
   	     driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
          
     	   
    	   
       }
        
         @Test(priority=6)
         
         public void TheGoods() throws InterruptedException {
   	   
   	   
   	  Thread.sleep(5000);
   	  
  	 driver.findElement(By.xpath("//div[@class='main-nav navbar-fixed container']//ul//li[5]")).click();
   	  
   	  Thread.sleep(3000);
         
         String CurURL= driver.getCurrentUrl();
  		   
  	     System.out.println("Current URL is : " + CurURL);
  		
  		
  	     Assert.assertEquals(CurURL, "https://www.originsworldofgood.com/products", "curURL does not matched");
  		
  	     driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
         
    	   
   	   
      } 
         
  @Test(priority=7)
         
        public void GoodViews() throws InterruptedException {
   	   
   	   
   	    Thread.sleep(5000);
   	  
    	 driver.findElement(By.xpath("//div[@class='main-nav navbar-fixed container']//ul//li[6]")).click();
   	  
   	     Thread.sleep(3000);
         
         String CurURL= driver.getCurrentUrl();
  		   
  	     System.out.println("Current URL is : " + CurURL);
  		
  		
  	     Assert.assertEquals(CurURL, "https://www.originsworldofgood.com/folders", "curURL does not matched");
  		
  	     driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
         
    	   
   	   
      } 
	

	@AfterClass
	
	public void Logout() throws InterruptedException {
		
        Thread.sleep(5000);	
        
        driver.findElement(By.xpath("//div[@class='user-dashboard-icon']")).click();
                
        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[@id='user-panel']//ul//li//a[text()='Log Out']")).click();
        
        System.out.println("User logged out successfully");
        
        driver.quit();
        
		}
	
	
}
	
		

	
	

