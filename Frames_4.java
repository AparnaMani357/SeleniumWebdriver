package SeleniumGITUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//iFrames handle
		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
		driver.findElement(By.id("tinymce")).sendKeys("Hello");
		
		//nested frames
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame("frame-top").switchTo().frame("frame-middle");
		System.out.println("inside frame");
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());

		
	}

}
