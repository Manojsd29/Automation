package HomePageModule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLib.Baseclass;
import GenericLib.FileUtility;
import objectRepository.HomePage;
@Listeners(GenericLib.LisImplementation.class)
public class HomePagewithThreeSlidders extends Baseclass {
	
	@Test
	public void HomePagecaseTest() throws Throwable {
		
		FileUtility fiu= new FileUtility();
		

		String URL=fiu.getPropertyValue("url");
		
		HomePage Hp= new HomePage(driver);
		
		// Enter the URL �http://practice.automationtesting.in/�
		driver.get(URL);
		driver.manage().window().maximize();
		Hp.getShopbutton().click();
		Hp.getHomeButton().click();
		
		 List<WebElement> sliders = driver.findElements(By.xpath("//img [@class=\"n2-ss-slide-background-image n2-ss-slide-fill n2-ow\"]"));
//		   // Assert that there are exactly 3 sliders present
     if (sliders.size() == 3) {
         System.out.println("Verified: Three sliders are present on the page.");
     } else {
         System.out.println("Error: The number of sliders found is not equal to 3.");
     }

}
}
