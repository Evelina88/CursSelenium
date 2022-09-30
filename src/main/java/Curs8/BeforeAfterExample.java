package Curs8;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAfterExample {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
		
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("After Suite");
	}
	
	@BeforeClass
	public void beforeCLass() {
		System.out.println("Before Class");
		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("After Method");
	}
	
	
	@Test
	public void Test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void Test2() {
		System.out.println("Test2");
	}
}
