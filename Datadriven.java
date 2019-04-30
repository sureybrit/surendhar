package datadrive;

import java.util.concurrent.TimeUnit;

import library.Config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven 
{
	WebDriver driver;
	@Test(dataProvider="UserData")
	public void LoginUser(String email, String password) throws Exception
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\sudhakaran\\ChromeDrivers\\chromedriver_1.exe");
		  System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		  driver.get("https://demo.opencart.com/index.php?route=account/login");
		  Thread.sleep(2000);
		  driver.findElement(By.name("email")).sendKeys(email);
		  driver.findElement(By.name("password")).sendKeys(password);
		  driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/form/input")).click();
		 
		  Thread.sleep(2000);
		  
		  Assert.assertTrue(driver.getTitle().contains("My Account"), "Unable to login");
		  System.out.println("login successfully:");

	}
	
	@DataProvider(name="UserData")
	public Object[][] DataUser() throws Exception
	{
		Config configs = new Config("C:\\EXCELSHEET\\input.xlsx");
		
		int row = configs.getRowCount(0);
		Object[][] data = new Object[row][2];
		for (int i=0; i<row; i++)
		{
			data[i][0]=configs.getData0(0,i,0);
			data[i][1]=configs.getData0(0,i,1);
		}
		
		
		return data;
		
		
		
	}

}
