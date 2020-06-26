package SeleniumGITUpload;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Alerts_3 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		Alert a ;
		String msg;
		String msgExp = "You pressed Cancel!";
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		a=driver.switchTo().alert();
		a.dismiss();
		msg = driver.findElement(By.id("confirm-demo")).getText();
		
		if (msg.equals(msgExp) )
			System.out.println("Correct message displayed");
		else
			System.out.println("Wrong message displayed");
		
		
		
		/*driver.findElement(By.xpath("//div[@class='col-md-6 text-left'/div[3]/button[@class='btn btn-default btn-lg']")).click();
		a=driver.switchTo().alert();
		a.sendKeys("aparna");
		a.accept();
		*/
				
		
		
	}
	
}
