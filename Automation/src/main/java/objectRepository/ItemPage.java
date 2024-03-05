package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage {
public ItemPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getClickmainItem() {
	return clickmainItem;
}
public WebElement getProceedToCheckButton() {
	return proceedToCheckButton;
}
@FindBy (xpath ="//a[@title=\"View your shopping cart\"]")
private WebElement clickmainItem;


@FindBy (xpath ="//a[contains(text(),'	Proceed to Checkout')]")
private WebElement proceedToCheckButton;


}
