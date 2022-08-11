package SerilizationAndDeserilizationDetails;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSeralizationAndDeseralization.EmployDetalls;

public class SerilizationEmployDetails 
{
	@Test
	public void serilizationEmployTest () throws JsonGenerationException, JsonMappingException, IOException
	{
		//Step 1 create obj for EmployDetails
		EmployDetalls emp=new EmployDetalls("nikhil", "ty123", 2365418, "acc@gmail.com");
		
		//Step2 create obj for object mapper from jackson mapper
		
		ObjectMapper obj =new ObjectMapper();
		
		//step 3 write the value using writevalue method
		
		obj.writeValue(new File("./EmployName.json"), emp);
				
	}

}
