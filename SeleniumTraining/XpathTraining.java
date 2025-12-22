package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTraining {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/p[1]/input")).sendKeys("democsr2");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/p[2]/input")).sendKeys("crmsfa");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/p[3]/input")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();

	}

}
