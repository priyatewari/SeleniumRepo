import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //selenium code
		//Create Driver object for firefox Browser
		// implement interface webdriver as it has all methods to automate
		
		//invoke .exe file first
		System.setProperty("webdriver.gecko.driver", "C:\\TestingSelenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("priyatewari595@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("1345");	
		driver.findElement(By.linkText("Forgot account?")).click();;
	}

}
