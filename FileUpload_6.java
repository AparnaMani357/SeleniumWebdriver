package SeleniumGITUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String expMsg="File Uploaded!";
		
		driver.get("http://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\User\\Desktop\\abc.txt");
		driver.findElement(By.id("file-submit")).click();
		String msg=driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		if (expMsg.equals(msg))
			System.out.println("File uploaded successfully");
		else
			System.out.println("Error in uploading file");

	}

}
