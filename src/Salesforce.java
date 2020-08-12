import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //selenium code
		//Create Driver object for firefox Browser
		// implement interface webdriver as it has all methods to automate
		
		//invoke .exe file first
	
		System.setProperty("webdriver.chrome.driver", "C:\\TestingSelenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("priyatewari595");
        driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("124354");
        driver.findElement(By.xpath("//*[@id=\'loginbutton\']")).click();
	}

}
