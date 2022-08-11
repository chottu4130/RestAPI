package BasicCRUDoperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteEmployeeByEmployeeIdTest 
{
	@Test
	public void deleteEmpTest()
	{
		Response d = RestAssured.delete("http://localhost:8084/employees/TYP_00208");
		d.then().log().all();
	}

}
