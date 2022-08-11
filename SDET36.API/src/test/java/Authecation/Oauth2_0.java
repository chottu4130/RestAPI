package Authecation;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth2_0 
{
	@Test
	public void oauth2Test()
	{
		
		baseURI ="http://coop.apps.symfonycasts.com";
		
		
		//generate the access token
		
		Response res = given()
		.formParam("client_id", "chottu1430")
		.formParam("client_secret", "14f973f6f84a6b28f2d6fdebac8b6578")
		.formParam("grant_type", "client_credentials")
		.formParam("redirect_uri", "http://example.com")
		.formParam("code", "authorization_code ")
		
		.when()
		.post("/token");
		
		String token = res.jsonPath().get("access_token");
		System.out.println(token);
		
		
		//utilize the access token
		
		given().auth().oauth2(token).pathParam("USER_ID", 3681).when()
		.post("/api/{USER_ID}/eggs-collect").then().log().all();
		
	}

}
