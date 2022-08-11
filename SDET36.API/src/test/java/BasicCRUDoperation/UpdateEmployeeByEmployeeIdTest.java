package BasicCRUDoperation;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateEmployeeByEmployeeIdTest
{
	@Test
	public void updateEmployTest()
	{
		
		
		
		Random r=new Random();
		int num = r.nextInt(100);
		
		JSONObject obj=new JSONObject();
		obj.put("designation", "QA");
		obj.put("dob", "01/11/111");
		obj.put("email", "john123@gmail.com");
		obj.put("empName", "john"+num);
		obj.put("experience", 3);
		obj.put("mobileNo", "1234567890");
		obj.put("password", "john@123");
		obj.put("project", "rmg");
		obj.put("role", "QA");
		obj.put("username", "john"+num);
		
		RequestSpecification rest = RestAssured.given();
		rest.body(obj);
		rest.contentType(ContentType.JSON);
		
		Response p = rest.put("http://localhost:8084/employees/TYP_00208");
		
		p.then().log().all();
		
	}

}
