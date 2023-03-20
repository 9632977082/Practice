package Generic_lib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{
		String testName = result.getMethod().getMethodName();
		System.out.println(testName+"execute i am listening");
		EventFiringWebDriver edriver = new EventFiringWebDriver(Base_class.driver);
		File src = edriver.getScreenshotAs(OutputType.FILE);
		try
		{
			File dst = new File("./Screenshot/"+testName+".png");
		     FileHandler.copy(src, dst);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
