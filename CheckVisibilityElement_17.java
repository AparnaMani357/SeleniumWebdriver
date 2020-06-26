package SeleniumGITUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckVisibilityElement_17 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.linkText("REGISTER")).click();
		
		//Submit button
		boolean b1 = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).isEnabled();
		System.out.println("Is enabled: "+ b1);
		
		//Check box before selecting
		boolean b2 = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		System.out.println("is Selected: "+ b2);
		
		//Check box after selecting
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		boolean b3 = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		System.out.println("is Selected: "+ b3);
		
		//Radio button is Displayed?
		boolean b4=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isDisplayed();
		System.out.println("is Displayed: "+ b4);
		
		//Radio button is Enabled for clicking?
		boolean b5=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled();
		System.out.println("is Enabled: "+ b5);
		
		//Radio button is Selected?, before selecting
		boolean b6=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected();
		System.out.println("is Selected: "+ b6);
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//Radio button is Selected?, after selecting
		boolean b7=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected();
		System.out.println("is Selected: "+ b7);
		
		
		

	}

}
