package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {
	
	public WebDriver driver;
	
	public ContactPage(WebDriver driver) {
		this.driver = driver;
		
		
	}

	public By zoomInButton = By.cssSelector("button[title='Zoom in']");
	public By zoomOutButton = By.cssSelector("button[title='Zoom out']");
	public By iframe = By.tagName("iframe");
	
	public void zoomMap(By locator) {
		WebElement frame = driver.findElement(iframe);
		driver.switchTo().frame(frame);
		
		driver.findElement(locator).click();
		
	}
}
