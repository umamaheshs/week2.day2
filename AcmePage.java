package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//	Load url "https://acme-test.uipath.com/login"
		driver.get("https://acme-test.uipath.com/login");
		//maximize the browser window
		driver.manage().window().maximize();
		//2. Enter email as "kumar.testleaf@gmail.com"
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kumar.testleaf@gmail.com");
		//3. Enter Password as "leaf@12"
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("leaf@12");
		//4. Click login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//5. Get the title of the page and print
		String title = driver.getTitle();
		System.out.println("The Title of the page is: "+title);
		//6. Click on Log Out
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[3]")).click();
		//7. Close the browser (use -driver.close())
		driver.close();

	}

}
