package SeleniumGITUpload;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildWindowHandle_5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Parent child window handlers
		driver.get("http://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWinId,childWinId;
		parentWinId = it.next();
		childWinId =  it.next();	
		System.out.println(parentWinId +" "+ childWinId);
		
		driver.switchTo().window(childWinId);
		System.out.println("Child window title: "+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWinId);
		System.out.println("Parent window title: "+driver.getTitle());
		driver.close();
			

	}

}
