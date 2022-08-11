package DifferentWayToPost;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjWithJSONOnjTest 
{
	@Test
	public void createProjTest()
	{
		baseURI ="http://localhost";
		port =8084;
		
		Random r =new Random();
		int num =r.nextInt(100);
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","raj");
		jobj.put("projectName","tyss"+num);
		jobj.put("status","on going");
		jobj.put("teamSize",30);
		
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201).log().all();
	}

}
