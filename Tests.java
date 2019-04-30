package com.coachingclassenquiry.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.coachingclassenquiry.pages.RegisterPage;


public class Tests 
{
	WebDriver driver;
	 @Test
	  public void openChromeBrowser() throws InterruptedException
	  {
		 System.setProperty("webdriver.chrome.driver", "C:\\sudhakaran\\ChromeDrivers\\chromedriver_1.exe");
		  System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  
		  driver.get("///C:/Users/skumara4/Desktop/Coaching_Class_Enquiry.html");
		  
		  RegisterPage register = new RegisterPage(driver);
		  
	
		  register.Typefname();
		  register.Typelname();
		  register.Typeemail();
		  register.Typemobilenum();
		  register.TypeD6();
		  register.Typecity();
		  register.Typelearnmode();
		  register.Typeenquiry();
		  register.ClickOnSubmit();
		  
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
		  
		  System.out.println(driver.getTitle());
	  }
		  

}

