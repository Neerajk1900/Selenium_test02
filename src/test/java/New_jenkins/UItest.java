package New_jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UItest {
	
	    @Test
		public void Startbrowser() throws Exception {

WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			Assert.assertTrue(driver.getTitle().contains("OrangeHRM"), "Title does not match");
			//driver.quit();
	}

}
