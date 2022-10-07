package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShopPage {
	
	WebDriver driver;
	
	public ShopPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//locatori
	public By dropDown = By.name("orderby");
	
	//metode
	public void filterByValue(String value) {
		WebElement elem = driver.findElement(dropDown);
		Select selectDropdown = new Select(elem);
		selectDropdown.selectByValue(value);
	}
	
	public String getCurentSelection() {
		WebElement elem = driver.findElement(dropDown);
		Select selectDropdown = new Select(elem);
		return selectDropdown.getFirstSelectedOption().getText();
		
	}
}
