package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.Log;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locatori
	public By usernameField = By.cssSelector("input[id='log']");
	public By passwordField = By.id("password");
	public By submitButton = By.className("submit_button");
	
	public By logoutButton = By.cssSelector("li[class='menu_user_logout']");
    public By sucessLoginMessage = By.cssSelector("div[class*='sc_infobox_style_success']");
    public By errorLoginMEssage = By.cssSelector("div[class*='sc_infobox_style_error']");
	public By closePopUpButton = By.cssSelector("a[class='popup_close']");
	
	//metode
	public void loginInApp(String user, String pass) {
		Log.info("call method loginInApp");
		driver.findElement(usernameField).clear();
		driver.findElement(usernameField).sendKeys(user);
		Log.info("send username" + user);
		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(pass);
		Log.info("sendpassword" + pass);
		driver.findElement(submitButton).click();
		Log.info("Clicked on submitted button");
		
	}
	
	public void logoutFromApp() {	
	driver.findElement(logoutButton).click();
	}
	
	public boolean checkMEssageIsDisplayed(By locator) { 
		
		return driver.findElement(locator).isDisplayed();
	}

	public void closeLoginPop() {
		driver.findElement(closePopUpButton).click();
	}
}
