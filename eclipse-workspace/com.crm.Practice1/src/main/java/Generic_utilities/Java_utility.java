package Generic_utilities;

import java.util.Random;

public class Java_utility 
{
	public int getRanDomNUM()
	{
		/*
		 * this method is used to avoid Duplicate
		 * prepaerd by shivashankar r
		 */
		Random ran = new Random();
		int RanNum = ran.nextInt(1000);
		return RanNum;
	}

}
