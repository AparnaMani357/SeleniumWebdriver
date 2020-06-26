package SeleniumGITUpload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumLearner\\Introduction\\src\\SeleniumJenkinsUpload\\config.properties");
		
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		String userName = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}

		else if (browser.equalsIgnoreCase("FF"))
		{
			//Write fire fox driver code
		}
		
		else if (browser.equalsIgnoreCase("IE"))
		{
			//Write IE driver code
		}
		
		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys(userName);
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		
	}

}
