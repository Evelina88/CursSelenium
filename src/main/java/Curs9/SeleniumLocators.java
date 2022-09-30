package Curs9;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class SeleniumLocators extends BaseTest {

  @Test(priority =1)
  public void LinkTextLocator () {
	  
	  WebElement booksLink = driver.findElement(By.linkText("BOOKS"));
	  booksLink.click();
	  
	  assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");
	  
	  
  }
	
  
  @Test(priority =2)
  public void partialLinkTestLocator() {
	  WebElement CookingwithLove = driver.findElement(By.partialLinkText("Cooking"));
	  CookingwithLove.click();
	  
	  assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/cooking-with-love/");
	  
  }
  
  @Test(priority = 3)
  public void classNameLocator() {
  
  WebElement classNameLocator = driver.findElement(By.className("price"));

  System.out.println(classNameLocator.isDisplayed()); 
  
  System.out.println(classNameLocator.getText());
 
  assertTrue(classNameLocator.isDisplayed());
  assertEquals(classNameLocator.getText(), "$20.55");
  
  
  } 
  @Test(priority = 4)
  public void IdLocator() {
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,300)");
	  
	  WebElement tabReview = driver.findElement(By.id("tab-title-reviews"));
	 
	  tabReview.click();
      
	  WebElement commentArea = driver.findElement(By.id("comment-6"));
	  assertTrue(commentArea.isDisplayed());
  }
  
  
  @Test(priority = 5)
  public void xpathLocator() {
	  WebElement commentArea = driver.findElement(By.xpath("//textarea[@id=\"comment\"]"));
	  
	  commentArea.sendKeys("My Comment*");
	  
	  WebElement starRating = driver.findElement(By.xpath("//a[@class=\"star-4\"]"));
	  starRating.click();
	  
	  WebElement nameArea = driver.findElement(By.xpath("//input[@name=\"author\"]"));
	  nameArea.sendKeys("Evelina");
	  
	  WebElement emailArea = driver.findElement(By.xpath("//input[@id=\"email\"]"));
	  emailArea.sendKeys("evelina@evelina.ro");
	  
	  WebElement cookies = driver.findElement(By.xpath("//input[@id=\"wp-comment-cookies-consent\"]"));
	  cookies.click();
	  
  }
  
  @Test(priority = 6)
  public void nameLocator() {
	  
	  WebElement submit = driver.findElement(By.name("submit"));
	  submit.click();
	  
	  WebElement reviewApproval = driver.findElement(By.xpath("//em[@class='woocommerce-review__awaiting-approval']"));
	  assertEquals(reviewApproval.getText(),"Your review is awaiting approval");	  
			  
  }
}
