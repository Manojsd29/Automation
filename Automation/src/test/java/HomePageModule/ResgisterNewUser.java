package HomePageModule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLib.Baseclass;
import GenericLib.FileUtility;
import GenericLib.JavaUtility;
import GenericLib.WebDriverUtility;
import objectRepository.HomePage;
import objectRepository.LoginPage;
@Listeners(GenericLib.LisImplementation.class)
public class ResgisterNewUser extends Baseclass{
	@Test(groups= {"smokeTest"})
	public void registerNewUserTest() throws Throwable {
		FileUtility fiu= new FileUtility();
		WebDriverUtility wdu= new WebDriverUtility();
        JavaUtility jv = new JavaUtility();
		
        String URL=fiu.getPropertyValue("url");

		HomePage Hp= new HomePage(driver);
		
		// Enter the URL �http://practice.automationtesting.in/�
		driver.get(URL);
		
	
		Hp.getMyAccountButton().click();
		LoginPage Lp=new LoginPage(driver);
		
		String stringname = jv.randomSTring();
		System.out.println(stringname);
		
		Lp.getRegisterNameBlock().sendKeys("manoj.sd"+stringname+"@gmail.com");
		Lp.getRegisterPasswordBlock().sendKeys("Password_"+stringname);
		wdu.waitUntilPageLoad(driver);
		Lp.getRegisterButton().click();
		}
}
