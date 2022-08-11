package BasicCRUDoperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetEmployeeByuserNameTest 
{
	@Test
	public void getEmploy()
	{
		
		Response up1 = RestAssured.get("http://localhost:8084/employees/TYP_00208");
		
		up1.then().log().all();
		
	}

}
