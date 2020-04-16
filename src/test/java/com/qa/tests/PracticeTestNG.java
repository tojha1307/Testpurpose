package com.qa.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestNG {
	
	@BeforeSuite
	
	public void setup() {
		
		System.out.println("before suite got executed");
	}

	
	@BeforeTest
	
	public void browsersetup() {
		
		System.out.println("before test got executed");
	}
	
	@BeforeClass
	
	public void browserlaunch() {
		
		System.out.println("Before class got executed");
	}
	
  @BeforeMethod
	
	public void loginapp() {
		
		System.out.println("Before method got executed");
	}

	@Test
	
	public void testm1() {
		
		System.out.println("Testing started");
	}
		
	@AfterMethod
	
	public void aftermethod() {
		System.out.println("after method");
		
	}
	
	@AfterClass
	
	public void afterclass() {
		System.out.println("after class");

		
	}	
	
	@AfterTest
	
	public void aftertest() {
		
   }
	
	@AfterSuite
	
	public void aftersuite() {
		
   }
	
}
