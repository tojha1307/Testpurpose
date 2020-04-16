package CommonUtillity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonclasses {

static WebDriver driver;


        //This method is used to invoke browser 

	    
        public static void setUp() {
	
		WebDriverManager.chromedriver().setup();
		
	    driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    }
	    
	    
        //This method is used for Initiating login users 

	    
	    public static void Applogin() {
	    
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    
		driver.get("https://www.originsworldofgood.com/user/login");
	     
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

        driver.findElement(By.id("edit-name")).sendKeys("udittaFE");
		
		driver.findElement(By.id("edit-pass")).sendKeys("Olx2020@123");
		
		driver.findElement(By.id("edit-submit")).click();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		}
	    
	    
	    //This method is used to close the browser 
	    
  
	    public static void Logout() {
			
	    driver.quit();
	    	
	    }

	    
	    //This method is used to scroll down the page
	    
	    

}
	
	


	

