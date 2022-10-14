package Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class FileUploadTest extends BaseTest {

	@Test
	public void testUpload() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/upload");
		String filePath = "D:\\Training Key\\java_projects\\eclipse_workspace\\CursSelenium\\FisierText";
	
		driver.findElement(By.id("file-upload")).sendKeys(filePath);
		Thread.sleep(4000);
		driver.findElement(By.id("file-submit")).click();
		
		String actualText = driver.findElement(By.id("uploaded-files")).getText();
		
		assertEquals(actualText, "FisierText");
	}
	
	
}
