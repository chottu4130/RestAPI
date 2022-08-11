package SerilizationAndDeserilizationDetails;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSeralizationAndDeseralization.EmployDetailsWithSpouse;
import POJOforSeralizationAndDeseralization.Spouse;

public class serilizationWothSpouse 

{
	@Test
	public void serilizeWithSpouse() throws JsonGenerationException, JsonMappingException, IOException
	{
		
	EmployDetailsWithSpouse spo=new EmployDetailsWithSpouse("nikhil", "ty1254", "abc@gmail.com", 14785, new Spouse("abc",4));
	
	ObjectMapper obj=new ObjectMapper();
	
	obj.writeValue(new File("./employWithSpouse.json"), spo);
			
		
	}
	

}
