package New_jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UItest {
	
	    @Parameters("Browser")
	    @Test
		public void Startbrowser(String browsername) throws Exception 
	    {
	    	WebDriver driver=null;
			System.out.println("Parameter name is "+browsername);
			if(browsername.contains("chrome"))
			{
              WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver();
			}
			else if(browsername.contains("Edge"))
			{
             WebDriverManager.edgedriver().setup();
             driver = new EdgeDriver();
			}
			
			
			//WebDriverManager.chromedriver().setup();
			//WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			Assert.assertTrue(driver.getTitle().contains("OrangeHRM"), "Title does not match");
			
			System.out.println("First jenkins job");
			//driver.quit();
	}

}
