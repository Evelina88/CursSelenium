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
	
	//metode
	public void loginInApp(String user, String pass) {
		Log.info("call method loginInApp");
		driver.findElement(usernameField).sendKeys(user);
		Log.info("send username" + user);
		driver.findElement(passwordField).sendKeys(pass);
		Log.info("sendpassword" + pass);
		driver.findElement(submitButton).click();
		Log.info("Clicked on submitted button");
	}
	
	public void logoutFromApp() {	
	driver.findElement(logoutButton).click();
	}
	
	
}
