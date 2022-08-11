package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PatahParamater
{
	@Test
	public void pathParamaterTest()
	{
		baseURI ="http://localhost:8084";
		
		given()
		.pathParam("pid","TY_PROJ_001")
		.when()
		.get("/projects/{pid}")
		.then().log().all();
		
				
		
	}

}
