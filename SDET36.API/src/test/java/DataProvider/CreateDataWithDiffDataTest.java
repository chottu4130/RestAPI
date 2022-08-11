package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataDrivenTesting.CreateMultipleProjectWithDiffDataTest;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateDataWithDiffDataTest
{
	@Test(dataProvider = "data")
	public void cteateData(String createdBy, String projectName, String status, int teamSize)
	{
		
		CreateMultipleProjectWithDiffDataTest c=new CreateMultipleProjectWithDiffDataTest (createdBy, projectName, status, teamSize);
		//CreateMultipleProjectWithDiffDataTest c=new CreateMultipleProjectWithDiffDataTest();
		baseURI ="http://localhost";
		port =8084;
		
		given()
		.body(c)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.log().all();
		
		
}
	@DataProvider(name="data")
	public Object[][] data()
	{
		Object[][] data = new Object[3][4];
		
		data[0][0] = "nikhil";
		data[0][1] = "Dell";
		data[0][2] = "Create";
		data[0][3] = 10;
		
		data[1][0] = "raje";
		data[1][1] = "soni";
		data[1][2] = "on going";
		data[1][3] = 20;
		
		data[2][0] = "rani";
		data[2][1] = "tyss";
		data[2][2] = "On Going";
		data[2][3] = 30;
		
		
		
		return data;

}
	
}
