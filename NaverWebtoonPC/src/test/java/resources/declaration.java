package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class declaration {
	
	
	 public static WebDriver driver;
	 
	 public static String url = "beta.comic.naver.com";
	 public static String NAVERurl = "www.naver.com/";
	 
	 public static StringBuffer verificationErrors = new StringBuffer();
	 
	 //GNB영역
	public static String BI = "//div[@id='snb_wrap']/h1/a[1]";
	
	


}
