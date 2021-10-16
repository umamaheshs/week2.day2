package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		WebElement element2 = driver.findElement(By.id("password"));
		element2.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("create");
		String text2 = driver.findElement(By.id("createLeadForm_firstName")).getText();
		System.out.println(text2);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("contact");
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Conference");
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Automobile");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("first");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("last");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/7/87");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("MR");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automobile");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("USD - American Dollar");
		driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Automobile");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		driver.findElement(By.id("createLeadForm_ownershipEnumId")).sendKeys("Automobile");
		driver.findElement(By.name("sicCode")).sendKeys("Automobile");
		driver.findElement(By.name("tickerSymbol")).sendKeys("Automobile");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automobile");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("umamaheshwaran.mr@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9994182452");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("uma");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("mahesh");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("URL");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("selenium");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("umw");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No 73, ganapathy nagar extn.");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("padappai");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		WebElement element1=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state=new Select(element1);
		state.selectByVisibleText("New York");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600125");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600");
		Thread.sleep(2000);
		// * 15. Click on Create Contact
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		 //* 16. Click on edit button 
		driver.findElement(By.xpath("//a[@class='subMenuButton'][3]")).click();
		Thread.sleep(2000);
		// * 17. Clear the Description Field using .clear
		driver.findElement(By.id("updateLeadForm_description")).clear();
		// * 18. Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Automobile");
		// * 19. Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//		 * 20. Get the Title of Resulting Page.
		String title = driver.getTitle();
		System.out.println("Title of Resulting Page is: "+title);
	}

}