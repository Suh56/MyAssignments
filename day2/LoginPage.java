package week1.day2;

import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.chrome.ChromeDriver;//

public class LoginPage {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();//
		EdgeDriver driver=new EdgeDriver();
		//driver.get("http://leaftaps.com/opentaps/control/main");//
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
	}
}
// shortcut for executing the code is ctrl + fn + F11
// shortcut for import is ctrl + shift + o