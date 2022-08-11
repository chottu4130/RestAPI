package SerilizationAndDeserilizationDetails;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSeralizationAndDeseralization.EmployDetailsWithArray;

public class DecentrilizeEmployWithArray 
{
	@Test
	public void decrntrilizeemploywithArray() throws JsonParseException, JsonMappingException, IOException
	{
		//Step1 create obj for object mapper  - jackson mapper
		ObjectMapper obj =new ObjectMapper();
		
		 EmployDetailsWithArray e1 = obj.readValue(new File(".\\employdetailswithArray.json"),EmployDetailsWithArray.class);
		
		System.out.println(e1.getName());
		System.out.println(e1.getEid());
		System.out.println(e1.getPhoneno()[1]);
		
	}
	
			
}
