package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BondWithButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.xpath("//label[text()='Click button to travel home page']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='content']/ancestor::body"));
		Point location = driver.findElement(By.xpath("//label[contains(text(),'Find position of')]")).getLocation();
		System.out.println("Position of Button(x,y) is:"+ location);
		String cssValue = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
		System.out.println("Button Color is:" +cssValue);
		Dimension size = driver.findElement(By.xpath("//button[@id='size']")).getSize();
		System.out.println("Size of the button is: "+size);
	}

}