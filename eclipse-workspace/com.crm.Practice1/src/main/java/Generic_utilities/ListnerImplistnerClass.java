package Generic_utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImplistnerClass implements ITestListener
{

	public void onTestFailure(ITestResult result)
	{
		String testname = result.getMethod().getMethodName();
		System.out.println(testname+"execute testname I am listening");
		WebDriver driver = null;
		EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
		File src = edriver.getScreenshotAs(OutputType.FILE);
		try {
			File dst = new File("./com.crm.Practice1/"+testname+".png");
			FileUtils.copyFile(src, dst);
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
	}
}
