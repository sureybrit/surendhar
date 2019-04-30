package helperclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsefactory 
{
	static WebDriver driver;
	
	public static  WebDriver startbrowser(String browserName, String url)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
		 System.setProperty("webdriver.chrome.driver", "C:\\sudhakaran\\ChromeDrivers\\chromedriver.exe");
		  System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		  driver = new ChromeDriver();
		
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
		
		
	}

}
