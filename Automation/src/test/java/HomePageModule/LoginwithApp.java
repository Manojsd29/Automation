package HomePageModule;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLib.Baseclass;
import GenericLib.FileUtility;
import GenericLib.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;
@Listeners(GenericLib.LisImplementation.class)
public class LoginwithApp extends Baseclass{
	@Test
	public void loginToAppTest() throws Throwable {
		
		FileUtility fiu= new FileUtility();
		WebDriverUtility wdu= new WebDriverUtility();

		String URL=fiu.getPropertyValue("url");
		

		HomePage Hp= new HomePage(driver);
		
		// Enter the URL �http://practice.automationtesting.in/�
		driver.get(URL);
		
		driver.manage().window().maximize();
		Hp.getMyAccountButton().click();
		
		wdu.login(driver, "manoj.29sd@gmail.com","9844533012");
		
		LoginPage Lp=new LoginPage(driver);
		
		Lp.getLoginButton().click();
		String value = driver.findElement(By.xpath("//strong[text()=\"manoj.29sd\"]")).getText();
		if(value.toString().equals("manoj.29sd")) {
		     System.out.println("Verified: Login value is correct on the page.");
	     } else {
	         System.out.println("Error: Incorrect");
		}
		
		
	}
@Test
  public void logOutToAppTest() throws Throwable {
	
	FileUtility fiu= new FileUtility();
	WebDriverUtility wdu= new WebDriverUtility();

	String URL=fiu.getPropertyValue("url");
	

	HomePage Hp= new HomePage(driver);
	DashboardPage Db=new DashboardPage(driver);
	
	// Enter the URL �http://practice.automationtesting.in/�
	driver.get(URL);
	driver.manage().window().maximize();
	
	Hp.getMyAccountButton().click();
	
	wdu.login(driver, "manoj.29sd@gmail.com","9844533012");
	
	LoginPage Lp=new LoginPage(driver);
	
	Lp.getLoginButton().click();
	String value = driver.findElement(By.xpath("//strong[text()=\"manoj.29sd\"]")).getText();
	if(value.toString().equals("manoj.29sd")) {
	     System.out.println("Verified: Login value is correct on the page.");
     } else {
         System.out.println("Error: Incorrect");
	}
	Db.getLogoutButton().click();
	String PageTitle = driver.getTitle();
	Assert.assertEquals("My Account – Automation Practice Site", PageTitle);
	
  }
}
