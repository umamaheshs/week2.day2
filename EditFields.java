package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("umamaheshwaran.mr@gmail.com");
		WebElement findElement = driver.findElement(By.xpath("//input[@value='Append ']"));
		findElement.sendKeys(Keys.TAB);
		String attribute = findElement.getAttribute("value");
		findElement.sendKeys("app");
		System.out.println(attribute+"app");
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		   driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		   WebElement findElement2 = driver.findElement(By.xpath("//label[@for='disabled']/following-sibling::input"));
		   boolean enabled = findElement2.isEnabled();
		   System.out.println("Confirm edit field is enabled"+enabled);

	}

}