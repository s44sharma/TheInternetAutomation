package PagesTheInternetHerokuApp;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilties.CommonMethod;

public class ForgotPasswordPage extends CommonMethod{
	@Test (priority = 2, enabled =  true, description = "Test Rail ID 0003", groups = {"Regression"})
	public void verifyLogin() throws Exception{
		// This method will click AB Testing Link
		driver.get("http://the-internet.herokuapp.com/forgot_password");
		driver.findElement(By.name("email")).sendKeys("User1@gmail.com");
		driver.findElement(By.id("form_submit")).click();
			
		System.out.println(driver.getCurrentUrl());
		
		Assert.assertEquals("http://the-internet.herokuapp.com/email_sent", driver.getCurrentUrl(), "URL not matching");
		
		
		}

		}
