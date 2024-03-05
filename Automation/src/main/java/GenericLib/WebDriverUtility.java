package GenericLib;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverUtility {

	WebDriver driver;
	
	/**
	 * Implicitwait implementation
	 */
	

	public void waitUntilPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * Code to maximize the window
	 */
	
	
    public void swtichtoWindow(WebDriver driver, String Value) {
    	Set<String> allwin = driver.getWindowHandles();
    	Iterator<String> iter = allwin.iterator();
    	while(iter.hasNext()) {
    		String title = driver.switchTo().window(Value).getTitle();
    		if(title.contains(Value)) {
    		break;
    	}
    }
	
	
}
    public void login(WebDriver driver ,String name ,String password ) {
	driver.findElement(By.id("username")).sendKeys(name);
	driver.findElement(By.id("password")).sendKeys(password);
    	
    }
	
}
