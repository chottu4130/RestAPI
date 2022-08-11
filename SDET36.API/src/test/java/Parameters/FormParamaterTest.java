package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class FormParamaterTest 
{
	@Test
	public void formParamaterTest()
	{
		baseURI ="http://localhost:8084";
		
		given().formParam("createdBy", "rani")
		.formParam("projectName", "tata")
		.formParam("status", "on")
		.formParam("teamSize", 31)
		.when()
		.post("/projects")
		.then().log().all();
		
	}

}
