package SeleniumGITUpload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser_13 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\SeleniumJars\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("window-size=1400,800");
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
				


	}

}
