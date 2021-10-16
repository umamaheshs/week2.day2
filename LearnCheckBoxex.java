package week2.day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCheckBoxex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		driver.findElement(By.xpath("//input[@type='checkbox'][1]/following::input[2]")).click();
		boolean selected = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input")).isSelected();
		if(selected==true)
		{
			System.out.println("selenium is selected");
		}	
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input")).click();
	}

}