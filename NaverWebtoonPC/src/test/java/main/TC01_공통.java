package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Utilities;
import resources.beforeTest;
import resources.declaration;


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

		//WebElement comicBtn = driver.findElement(By.xpath(comic));
		
		Utilities.checkCurrentUrl(naverBI);			
		Utilities.checkCurrentUrl(novel);
			
		Utilities.gnbSearch();			
		//Utilities.choiceSearch();
			
		Thread.sleep(2000);
		driver.findElement(By.xpath(comic)).click();					
		Utilities.login("nv_cjdthsus1235", "nhn123!@#");
		Utilities.menu();
			
		Utilities.footer();
		Thread.sleep(2000);
		driver.findElement(By.xpath(comic)).click();
	}

	
	

}
