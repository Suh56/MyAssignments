package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumLocators {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf56");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suhail");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test");
		//lOCATE THE source field
				WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
				//instantiate the select class
				Select sel=new Select(sourceDD);
				sel.selectByIndex(4);
				//locate industry dd
				WebElement MarketingDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			
				Select sel1=new Select(MarketingDD);
				sel1.selectByVisibleText("Automobile");
				WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select auto=new Select (Ownership);
				auto.selectByValue("OWN_CCORP");
				driver.findElement(By.className("smallSubmit")).click();
				System.out.println(driver.getTitle());
				driver.close();
			
				
				
				
		
		}
}
