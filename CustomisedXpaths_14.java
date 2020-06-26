package SeleniumGITUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomisedXpaths_14 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("apps.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pass123");
		driver.findElement(By.xpath("//input[starts-with(@id,'u_')]")).click();*/
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();

	}

}
