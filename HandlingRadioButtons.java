package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		WebElement findElement = driver.findElement(By.xpath("//label[@for='Checked']"));
		System.out.println("Default Element Selected is: "+findElement.getText());
		WebElement findElement2 = driver
				.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]"));
		boolean selected = findElement2.isSelected();
		if (selected == false) {
			driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]")).click();
		}

	}

}