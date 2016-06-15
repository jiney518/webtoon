package resources;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class beforeTest extends declaration {
	
	@BeforeTest
	@Parameters("browser")
	public static void setUp( String browser) throws Exception{
		DesiredCapabilities cap = new DesiredCapabilities();
	
		System.out.println( "browser check: "+browser);
		
		if(browser.equalsIgnoreCase("internet explorer")){
			cap = DesiredCapabilities.internetExplorer();
		
		}
		if(browser.equalsIgnoreCase("chrome")){
			cap=DesiredCapabilities.chrome();
		}

  
		driver = new RemoteWebDriver(new URL("http://10.12.45.232:4444/wd/hub"), cap);    	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 	
		driver.manage().window().maximize();
    	driver.get(url);
	}
	

	public static void tearDown() throws Exception {
	        //Close the browser
			Thread.sleep(3000);
	        driver.quit();

	        String verificationErrorString = declaration.verificationErrors.toString();
	        if (!"".equals(verificationErrorString)) {
	            Assert.fail(verificationErrorString);
	        }
	    }
    
		
		
	

	
	
	

	 
	 

}
