package DifferentWayToPost;

import org.testng.annotations.Test;

import POJOClass.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectWithPOJO 
{
	@Test
	public void peojectWithPOJOTest()
	{
		baseURI ="http://localhost";
		port =8084;
		
		Random r =new Random();
		int num = r.nextInt(100);
		
		ProjectLibrary poj=new ProjectLibrary("nik", "sony"+num, "on going", 20);
		
		given()
		.body(poj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201).log().all();
		
		
		
	}

}
