package week2.day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayingWithHyperlinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println("Link without clicking : "+attribute);
		Thread.sleep(2000);
		String attribute2 = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
		if(attribute2.contains("error"))
		{
			System.out.println("link is broken");
			
		}
		else
			System.out.println("link is not broken");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='position']/preceding-sibling::a")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		 List<WebElement> links = driver.findElements(By.tagName("a"));
	      System.out.println("No of links in the page is: "+links.size());
	}

}