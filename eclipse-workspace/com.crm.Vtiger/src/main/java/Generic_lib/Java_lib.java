package Generic_lib;

import java.util.Random;

public class Java_lib 
{
	public static int getRandom()
	{
		Random ran = new Random();
		int ranDom = ran.nextInt(1000);
		return ranDom;
	}

}
