package resources;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities extends declaration{
	
	
	//GNB 링크 클릭 후 홈으로 이동 
	public static void checkCurrentUrl(String gnbBI) throws Exception{
		
		WebElement btn = driver.findElement(By.xpath(gnbBI));
		btn.click();
		Thread.sleep(1000);
		String currnetUrl = declaration.driver.getCurrentUrl();
		
		if(currnetUrl.equals(NAVERurl)){		
			Assert.assertEquals("http://"+NAVERurl, currnetUrl);
		}
		else if(currnetUrl.equals(novelUrl)){
			Assert.assertEquals("http://"+novelUrl, currnetUrl);
		}
		System.out.println("GNB 클릭: "+currnetUrl);
		driver.navigate().back();
	}
	
	
	//window handle
	public static void windowHandle() throws Exception{
		
		String parentWindow = driver.getWindowHandle();		
		for (String childWindow: driver.getWindowHandles()){
			driver.switchTo().window(childWindow);
		}
		driver.close();		
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
	}
	
	
	//GNB_search 
	public static void gnbSearch() throws Exception{
		
		WebElement search = driver.findElement(By.xpath(searchText));
		search.sendKeys("마음의 소리");
		driver.findElement(By.xpath(searchBtn)).click();
		
	}
	
	
	//검색결과_옵션 선택
	public static void choiceSearch() throws Exception{

		List<WebElement> choiceElements = driver.findElements(By.xpath("//div[@id='content']/div[1]/ul/li"));
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		System.out.println("element count: "+choiceElements.size());

		for (int i=0; i<choiceElements.size() ; i++ ){
			System.out.println("라디오박스 클릭: "+choiceElements.get(i).getText());
			
			//choiceElements.get(i).click();	
			WebElement e = choiceElements.get(i);		
			e.click();
			wait.until(ExpectedConditions.visibilityOf(choiceElements.get(i)));		
			//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
		}


	}
	
	
	//비로그인_GNB login 
	public static void login(String testId, String testPw) throws Exception{
		
		System.out.println("로그인 정보"+testId+"/ "+testPw);		
	
		driver.findElement(By.xpath(loginBtn)).click();
		
		WebElement id = driver.findElement(By.xpath(declaration.id));
		WebElement pw = driver.findElement(By.xpath(declaration.pw));
		
		id.sendKeys(testId);
		pw.sendKeys(testPw);
		driver.findElement(By.xpath(joinBtn)).click();
		
		Assert.assertEquals("내정보 보기", driver.findElement(By.xpath("//*[@id='gnb_my_namebox']/a[1]/em")).getText());
	}
	
	
	//비로그인_마이페이지 클릭 
	public static void myPageLogin(String testId, String testPw) throws Exception{
		WebElement id = driver.findElement(By.xpath(declaration.id));
		WebElement pw = driver.findElement(By.xpath(declaration.pw));
		
		id.sendKeys(testId);
		pw.sendKeys(testPw);
		driver.findElement(By.xpath(joinBtn)).click();
		
		System.out.println("마이페이지 클릭하여 로그인 완료");
	}
	
	
	//상단 메뉴로 이동
	public static void menu() throws Exception{
		
		driver.findElement(By.xpath(menu_home)).click();
		driver.findElement(By.xpath(menu_webtoon)).click();
		driver.findElement(By.xpath(menu_bestChallenge)).click();
		driver.findElement(By.xpath(menu_challenge)).click();
		System.out.println("만화홈, 웹툰, 베스트도전, 도전만화 메뉴 클릭");
		
		driver.findElement(By.xpath(menu_myPage)).click();
		try{
			if(driver.findElement(By.xpath(declaration.id)).isDisplayed()){
				myPageLogin("nvqa_2tc028", "qalab123");
			}
		}
		catch(Exception e){
			Assert.assertEquals("beta.comic.naver.com/mypage/mypage.nhn", myPageUrl);	
			System.out.println("로그인 상태에서 마이페이지 클릭");
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(menu_nstore_book)).click();
		Thread.sleep(2000);
		windowHandle();
		System.out.println("n스토어 > 단행본 만화 클릭 확인");
		
	
		driver.findElement(By.xpath(meun_nstore_novel)).click();
		Thread.sleep(2000);
		windowHandle();
		System.out.println("n스토어 > 장르소설 클릭 확인");
	}
	
	
	//footer 영역 클릭 
	public static void footer() throws Exception{
		
		driver.findElement(By.xpath(service)).click();
		Assert.assertEquals("http://www.naver.com/policy/service.html", serviceUrl);
		System.out.print("이용약관/");
		driver.navigate().back();
		
		List<WebElement> footerlinks = driver.findElements(By.xpath("//div[@id='footer']/ul/li"));
		for(int i=1; i<footerlinks.size(); i++){
			System.out.print(footerlinks.get(i).getText()+"/ ");
			footerlinks.get(i).click();
			Thread.sleep(2000);
			windowHandle();
		}

		driver.findElement(By.xpath(footerNaver)).click();	
		windowHandle();
		System.out.println("NAVERcorp");		
	}
	
	
	//get current date
	public static void date() throws Exception{
		
		SimpleDateFormat DtFormat = new SimpleDateFormat("yyyy. M. d (E)");
		Date date = new Date();
		System.out.println("오늘의 웹툰: " + driver.findElement(By.xpath(flash_date)).getText());
		Assert.assertEquals(DtFormat.format(date).toString(), driver.findElement(By.xpath(flash_date)).getText());
		
	}
	
}
