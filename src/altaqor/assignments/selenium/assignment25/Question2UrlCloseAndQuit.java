package altaqor.assignments.selenium.assignment25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question2UrlCloseAndQuit {
	public static void main(String[] args) {
		//Step 1st:  Set a path for chromedriver.exe
		System.setProperty("webdriver.crome.driver","D:\\NOTE\\SeleniumLiberary\\chromedriver_win32\\chromedriver.exe");
		
		//Step 2nd: Set Chrome Options 
		ChromeOptions chromeOptions =new ChromeOptions();
		
		chromeOptions.addArguments("start-maximized");
		
		chromeOptions.addArguments("--remote-allow-origin=#");//it will allow us to remote invocation.
		
		//Step 3rd: Create object of Web browser.
		WebDriver webDriver = new ChromeDriver(chromeOptions);
		
		webDriver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");//way to fetch web browser.
		
		//webDriver.get("https://blog.hamrobazaar.com/category/auto/cars/");
		
		webDriver.close();
		
		webDriver.quit();
		}

		
	}

