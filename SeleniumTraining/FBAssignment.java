package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBAssignment {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123456789");
		WebElement BirthDayDD = driver.findElement(By.name("birthday_day"));
		Select day=new Select(BirthDayDD);
		day.selectByIndex(3);
		WebElement BirthMonthDD = driver.findElement(By.name("birthday_month"));
		Select month=new Select(BirthMonthDD);
		month.selectByVisibleText("May");
		WebElement BirthYearDD = driver.findElement(By.name("birthday_year"));
		Select Year=new Select (BirthYearDD);
		Year.selectByValue("2001");
		//Male Radio Button
		WebElement maleRadio = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		maleRadio.click();

				System.out.println(driver.getTitle());
				driver.close();
			
				
				
				
		
		}
}
