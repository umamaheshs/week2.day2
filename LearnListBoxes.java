package week2.day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnListBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement dropDown1=driver.findElement(By.id("dropdown1"));
		Select drop1=new Select(dropDown1);
		drop1.selectByIndex(1);
		Thread.sleep(2000);
		WebElement dropDown2=driver.findElement(By.name("dropdown2"));
		Select drop2=new Select(dropDown2);
		drop2.selectByVisibleText("Selenium");
		Thread.sleep(1000);
		WebElement dropDown3=driver.findElement(By.id("dropdown3"));
		Select drop3=new Select(dropDown3);
		drop3.selectByValue("1");
		Thread.sleep(1000);
		WebElement drp4= driver.findElement(By.tagName("select"));
		Select sltdrp4=new Select(drp4); 
		int a= sltdrp4.getOptions().size();
		System.out.println("Number of options in the list box is: "+a);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/parent::select")).sendKeys("Selenium");
		Thread.sleep(2000);
	     Select combo=new Select(driver.findElement(By.xpath("//option[text()='Select your programs']/parent::select")));
	     combo.selectByIndex(1);
	     combo.selectByValue("2");
	
	}

}