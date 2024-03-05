package Examples;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLib.Baseclass;
import GenericLib.FileUtility;
import objectRepository.HomePage;

@Listeners(GenericLib.LisImplementation.class)
public class MakeFail extends Baseclass {
	@Test
	public void makeFailTest() throws Throwable {
		FileUtility fiu= new FileUtility();
		
        String URL=fiu.getPropertyValue("url");

		HomePage Hp= new HomePage(driver);
		
		// Enter the URL �http://practice.automationtesting.in/�
		driver.get(URL);
		
		driver.manage().window().maximize();
		Hp.getMyAccountButton().click();
	
		Assert.fail();
	}
}
