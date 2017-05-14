package com.PageTitel.interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Page_Titel {

	
		WebDriver driver = new FirefoxDriver();
		String title;
		 
	@Test
	public void PageTitle(String titlename){
		driver.get("https://www.salesforce.com/login");
		driver.manage().window().maximize();
		 
		title = driver.getTitle();
		 
		System.out.println("Page title is: "+title);
		 
		Assert.assertTrue(title.contains(titlename));
		 
		driver.close();
		}
		 
	

}
