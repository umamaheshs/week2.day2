package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link*/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		WebElement element2 = driver.findElement(By.id("password"));
		element2.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		//7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		// driver.findElement(By.className("x-panel-header x-panel-header-noborder
		// x-unselectable"));
		// a[@class='linktext']
		driver.findElement(By.xpath("//div[@class='x-panel-header x-panel-header-noborder x-unselectable']")).click();
		//8	Click on Email
		driver.findElement(By.xpath("//ul[@class='x-tab-strip x-tab-strip-top']/li[3]")).click();
		//9	Enter Email
		driver.findElement(By.name("emailAddress")).sendKeys("umamaheshwaran.mr@gmail.com");
		//	10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		//11	Capture name of First Resulting lead	
		String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"))
				.getText();
		String text2 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-lastName']/a"))
				.getText();
		System.out.println("First Name of resulting Lead : "+text);
		System.out.println("LastName of resulting Lead : "+text2);
		//13	Click Duplicate Lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.findElement(By.className("subMenuButton")).click();
		String title = driver.getTitle();
		if(title.contains("Duplicate Lead"))
		{
			System.out.println("Title of the page is Duplicate Lead");
		}
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		Thread.sleep(2000);
		String dup1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		String dup2 = driver.findElement(By.id("viewLead_lastName_sp")).getText();
		driver.navigate().back();
		driver.navigate().back();
		String dup3 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		String dup4 = driver.findElement(By.id("viewLead_lastName_sp")).getText();
			if (dup1.equals(dup3) && (dup2.equals(dup4))) {
			System.out.println("Both names are equal");
		}

	}

}
