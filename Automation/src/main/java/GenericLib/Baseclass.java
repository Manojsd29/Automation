package GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	

	public WebDriver driver ;
	
	@BeforeClass
	(groups= {"smokeTest","Regression"})
	public void beforeClassConfig() {
		System.out.println("Starting the execution of the Suite");
	}
	
	@AfterClass
	public void AfterClassConfig() {
		System.out.println("Ending the execution of the Suite");
	}
	
	@BeforeMethod
	public void beforeMethodConfig() {
		
		String browser = "chrome";
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equals("msedge")) {
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
		}
		else {
			System.out.println("Incorrect browser");
		}
	}
	
	@AfterMethod
	public void AfterMethodconfig() {
		driver.close();
	}
	}

