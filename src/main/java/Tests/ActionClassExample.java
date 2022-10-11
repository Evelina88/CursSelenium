package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pages.NavigationMenu;
import Pages.ShopPage;
import Utils.BaseTest;

public class ActionClassExample extends BaseTest{

	@Test(priority = 1)
	public void hoverExample() throws InterruptedException {
		NavigationMenu menu = new NavigationMenu(driver);
		menu.hoverMenu(menu.aboutLink);
		Thread.sleep(3000);
		
		menu.hoverMenu(menu.blogLink);
		Thread.sleep(3000);
		
		menu.hoverMenu(menu.postFormatsLink);
		menu.navigateTo(menu.postFormatsLink);
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/category/post-formats/");
	}
	
	@Test(priority = 2)
	public void dragAndDropExample() throws InterruptedException {
		
		NavigationMenu menu = new NavigationMenu(driver);
		menu.navigateTo(menu.shopLink);
		
		ShopPage shop = new ShopPage(driver);
		shop.dragAndDropsSlider(shop.leftSlider, 100, 0);
		shop.dragAndDropsSlider(shop.rightSlider, -100, 0);
		
		Thread.sleep(3000);
	}
	
	@Test(priority = 3)
	public void doubleClickExample() throws InterruptedException {
		
		ShopPage shop = new ShopPage(driver);
		shop.doubleClick(shop.addtocart);
		Thread.sleep(3000);
		assertEquals(shop.getElementText(shop.cartItems),"2");
	}
	
}
