package SerilizationAndDeserilizationDetails;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSeralizationAndDeseralization.EmployDetailsWithSpouse;

public class DecentrilizeEmployWithSpouse
{
	@Test
	public void decerlizationwithSpouse() throws JsonParseException, JsonMappingException, IOException
	{
		//Step1 create obj for object mapper  - jackson mapper
	ObjectMapper obj =new ObjectMapper();
	EmployDetailsWithSpouse e1 = obj.readValue(new File(".\\employWithSpouse.json"),EmployDetailsWithSpouse.class);
	System.out.println(e1.getEmail());
	System.out.println(e1.getName());
	System.out.println(e1.getS().getName());
				
				
	}

}
