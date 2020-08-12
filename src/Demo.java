import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //selenium code
		//Create Driver object for chrome Browser
		// implement interface webdriver as it has all methods to automate
		/* 
		 * Class name = X
		 * X driver= new X(); 
		 * */
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\TestingSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.get("https://amazon.in");
		driver.navigate().back();
		
	}

}
