package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParamater 
{
	@Test
	public void qurayParamaterTest()
	{
		baseURI ="https://reqres.in/";
		
		given()
		.queryParam("page", 3)
		.when()
		.get("/api/users")
		.then().log().all();
	}

}
