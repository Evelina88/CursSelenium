package Curs10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class CssSelectors extends BaseTest {

	//@Test
	public void cssSelectorExample() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	 
		WebElement popupLink = driver.findElement(By.cssSelector("li[class='menu_user_login'"));
		
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid red;')", popupLink);
		popupLink.click();
		
		Thread.sleep(4000);
		
		//WebElement popupForm = driver.findElement(By.cssSelector("div[id='popup_login']"));
		
		//js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid red;')", popupForm);
		
		
		//WebElement popupClose = driver.findElement(By.cssSelector("a[class='popup_close']"));
	   //js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid red;')", popupClose);
		
		//AND --> && --> [][]
		
		WebElement username = driver.findElement(By.cssSelector("input[id='log'][name='log']"));
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid red;')", username);
		
		username.sendKeys("TestCeva");
		Thread.sleep(2000);
		username.clear(); //metoda clear sterge textul dintr-un input field
		Thread.sleep(2000);
		username.sendKeys("TestUser");
		
		//OR -->> || --> [],[]
		
		WebElement password= driver.findElement(By.cssSelector("input[id='password'],[name='pwd'],[type='password']"));
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid red;')", password);
		password.sendKeys("12345@67890");
		
		WebElement rememberMe = driver.findElement(By.cssSelector("input[type='checkbox'][value='forever'][id='rememberme']"));
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid red;')", rememberMe);
		rememberMe.click();
	    
		WebElement login = driver.findElement(By.cssSelector("input[type='submit'],[class='submit_button']"));
		login.click();
		
		Thread.sleep(4000);
	}
	
	@Test
	public void cssSelectorExample2() throws InterruptedException {
		//contains --> *
		
		WebElement bookTitle = driver.findElement(By.cssSelector("h3[class*='sc_title_regular']"));
		System.out.println(bookTitle.getText());
		
		//contains word --> ~ 
		
		WebElement buttonDiscoverMore = driver.findElement(By.cssSelector("a[class~='sc_button_style_filled']"));
		
		System.out.println(buttonDiscoverMore.getText());
		
		//starts with --> ^
		
		WebElement lifeinGardenBook = driver.findElement(By.cssSelector("a[href^='life']"));
		System.out.println(lifeinGardenBook.getText());
		
		//ends with --> $
		
		WebElement strangeStoryBook = driver.findElement(By.cssSelector("a[href$='story']"));
		System.out.println(strangeStoryBook.getText());
		
		//class --> .  | div[class='logo_slogan'] --> div.logo_slogan
		WebElement logoSlogan = driver.findElement(By.cssSelector("div.logo_slogan"));
		System.out.println(logoSlogan.getText());
		
		//id --> # | ul[id='menu_user'] --> ul#menu_user
		WebElement loginBox = driver.findElement(By.cssSelector("ul#menu_user"));
		System.out.println(loginBox.getText());
		
		WebElement discoverText = driver.findElement(By.cssSelector("div[class='wpb_wrapper'] h2[class*='sc_title sc_title_underline']>em"));
		System.out.println(discoverText.getText());
		
		//NOT 
		List<WebElement> menuTabs = driver.findElements(By.cssSelector("li[class*='sc_tabs_title']:not([aria-selected='true'])"));
		menuTabs.get(1).click();
	
	}
	
	
}
