package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccwithSelectAssignment {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("accountName")).sendKeys("SuhailTest88");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		WebElement IndustryDD = driver.findElement(By.name("industryEnumId"));
		Select sel=new Select(IndustryDD);
		sel.selectByIndex(3);
		WebElement OwnershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select sel1=new Select(OwnershipDD);
		sel1.selectByVisibleText("S-Corporation");
		WebElement SourceDD = driver.findElement(By.id("dataSourceId"));
		Select auto=new Select (SourceDD);
		auto.selectByValue("LEAD_EMPLOYEE");
		WebElement MarketingCampDD = driver.findElement(By.id("marketingCampaignId"));
		Select auto1=new Select (MarketingCampDD);
		auto1.selectByIndex(6);
		WebElement StateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select auto11=new Select (StateDD);
		auto11.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		//printing the acc name 
		WebElement accName = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/span"));
		System.out.println("Account Name: " + accName.getText());
		driver.close();
		
		
		}
}
