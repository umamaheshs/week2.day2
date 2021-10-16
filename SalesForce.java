package week2.day2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		// Step 3: Load the URL 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		// Step 6: Fill in all the text boxes
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("umamaheshwaran");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("seethapathi");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("umamaheshwaran.mr@gmail.com");
		WebElement jobTitle = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		// Step 7: Handle all the dropdowns
		Select dropDown=new Select(jobTitle);
		dropDown.selectByVisibleText("IT Manager");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		WebElement employee = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select dropDown1=new Select(employee);
		dropDown1.selectByIndex(1);
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9994182452");
		WebElement companyCountry = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select dropDown3=new Select(companyCountry);
		dropDown3.selectByVisibleText("India");
		// Step 8: Click the check box
		driver.findElement(By.xpath("//input[@name='SubscriptionAgreement']/following-sibling::div")).click();
		Thread.sleep(2000);

	}

}