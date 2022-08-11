package BasicCRUDoperation;

import org.json.simple.JSONObject;
import org.junit.runner.Request;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


public class UpdateProject1Test 
{
	@Test
	public void updateProjectTest()
	{
		//Step 1 create the necessary data
		

		JSONObject obj=new JSONObject();
		obj.put("createdBy","raja");
		obj.put("projectName", "tata12");
		obj.put("status", "On Going");
		obj.put("teamSize", 30);
		
		//Step 2 Send the request
		
		RequestSpecification upd = RestAssured.given();
		upd.body(obj);
		upd.contentType(ContentType.JSON);
		 Response po = upd.put("http://localhost:8084/projects/TY_PROJ_2404");
		
		//Step 3 validate 
		ValidatableResponse va = po.then();
		va.log().all();
		
	}

}
