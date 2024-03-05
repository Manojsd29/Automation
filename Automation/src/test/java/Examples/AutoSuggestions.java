package Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestions {

	@Test
	public void autogoogleSuggestion() throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
//		WebDriver driver =new FirefoxDriver();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("IPL");
		Thread.sleep(3000);
		List<WebElement> allsuggest = driver.findElements(By.xpath("//span[text()='IPL']/../../../../../../li"));
		int count = allsuggest.size();
		System.out.println(count);
		
		
		for(int i=0;i<count;i++) {
			WebElement name = allsuggest.get(i);
			String details = name.getText();
			System.out.println(details);
		

	}
		driver.close();
}
}