package SerilizationAndDeserilizationDetails;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSeralizationAndDeseralization.EmployDetalls;

public class DeseralizationEmploy 
{
	@Test
	public void deseralizationEmployDetails() throws JsonParseException, JsonMappingException, IOException
	{
		//Step1 create obj for object mapper  - jackson mapper
		
		ObjectMapper obj =new ObjectMapper();
		
		//step 2 eadvalue for object mapper
		
		EmployDetalls emp1 = obj.readValue(new File(".\\EmployName.json"),EmployDetalls.class);
		
		//fatch the value for class
		System.out.println(emp1.getEmail());
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhone());
				
	}

}
