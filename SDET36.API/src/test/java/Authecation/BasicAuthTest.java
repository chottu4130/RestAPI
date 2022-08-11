package Authecation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicAuthTest
{
	@Test
	public void basicOuth()
	{
		baseURI ="http://localhost:8084";
		
		
		//Stap 1 
		
		
		given().auth().basic("rmgyantra", "rmgy@9999")
		.when().get("/login").then().assertThat().statusCode(202).log().all();
	}

}
