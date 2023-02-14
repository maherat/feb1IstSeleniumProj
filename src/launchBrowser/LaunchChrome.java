package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	//methods
	//variables
	
	public static void main(String[] args) throws InterruptedException {
		//you can write it first of you can wait for an error which will say the path to the driver executabe must be set by the webdriver.chrome.driver system property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IsraKhan\\eclipse\\selenium\\1stSelenium\\driver\\chromedriver.exe"); //absolute path
		WebDriver driver = new ChromeDriver(); //java polymorphism concept
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
