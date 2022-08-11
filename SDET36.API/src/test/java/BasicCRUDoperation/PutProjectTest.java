package BasicCRUDoperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutProjectTest 
{
	@Test
	public void updateProjectTest()
	{
		//Step 1 create the necessary data
				JSONObject jobj=new JSONObject();
				jobj.put("createdBy","nikhil");
				jobj.put("projectName","tyss");
				jobj.put("status","on going");
				jobj.put("teamSize",20);
				
				
				
				//Step 2 send the request
				
				RequestSpecification res = RestAssured.given();
				res.body(jobj);
				res.contentType(ContentType.JSON);
				
				Response resp = res.put("http://localhost:8084/projects/TY_PROJ_1803");
				
				// step 3 validate the response
				
				resp.then().log().all();
				
				
	}

}
