package ResponseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;



public class DynamicResponcevalidation
{
	@Test
	public void dynamicresponceValidationTest()
	{
		baseURI ="http://localhost";
		port =8084;
		
		boolean flag=false;
		String exp ="TY_PROJ_001";
		
		Response resp = when().get("/projects");
		
		List<String> list = resp.jsonPath().get("projectId");
		
		for(String de:list)
		{
			if(de.equalsIgnoreCase(exp))
			{
				System.out.println(de);
				flag=true;//flag rising
				break;
				
			}
				
		}
		
		Assert.assertTrue(flag);
		
		
		
		
		
	}

}
