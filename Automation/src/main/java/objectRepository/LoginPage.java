package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
@FindBy (xpath="//input[@name=\"login\"]")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

	

	public WebElement getRegisterNameBlock() {
		return registerNameBlock;
	}
public WebElement getRegisterPasswordBlock() {
		return registerPasswordBlock;
	}

@FindBy (xpath="//input[@type=\"email\" and @id ='reg_email']")
	private WebElement registerNameBlock;


@FindBy (xpath="//input[@type=\"password\" and @id ='reg_password']")
private WebElement registerPasswordBlock;


@FindBy (xpath="//input[@type=\"submit\" and @name ='register']")
private WebElement registerButton;

public WebElement getRegisterButton() {
	return registerButton;
}
}
