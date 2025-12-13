package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		/**
		 * steps to interact with the webelement:
		 * 1)locate the element(find the elemnt froom the dom)
		 * Sendkeys--->passing the i/p
		 * click-->clickable actions
		 */
		
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("https://www.facebook.com/");
		//maximize
		driver.manage().window().maximize();
		//enter username
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		//enter password
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		//click login
		driver.findElement(By.name("login")).click();
		//click crmsfalink
		System.out.println(driver.getTitle());
		
	}

}
