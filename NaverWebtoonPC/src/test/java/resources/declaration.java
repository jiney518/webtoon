package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class declaration {
	
	
	 public static WebDriver driver;
	 
	 public static WebElement sectionElement = null;
	 
	 //URL
	 public static String url = "beta.comic.naver.com";
	 public static String NAVERurl = "www.naver.com/";
	 public static String novelUrl = "novel.naver.com/webnovel/weekday.nhn";
	 public static String myPageUrl = "beta.comic.naver.com/mypage/mypage.nhn";
	 public static String serviceUrl = "http://www.naver.com/policy/service.html";
	 public static String privacyUrl = "http://www.naver.com/policy/privacy.html";
	 public static String disclaimerUrl = "http://www.naver.com/policy/disclaimer.html";
	 public static String helpUrl = "https://help.naver.com/support/service/main.nhn?serviceNo=799";
	 public static String businessUrl = "http://comic.naver.com/business/proposalGuide.nhn";
	 public static String footerNaverUrl = "http://www.navercorp.com/ko/index.nhn";
	 
	 public static StringBuffer verificationErrors = new StringBuffer();
	 
	 //GNB영역
	public static String naverBI = "//div[@id='snb_wrap']/h1/a[1]";
	public static String comic = "//div[@id='snb_wrap']/h1/a[2]";
	public static String novel = "//div[@id='snb_wrap']/h1/a[3]";
	public static String searchText = "//form[@id='searchForm']/fieldset/div/div/input";
	public static String searchBtn = "//input[@id='search_bar_button']";
		
	//login
	public static String loginBtn = "//a[@id='gnb_login_button']";
	public static String id="//input[@id='id']";
	public static String pw= "//input[@id='pw']";
	public static String joinBtn = "//form[@id='frmNIDLogin']/fieldset/span/input";
	
	//검색 결과 페이지 내 옵션 
	public static String choiceWebtoon = "//div[@id='content']/div[1]/ul/li[2]/a";
	public static String choiceBestChallenge = "//div[@id='content']/div[1]/ul/li[3]/a";
	public static String choiceChallenge = "//div[@id='content']/div[1]/ul/li[4]/a";
	public static String choiceBook = "//div[@id='content']/div[1]/ul/li[5]/a";
	public static String choiceNovel = "//div[@id='content']/div[1]/ul/li[6]/a";

	//메뉴
	public static String menu_home = "//div[@id='menu']/ul/li[1]/a";
	public static String menu_webtoon ="//div[@id='menu']/ul/li[2]/a";
	public static String menu_bestChallenge = "//div[@id='menu']/ul/li[3]/a";
	public static String menu_challenge = "//div[@id='menu']/ul/li[4]/a";
	public static String menu_myPage = "//div[@id='menu']/ul/li[5]/a";
	public static String menu_nstore_book = "//div[@id='menu']/ul/li[7]/a";
	public static String meun_nstore_novel = "//div[@id='menu']/ul/li[8]/a";
	
	//홈 > 상단 플래쉬
	public static String flash_date = "//*[@id='curDate']";
	
	//footer 
	public static String service= "//div[@id='footer']/ul/li[1]/a/strong";
	public static String privacy = "//div[@id='footer']/ul/li[2]/a/strong";
	public static String disclaimer = "//div[@id='footer']/ul/li[3]/a/strong";
	public static String footerNaver = "//div[@id='footer']/address/a[1]";

}
