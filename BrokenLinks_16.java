package SeleniumGITUpload;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks_16 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		links.addAll(driver.findElements(By.tagName("img")));
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		System.out.println("Before: "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).getAttribute("href") != null)
			{
				activeLinks.add(links.get(i));
			}
			
			System.out.println();
			
		}
		
		System.out.println("After: "+activeLinks.size());
		
		for(int j=0; j<activeLinks.size();j++)
		{
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"--->"+response);
			
		}
		

	}

}
