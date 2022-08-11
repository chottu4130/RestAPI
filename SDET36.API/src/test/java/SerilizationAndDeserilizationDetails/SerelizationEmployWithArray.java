package SerilizationAndDeserilizationDetails;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSeralizationAndDeseralization.EmployDetailsWithArray;

public class SerelizationEmployWithArray
{
	@Test
	public void serilizeemploywithArray() throws JsonGenerationException, JsonMappingException, IOException
	{
		int phoneno[]= {123654,9632145};
		String emailid[]= {"abc@gmail.com","xyz@gmail.com"};
		
		EmployDetailsWithArray arr=new EmployDetailsWithArray("nikhil", "yt123",phoneno,emailid ,"123#aaaa");
		
		ObjectMapper obj =new ObjectMapper();
		
		obj.writeValue(new File("./employdetailswithArray.json"), arr);
	}

}
