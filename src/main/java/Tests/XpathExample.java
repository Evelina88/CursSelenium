package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class XpathExample extends BaseTest{

	@Test(priority = 1)
	public void xpathExample() throws InterruptedException {
	
		driver.findElement(By.xpath("//li[@class='menu_user_login']")).click();
		
		//logical OR
		driver.findElement(By.xpath("//input[@id='log' or @name='log']")).sendKeys("TestUser");
		
		//logical AND
		driver.findElement(By.xpath("//input[@id='password' and @name='pwd']")).sendKeys("12345@67890");
		
		driver.findElement(By.xpath("//input[@id='rememberme' or @name='rememberme']")).click();
		
		driver.findElement(By.xpath("//input[@id='rememberme' or @name='rememberme']")).click();

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.xpath("//span[@class='user_name']"));
        assertEquals(userName.getText(), "Test User");
	}
	
	@Test(priority =2)
	public void xpathExample2() {
	driver.get("https://keybooks.ro/account/");
	driver.findElement(By.xpath("//a[contains(text(),'recent orders')]")).click();
	
	boolean isThere = driver.findElement(By.xpath("//th[contains(@class, 'woocommerce-orders-table__header-order-number')]/span")).isDisplayed();
	assertTrue(isThere);
		
	driver.findElement(By.xpath("//td[contains(@class, woocommerce-orders-table__cell)][@data-title='Order']/a[contains(text(), 1683)]")).click();
	assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/account/view-order/1683/");
	
	}
	@Test (priority = 3)
	public void xpathExample3() throws InterruptedException {
			driver.get("https://keybooks.ro/shop/");
			//NOT
			String rating = driver.findElement(By.xpath("//div[@class='star-rating']/span[not(contains(@style, 'width:100%' ))]")).getText();
			System.out.println(rating);
		    assertTrue(rating.contains("Rated"));
		
		    //starts with
			driver.findElement(By.xpath("//a[starts-with(@title, 'Show')][not(contains(@title, 'Show products as thumbs'))]")).click();
			
			//selectby index
			driver.findElement(By.xpath("(//a[contains(@class, 'add_to_cart_button')])[1]")).click();
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//a[@class='added_to_cart wc-forward']")).click();

			//preceding--cel de dupa
			driver.findElement(By.xpath("//td/a[@class='remove'][preceding::td[@class='product-thumbnail']]"));
			
			//following--cel dinainte
			driver.findElement(By.xpath("//td/a[@class='remove'][following::td[@class='product-thumbnail']]"));
	}
}
