package SeleniumGITUpload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LounchBrowser_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println("Current URL: "+driver.getCurrentUrl());
		System.out.println("PageTitle: "+driver.getTitle());
		driver.close();

	}

}
