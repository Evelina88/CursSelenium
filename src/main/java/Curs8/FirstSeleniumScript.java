package Curs8;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumScript {
	
	WebDriver driver;
	
	private static final String WebDriverMAnager = null;

	@Test(priority = 1, dependsOnMethods = "checkUrl")
	public void OpenBrowser() {
		
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://Keybooks.ro");
		
		
		
	}
	@Test(priority = 2)
	public void checkURl() {
		String pageUrl = driver.getCurrentUrl();
		System.out.println(pageUrl);
		
		assertEquals(pageUrl, "https://altex.ro");
		
		
	}

}
