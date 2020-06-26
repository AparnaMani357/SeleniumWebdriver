package SeleniumGITUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackForward_10 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Simulating browser back and forward 
		driver.get("http://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle()); 
		driver.navigate().refresh(); 
		

	}

}
