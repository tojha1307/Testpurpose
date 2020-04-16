package com.qa.tests;

public class ccc {

}


/*public void pageUrl() {
	
String CurURL= driver.getCurrentUrl();
	   
	System.out.println("Current URL is : " + CurURL);
	
	
    //Assert.assertEquals(CurURL, "https://www.originsworldofgood.com/user/login", "curURL does not matched");
	
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
}

//@Test(priority=2,dependsOnMethods="pageUrl")

public void appLogin() {
    
    
    driver.findElement(By.id("edit-name")).sendKeys("udittaFE");
	
	driver.findElement(By.id("edit-pass")).sendKeys("Olx2020@123");
	
	driver.findElement(By.id("edit-submit")).click();
	
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	

	
	
}

//@AfterMethod

public void tearDown() {
	
	driver.quit();
	
}


}

	

/*@Test(priority=2)

public void pageTitle() {
	

	String pageTitle=driver.getTitle();
	
	System.out.println("Current page Title is : " + pageTitle);
	
	//Assert.assertEquals(pageTitle, "PHPTRAVELS | Travel Technology Partner", "pageTitle does not matched");

}
*
/*	WebDriverManager.chromedriver().setup();
		
	    driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    
		driver.get("https://www.originsworldofgood.com/user/login");
	     
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

*
*
*@Test(priority=2)
	
	public void pageTitle() {
		

		String pageTitle=driver.getTitle();
		
		System.out.println("Current page Title is : " + pageTitle);
		
		//Assert.assertEquals(pageTitle, "PHPTRAVELS | Travel Technology Partner", "pageTitle does not matched");

	}
	   Actions action=new Actions(driver);
    	 
         action.moveToElement
*/