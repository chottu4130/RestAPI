package DifferentWayToPost;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectWithFormParamaterTest 
{
	@Test
	public void projectwithFormParameter()
	{
		baseURI ="http://localhost";
		port =8084;
		
		given().formParam("createdBy", "rani")
			.formParam("projectName", "tata")
			.formParam("status", "on")
			.formParam("teamSize", 31)
			.contentType(ContentType.JSON)
			.when()
			.post("/addProject")
			.then()
			.assertThat().statusCode(201).log().all();
			
		
		
		
	}

}
