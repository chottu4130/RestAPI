package BasicCRUDoperation;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class CreateProjectTest
{
	@Test
	public void  createProjectTest()
	{
		Random r =new Random();
		int num=r.nextInt(1000);
		
		
		//Step 1 create the necessary data
		
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","nikhil");
		jobj.put("projectName","tyss"+num);
		jobj.put("status","created");
		jobj.put("teamSize",20);
		
		
		//Step 2 send the request
		RequestSpecification requ = RestAssured.given();
		requ.body(jobj);
		requ.contentType(ContentType.JSON);
		
		Response response = requ.post("http://localhost:8084/addProject");
		
		
		// step 3 validate the response
		
		ValidatableResponse va = response.then();
		va.log().all();
		
	
	
	}

}
