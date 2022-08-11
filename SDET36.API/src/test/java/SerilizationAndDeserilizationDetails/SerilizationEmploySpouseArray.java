package SerilizationAndDeserilizationDetails;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSeralizationAndDeseralization.EmploySpouseArray;
import POJOforSeralizationAndDeseralization.SpouseArray;

public class SerilizationEmploySpouseArray 

{
	@Test
	public void serilizationSpouseArray() throws JsonGenerationException, JsonMappingException, IOException
	{
		int [] ephone= {123654,96321};
		String []email= {"abc@gmail,xxxx@gmail.com"};
		
		EmploySpouseArray emp=new EmploySpouseArray("nikhil", "ty456", ephone, email, new SpouseArray("raj", 5, 7452));
		
		ObjectMapper obj =new ObjectMapper();
		
		obj.writeValue(new File("./SpouseArray.json"), emp);
		
	}
	

}
