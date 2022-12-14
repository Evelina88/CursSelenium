package Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	
	
	@BeforeClass
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://Keybooks.ro");			
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");	
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();	
	}
	
    @AfterMethod
    public void recordFailure(ITestResult result) throws IOException {
    
    	if(ITestResult.FAILURE == result.getStatus()) {
    		
    		TakesScreenshot poza = (TakesScreenshot) driver;
    		File file = poza.getScreenshotAs(OutputType.FILE);
    		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    		Files.copy(file, new File("screenshots/"+ result.getName() + timeStamp + ".png"));
    	}
    	
    	
	}

}
