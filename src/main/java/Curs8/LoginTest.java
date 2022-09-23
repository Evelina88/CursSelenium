package Curs8;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;
	
	
	@BeforeClass
	public void openBrowser() {
		
		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://Keybooks.ro");			
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();	
	}
	

	@Test
	public void validLoginTest() throws InterruptedException {
		
		driver.findElement(By.className("menu_user_login")).click();
		driver.findElement(By.id("log")).sendKeys("TestUser");
		driver.findElement(By.id("password")).sendKeys("12345@67890");
		driver.findElement(By.className("submit_button")).click();
		
		
		WebElement mesaj = driver.findElement(By.className("sc_infobox_style_success"));
		
		assertTrue(mesaj.isDisplayed());
		
	}
	
}
