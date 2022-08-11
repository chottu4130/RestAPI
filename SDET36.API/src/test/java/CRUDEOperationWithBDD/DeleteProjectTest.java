package CRUDEOperationWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteProjectTest
{
	@Test
	public void delectProjectTest()
	
	{

		baseURI ="http://localhost";
		port =8084;
		
		when()
		.delete("/projects/TY_PROJ_2604")
		.then()
		.assertThat().statusCode(204).log().all();
	}

}
