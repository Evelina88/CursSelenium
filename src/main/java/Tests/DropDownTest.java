package Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.NavigationMenu;
import Pages.ShopPage;
import Utils.BaseTest;

public class DropDownTest extends BaseTest {
	
	@Test
	public void dropDownTest() {
		
		NavigationMenu menu = new NavigationMenu(driver);
		menu.navigateTo(menu.shopLink);
		ShopPage shop = new ShopPage(driver);
		shop.filterByValue("rating");
		assertEquals(shop.getCurentSelection(), "Sort by average rating");
	}
	

}
