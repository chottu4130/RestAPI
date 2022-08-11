package DifferentWayToPost;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;
import java.util.Random;

public class CreateProjectwithHasMapTest 
{
	@Test
	public void createPTest()
	{
		Random r=new Random();
		int num = r.nextInt(100);
		baseURI ="http://localhost";
		port =8084;
		
		HashMap map=new HashMap();
		map.put("createdBy","raj");
		map.put("projectName","tyss"+num);
		map.put("status","on going");
		map.put("teamSize",30);
		
		
		given()
		.body(map)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201).log().all();
		
				
	}

}
