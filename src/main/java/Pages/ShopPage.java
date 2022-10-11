package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ShopPage {
	
	WebDriver driver;
	
	public ShopPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//locatori
	public By dropDown = By.name("orderby");
	public By leftSlider = By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default' and @style='left: 0%;']");
	public By rightSlider = By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default' and @style='left: 100%;']");
    public By addtocart = By.xpath("//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']");
	
    public By cartItems = By.cssSelector("span[class='cart_items']");
    
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
	
	public void dragAndDropsSlider(By locator, int x, int y) {
		WebElement element = driver.findElement(locator);
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(element, x, y).perform();
		
	}
	
	public void doubleClick(By locator) {
		WebElement element = driver.findElement(locator);
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
		
	}
	
	public String getElementText(By locator) {
		return driver.findElement(locator).getText();
		

	}

}
