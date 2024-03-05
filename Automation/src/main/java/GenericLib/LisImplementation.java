package GenericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LisImplementation implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

		String Testcasename = result.getMethod().getMethodName();
		Object obj = result.getInstance();
		WebDriver driver= null;
		System.out.println(Testcasename+"Excecute =============Test listening the flow");
		try {
			driver=(WebDriver)result.getTestClass().getRealClass().getSuperclass().getDeclaredField("driver").get(obj);
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		
			
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src =ts.getScreenshotAs(OutputType.FILE);
			File desn = new File("./screenshot/"+Testcasename+".PNG");
			try {
			FileUtils.copyFile(src, desn);
		
		
		}
		catch(IOException e){
			e.printStackTrace();
			System.out.println("Exception for Test:"+e.getMessage());
		}
	}

}
