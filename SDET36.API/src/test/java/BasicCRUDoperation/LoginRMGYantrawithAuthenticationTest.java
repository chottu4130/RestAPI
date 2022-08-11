package BasicCRUDoperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class LoginRMGYantrawithAuthenticationTest 
{
	@Test
	public void loginRmgTest()
	{
		RequestSpecification log1 = RestAssured.given();
		//log1.auth().basic("rmgyantra", "rmgy@9999").get("http://localhost:8084/login").then().log().all();
		log1.auth().basic("rmgyantra", "rmgy@9999");
		Response d = log1.get("http://localhost:8084/login");
		d.then().log().all();
		
		
	}

}
