package PagesTheInternetHerokuApp;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utilties.CommonMethod;

public class HomePage extends CommonMethod {

@Test (priority = 0, enabled =  true)
public void clickAbTestingLink(){
	
	driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/a")).click();
	
	
}	
	
}
