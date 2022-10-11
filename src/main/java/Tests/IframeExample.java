package Tests;

import org.testng.annotations.Test;

import Pages.ContactPage;
import Pages.NavigationMenu;
import Utils.BaseTest;

public class IframeExample extends BaseTest{
	
	@Test
	public void iframeExample() throws InterruptedException {
		NavigationMenu menu = new NavigationMenu(driver);
		
		menu.navigateTo(menu.contactLink);
		ContactPage contactPage = new ContactPage(driver);
		contactPage.zoomMap(contactPage.zoomInButton);
		Thread.sleep(2000);
	}

}
