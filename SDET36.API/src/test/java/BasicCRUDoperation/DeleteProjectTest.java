package BasicCRUDoperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class DeleteProjectTest
{
	@Test
	public void deleteProjectTest()
	{
		
		 //Step 1 create the necessary data
		
		
		//Step 2 send the request
		Response resp = RestAssured.delete("http://localhost:8084/projects");
		
		
		
		// step 3 validate the response
		ValidatableResponse valid = resp.then();
		
		valid.log().all();
	}

}
