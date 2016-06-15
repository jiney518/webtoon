package resources;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utilities extends declaration{
	
	//NAVER 클릭 후 홈으로 이동 
	public static void checkCurrentUrl() throws Exception{
		
		WebElement btn = driver.findElement(By.xpath(BI));
		btn.click();
		Thread.sleep(1000);
		String currnetUrl = declaration.driver.getCurrentUrl();
		Assert.assertEquals("http://"+NAVERurl, currnetUrl);
		System.out.println("NAVER 클릭: "+currnetUrl);
		driver.navigate().back();
	}

}
