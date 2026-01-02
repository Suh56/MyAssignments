package frameassignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Bags",Keys.ENTER);
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//label[text()='Men']")).click();
	    Thread.sleep(2000);
	   	driver.findElement(By.xpath("//label[text()='Laptop Bag']")).click();
	   	Thread.sleep(2000);
	   
	    // Get count of items found
        String count = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
        System.out.println("Total items found: " + count);
        Thread.sleep(2000);

        // Get list of brands
        List<WebElement> brands = driver.findElements(By.xpath("//h3[@class='product-brand']"));
        Thread.sleep(2000);

        System.out.println("\nList of Brands:");
        for (WebElement brand : brands) {
            System.out.println(brand.getText());
        }

        // Get list of bag names
        List<WebElement> bagNames = driver.findElements(By.xpath("//h4[@class='product-product']"));
        Thread.sleep(2000);

        System.out.println("\nList of Bag Names:");
        for (WebElement bag : bagNames) {
            System.out.println(bag.getText());
        }

        // Close browser
        driver.quit();
	}

}
