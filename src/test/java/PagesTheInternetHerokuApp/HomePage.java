package PagesTheInternetHerokuApp;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utilties.CommonMethod;

public class HomePage extends CommonMethod {

@Test (priority = 0, enabled =  false, description = "Test Rail ID 0001", groups = {"Smoke"})
public void clickAbTestingLink(){
	// This method will click AB Testing Link
	driver.get("http://the-internet.herokuapp.com/");
	driver.manage().window().maximize(); 
	
	driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/a")).click();
	}	
	
@Test (priority = 1, enabled =  false, description = "Test Rail ID 0002", groups = {"Smoke"})
public void clickAddRemoveElemntsLink(){
	driver.get("http://the-internet.herokuapp.com/");
	driver.manage().window().maximize(); 
	
	driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/a")).click();
	}	

}
