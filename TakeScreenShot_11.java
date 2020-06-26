package SeleniumGITUpload;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.commons.io.FileUtils;

public class TakeScreenShot_11 {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("www.google.com");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		takeScreenshot("googlePage");
		
		}
	
	public static void takeScreenshot(String filename) {
		//TakeScreenshot and store it in a file format
				File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				
				//now copy the file into desired location using copy file method
				//FileUtils.copyFile(src,new File("C:\\Users\\User\\eclipse-workspace\\SeleniumLearner\\Introduction\\src\\SeleniumJenkinsUpload\\"+filename+".jpg"));
		
	}

}
