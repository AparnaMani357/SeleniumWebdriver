package SeleniumGITUpload;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks_15 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.airindia.in/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}

	}

}
