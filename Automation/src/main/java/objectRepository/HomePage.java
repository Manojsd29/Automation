package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText="Shop")
	private WebElement shop;

@FindBy (linkText="Home")
private WebElement Home;

@FindBy (xpath ="//a[@href=\"/?add-to-cart=160\"]")
private WebElement AddtoBasket;


@FindBy (xpath ="//h3[text()='Selenium Ruby']")
private WebElement clickseleniumRuby;

@FindBy(xpath ="//a[@href=\"https://practice.automationtesting.in/my-account/\"]")
private WebElement MyAccountButton;

public WebElement getShopbutton() {
	return shop;
	
}

public WebElement getHomeButton() {
	return Home;
}


public WebElement getAddtoBasket() {
	return AddtoBasket;
	
}
public WebElement clickseleniumRuby() {
	return clickseleniumRuby;
	
}

public WebElement getMyAccountButton() {
	return MyAccountButton;
}
	
	
}
