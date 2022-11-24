package Generic_utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer
{
	int count=0;
	int retrylimit=0;
	public boolean retry(ITestResult result) 
	{
		// TODO Auto-generated method stub
		if(count<retrylimit)
		{
			count++;
			
		}
		return false;
		
	}

}
