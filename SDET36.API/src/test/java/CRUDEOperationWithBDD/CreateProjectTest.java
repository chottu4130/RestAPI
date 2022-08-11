package CRUDEOperationWithBDD;



import static io.restassured.RestAssured.*;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class CreateProjectTest 
{
	@Test
	public void createProjectTest()
	{
		baseURI ="http://localhost";
		port =8084;
		
		Random r =new Random();
		int num =r.nextInt(100);
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","nikhil");
		jobj.put("projectName","tyss"+num);
		jobj.put("status","Created");
		jobj.put("teamSize",30);
		
		//Step 2 send the req
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201).log().all();
		
		
	}

}
