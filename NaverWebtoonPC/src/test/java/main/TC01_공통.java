package main;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.*;


public class TC01_공통 extends declaration{
	
	
	@Parameters("browser")		
	@BeforeTest
	public void test(String browser) throws Exception{
		
		beforeTest.setUp(browser);	
		System.out.println("****open browser**********");
	}
	
	@AfterTest
	public void afterClass() throws Exception{
		System.out.println("******close browser********");
		beforeTest.tearDown();
	}
	
	
	//COMIC_001~COMIC_008
	@Test
	public void comic_001() throws Exception{
		
			Utilities.checkCurrentUrl();
			
	}

	
	

}
