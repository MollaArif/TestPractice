package com.dropDwonl.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FacebookDropdown {

	
		
		 WebDriver driver=new FirefoxDriver();
		 @Test
		 public void dropDown(){
		 
         driver.manage().window().maximize();

         driver.get("http://www.facebook.com");
         

        WebElement male_radio_button=driver.findElement(By.id("u_0_e"));

        boolean status=male_radio_button.isDisplayed();

        System.out.println("Male radio button is Displayed >>"+status);

         boolean enabled_status=male_radio_button.isEnabled();

         System.out.println("Male radio button is Enabled >>"+enabled_status);

       boolean selected_status=male_radio_button.isSelected();

         System.out.println("Male radio button is Selected >>"+selected_status);

         male_radio_button.click();

       boolean selected_status_new=male_radio_button.isSelected();

         System.out.println("Male radio button is Selected >>"+selected_status_new);
         
         driver.close();

    }
	

		 
	

}
