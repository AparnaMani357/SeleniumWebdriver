package SeleniumGITUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		System.out.println("Current URL,before registration "+driver.getCurrentUrl());
		
		//By.linkText
		driver.findElement(By.linkText("REGISTER")).click();
		
		//By.name
		driver.findElement(By.name("firstName")).sendKeys("Aparna");
		driver.findElement(By.name("lastName")).sendKeys("Mani");
		driver.findElement(By.name("phone")).sendKeys("1234");
		
		//By.id
		driver.findElement(By.id("userName")).sendKeys("apps.mani@gmail.com");
		
		//By.xpath
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("PearlHights");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("WhiteField");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Banglore");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("12345");
		
		//Drop down
		Select s= new Select(driver.findElement(By.xpath("//select[@name='country']")));
		s.selectByVisibleText("INDIA");
		
		//By.cssSelector
		driver.findElement(By.cssSelector("input#email")).sendKeys("apps");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[name='register']")).click();
		
		System.out.println("Current URL,after registration: "+driver.getCurrentUrl());

	}

}
