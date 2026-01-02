package frameassignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

    public static void main(String[] args) {

    	ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Buddy");
        alert.accept();
        WebElement resultText = driver.findElement(By.id("demo"));
        String text = resultText.getText();
        if (text.contains("Buddy")) {
            System.out.println("Alert accepted successfully.");
            System.out.println("Displayed Text: " + text);
        } else {
            System.out.println("Alert action failed.");
        }

        driver.quit();
    }
}
