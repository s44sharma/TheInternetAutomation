package Utilties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class CommonMethod {
	public WebDriver driver;
@BeforeMethod (groups = {"Smoke","Regression"})
@Parameters ("Browser") // The name should match with testng parameter name

// initiateBrowser method revokes browser using Browser parameter
	public void initiateBrowser(String browser) throws InterruptedException {
if (browser.equals("Chrome"))
{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
else{
	System.setProperty("webdriver.gecko.driver", ".//geckodriver.exe");
	driver = new FirefoxDriver();
}


}


@AfterMethod (groups = {"Smoke","Regression"})
	public void tearDown() {
		driver.quit();
	}
}

