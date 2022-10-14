package Tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import Pages.LoginPage;
import Pages.NavigationMenu;
import Utils.BaseTest;
import Utils.Log;
import Utils.TestNGListener;

@Listeners(TestNGListener.class)
public class LoginTest extends BaseTest {

	@Test
	public void loginTest() throws InterruptedException {
		NavigationMenu menu = new NavigationMenu(driver);
		menu.navigateTo(menu.shopLink);
		
		menu.navigateTo(menu.contactLink);
		
		menu.navigateTo(menu.loginLink);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp("TestUSer", "12345@67890");
		Thread.sleep(5000);
		loginPage.logoutFromApp();
	}
	
	@Test(priority = 1)
	public void invalidLoginTest() {
		NavigationMenu menu = new NavigationMenu(driver);
		menu.navigateTo(menu.shopLink);
		
		menu.navigateTo(menu.contactLink);
		
		menu.navigateTo(menu.loginLink);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp("UserGresit", "ParolaGresita");
		Log.info("TestLog");
	}
	
}
