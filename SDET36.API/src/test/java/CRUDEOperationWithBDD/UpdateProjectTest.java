package CRUDEOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class UpdateProjectTest
{
	@Test
	public void updateProjectTest()
	{
		baseURI ="http://localhost";
		port =8084;
		
		Random r =new Random(100);
		int num =r.nextInt();
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","nikhil");
		jobj.put("projectName","tyss"+num);
		jobj.put("status","on going");
		jobj.put("teamSize",30);
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.put("/projects/TY_PROJ_2603")
		.then()
		.assertThat().statusCode(200).log().all();
		
		
	}

}
