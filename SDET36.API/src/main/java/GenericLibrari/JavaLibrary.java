package GenericLibrari;

import java.util.Random;

/**
 * this class contains all java specific generate method
 * @author NIKHIL RAJ
 *
 */
public class JavaLibrary 
{
	/**
	 * this method will generate random number for every execution
	 * @return
	 */
	
	public int getRandomNumber()
	{
		Random r=new Random();
		return r.nextInt(1000);
	}

}
