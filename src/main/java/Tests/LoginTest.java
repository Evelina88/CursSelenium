package Tests;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.NavigationMenu;
import Utils.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public void loginTest() {
		NavigationMenu menu = new NavigationMenu(driver);
		menu.navigateTo(menu.shopLink);
		
		menu.navigateTo(menu.contactLink);
		
		menu.navigateTo(menu.loginLink);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp("TestUSer", "12345@67890");
		
	}
	
}
