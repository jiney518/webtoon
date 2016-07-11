package main;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Utilities;
import resources.beforeTest;
import resources.declaration;

public class TC02_만화홈 extends declaration{
	
	
	@Parameters("browser")		
	@BeforeClass
	public void test(String browser) throws Exception{
		
		beforeTest.setUp(browser);	
		System.out.println("****open browser**********");
	}
	
	@AfterClass
	public void afterClass() throws Exception{
		System.out.println("******close browser********");
		beforeTest.tearDown();
	}
	

	
		//COMIC_009~COMIC_033
		//상단 플래쉬
		@Test
		public void comic_002() throws Exception{
			
			Utilities.date();
			
		}
	

}
