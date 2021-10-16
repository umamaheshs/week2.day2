package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads*/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		WebElement element2 = driver.findElement(By.id("password"));
		element2.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		//8	Click on Phone
		driver.findElement(By.id("ext-gen316")).click();
		driver.findElement(By.id("ext-gen240__ext-gen254")).click();
		//9	Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("9994182452");
		//10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//11	Capture lead ID of First Resulting lead
		Thread.sleep(2000);
		String findLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"))
				.getText();
		System.out.println("Lead ID to be deleted is: " + findLead);
		//12	Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		Thread.sleep(2000);
		//13	Click Delete
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		//14	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//15	Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(findLead);
		//16	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		//	17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text);
		//		18	Close the browser (Do not log out)
		driver.close();
	}

}