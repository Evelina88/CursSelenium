package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//clasa de page objects
public class NavigationMenu {

	WebDriver driver;
	
	
	//constructor
	public NavigationMenu(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//locatorul 
	public By shopLink = By.linkText("BOOKS");
	//driver.findElement(shopLink);
	public By contactLink = By.linkText("CONTACTS");
	public By loginLink = By.linkText("Login");
	
	
	//metode specifice pe locatori
	public void navigateTo(By locator) {
		driver.findElement(locator).click();	
	}
	
}
