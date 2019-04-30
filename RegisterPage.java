package com.coachingclassenquiry.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage 
{
	WebDriver driver;
	
	//WebElement D6_dropdown = driver.findElement(By.name("D6"));
	  //Select D6_dd = new Select(D6_dropdown);
	  
	 
	By fname=By.id("fname");
	By lname=By.id("lname");
	By emails=By.id("emails");
	By mobile=By.id("mobile");
	By D6=By.name("D6");
	By D5=By.name("D5");
	By D4=By.name("D4");
	By enqdetails=By.id("enqdetails");
	By submit=By.xpath("//*[@id='Submit1']");
	
	//Created Constructor
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void Typefname()
	{
		driver.findElement(fname).sendKeys("sudhakaran");
	}
	
	public void Typelname()
	{
		driver.findElement(lname).sendKeys("kumarasamy");
	}
	
	public void Typeemail()
	{
		driver.findElement(emails).sendKeys("sudhakarankumarasamy@gmail.com");
	}
	
	public void Typemobilenum()
	{
		driver.findElement(mobile).sendKeys("7094831502");
	}
	
	public void TypeD6()
	{
		 //D6_dd.selectByVisibleText("Spoken English");
		driver.findElement(D6).sendKeys("Spoken English");
	}
	
	public void Typecity()
	{
		driver.findElement(D5).sendKeys("Pune");
	}
	
	public void Typelearnmode()
	{
		driver.findElement(D4).sendKeys("Class rooom training");
	}
	
	
	public void Typeenquiry()
	{
		driver.findElement(enqdetails).sendKeys("Nothing");
	}
	
	public void ClickOnSubmit()
	{
		driver.findElement(submit).click();
	}

	public void register_New(String string, String string2) 
	{
		// TODO Auto-generated method stub
		
	}
	
	
}
