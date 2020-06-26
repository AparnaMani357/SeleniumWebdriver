package SeleniumGITUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_7 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		System.out.println("Before mouseOver: "+ driver.getTitle());
		Actions action= new Actions(driver);
		Action a = action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build();
		a.perform();
		driver.findElement(By.linkText("Your Account")).click();
		System.out.println("After mouseOver: "+ driver.getTitle());
		

	}

}
