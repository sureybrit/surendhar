package com.coachingclassenquiry.testcases;
import helperclass.Browsefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.coachingclassenquiry.pages.RegisterPage;


public class ValidDetails {
	

	
	public class LaunchBrowser
	{
		@Test
		public void checkValidDetails()
		{
			WebDriver driver= Browsefactory.startbrowser("chrome", "///C:/Users/skumara4/Desktop/Coaching_Class_Enquiry.html");
			
			RegisterPage register_page=PageFactory.initElements(driver, RegisterPage.class);
			
			register_page.register_New("sudhakarankumarasamy@gmail.com","@Ballcatch");
		}

	}


}
