package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * 1 Launch the browser 2 Enter the username 3 Enter the password 4 Click Login
		 * 5 Click crm/sfa link 6 Click Leads link 7 Click Find leads
		 */
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
		// * 8 Enter first name
		driver.findElement(By.xpath("//div[@class='x-panel-header x-panel-header-noborder x-unselectable']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item'][2]//input")).sendKeys("create");
		// * 9 Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		// * 10 Click on first resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		Thread.sleep(2000);
		// * 11 Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("View Lead")) {
			System.out.println("Title of the page is View Lead");
		}
		// * 12 Click Edit
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']/preceding-sibling::a[1]")).click();
		// * 13 Change the company name
		// * 14 Click Update
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("identiv");
		Thread.sleep(2000);
		String companyName = driver.findElement(By.id("updateLeadForm_companyName")).getAttribute("value");
		driver.findElement(By.name("submitButton")).click();
		// * 15 Confirm the changed name appears
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(companyName)) {
			System.out.println("changed Company Name displayed as expected");
		}

	}
}