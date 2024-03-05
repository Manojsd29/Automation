package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getLogoutButton() {
		return LogoutButton;
	}

@FindBy (xpath ="//a[text()='Logout']")
	private WebElement LogoutButton;


}