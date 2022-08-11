package Authecation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicPreEmptiveAuth 
{
	@Test
	public void basicPriempthiveAuth()
	{
		baseURI ="http://localhost:8084";
		
		
		given().auth().preemptive().basic("rmgyantra", "rmgy@9999").when()
		.get("/login").then().assertThat().statusCode(202).log().all();
		
	}

}
