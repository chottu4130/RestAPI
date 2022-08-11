package ResponseValidation;



import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class StaticResponceValidationTest 
{
	@Test
	public void staticResponceTest()
	{
		baseURI ="http://localhost";
		port =8084;
		
		String exp ="TY_PROJ_001";
		
		//step1 send the request and validate responcr
		
		Response res = when().get("/projects");
		
		String val = res.jsonPath().get("[0].projectId");
		
		System.out.println(val);
		
		
		
		Assert.assertEquals(exp, val);
					
		
		
	}

}
