package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLoginPage {
	
	
	static WebDriver driver;

	
	@BeforeClass
	
	public void AppSetUP() {
		
        WebDriverManager.chromedriver().setup();
		
	    driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	 
	}
	
	@Test
	
	public void LoginApp() throws InterruptedException {
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		Thread.sleep(10000);
		
		
		String CurURL= driver.getCurrentUrl();
			   
		System.out.println("Current URL is : " + CurURL);
			
			
	    Assert.assertEquals(CurURL, "https://opensource-demo.orangehrmlive.com/index.php/auth/login", "curURL does not matched");
			
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();

		
	}
	
	@Test
    
	public void MenuItemsAction() throws InterruptedException {
		
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//div[@class='menu']//li//a[@id='menu_recruitment_viewRecruitmentModule']"))).build().perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='menu']//li//a[text()='Vacancies']")).click();
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
	}
	
@AfterClass
	
	public void AppLogout() throws InterruptedException{
	
	
	
	   // Actions action=new Actions(driver);
	    
	    //action.moveToElement(driver.findElement(By.xpath("//div[@id='wrapper']//div//a[text()='Welcome Admin']"))).click();
	   Thread.sleep(3000);
		
		driver.findElement(By.id("welcome")).click();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		
}
		

}


		/*WebElement menuitem=driver.findElement(By.xpath("//b[contains(text(),'Recruitment')]"));
		
	    Actions action=new Actions(driver);
	    Thread.sleep(5000);
	    action.moveToElement(menuitem).perform();
	    
	    WebElement menuitem2=driver.findElement(By.xpath("//a[@id='menu_recruitment_viewJobVacancy']"));
	    Thread.sleep(5000);
	    action.moveToElement(menuitem2).click();
	    
	    
	    
	    */
    
	
	
	
	
	
	
	

