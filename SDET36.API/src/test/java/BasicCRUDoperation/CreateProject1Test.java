package BasicCRUDoperation;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProject1Test 
{
	@Test
	public void createProject1Test()
	{
		Random r=new Random();
		int num = r.nextInt(100);
		
		//Step 1 create necessary Data
		
		
		JSONObject obj=new JSONObject();
		obj.put("createdBy","raja");
		obj.put("projectName", "tata"+num);
		obj.put("status", "create");
		obj.put("teamSize", 20);
		
		
		//Step 2 Send the Request(precondition)   given
		
		RequestSpecification pre = RestAssured.given();
		pre.body(obj);
		pre.contentType(ContentType.JSON);
		
		Response po = pre.post("http://localhost:8084/addProject");
		
		
		//Step 3 validate
		
		ValidatableResponse p = po.then();
		p.log().all();
		
		
		
		
		
		
		
				
	}

}
