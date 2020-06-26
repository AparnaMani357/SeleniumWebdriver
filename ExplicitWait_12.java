package SeleniumGITUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_12 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		WebElement username,password,signIn,loginButton;
		username= driver.findElement(By.id("email"));
		password= driver.findElement(By.id("pass"));
		loginButton= driver.findElement(By.id("loginbutton"));
		
		sendingKeys(driver,username,10,"aparna.mani92@gmail.com");
		sendingKeys(driver,password,10,"1234");
		clickOn(driver,loginButton,10);
		

	}
	
	public static void sendingKeys(WebDriver d, WebElement e,int t, String s) {
		new WebDriverWait(d,t).until(ExpectedConditions.visibilityOf(e));
		e.sendKeys(s);
	}
	
	public static void clickOn(WebDriver d, WebElement e, int t) {
		new WebDriverWait(d,t).until(ExpectedConditions.elementToBeClickable(e));
		e.click();
	}

}
