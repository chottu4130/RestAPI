package CRUDEOperationWithBDD;


import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;




public class GetAllProjectTest 
{
	@Test
	public void getallProjectTest()
	{
		baseURI ="http://localhost";
		port =8084;
		
		when()
		.get("/projects")
		.then()
		.assertThat().statusCode(200).log().all();
	}

}
