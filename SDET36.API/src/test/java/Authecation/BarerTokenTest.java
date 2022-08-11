package Authecation;



import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BarerTokenTest
{
	@Test
	public void barerTokenTest()
	{
		
		//create pre req
		HashMap map =new HashMap();
		
		map.put("name", "Api reatassured");
		map.put("description", "Api framwork");
		
		given()
		.auth().oauth2("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")
		.body(map)
		.contentType(ContentType.JSON)
		
		//send the req and validate responce
		.when()
		.post("https://api.github.com/user/repos")
		.then().log().all();
				
		
	}

}
