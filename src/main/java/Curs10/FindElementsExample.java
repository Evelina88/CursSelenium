package Curs10;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import Utils.BaseTest;

public class FindElementsExample extends BaseTest {
	@Test
	public void findElements() {
		
		List<WebElement> bookList = driver.findElements(By.cssSelector("h3[class*='sc_title_regular']"));
		System.out.println(bookList.size());
		bookList.get(2).click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/life-in-the-garden/");
		
		
	}

	

}
