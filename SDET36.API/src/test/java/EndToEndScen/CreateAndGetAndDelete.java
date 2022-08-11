package EndToEndScen;

import org.testng.annotations.Test;


import GenericLibrari.BaseAPIclass;
import GenericLibrari.DataBaseLibrary;
import GenericLibrari.EndPointsLibrary;
import GenericLibrari.IConstants;
import GenericLibrari.JavaLibrary;
import POJOClass.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

public class CreateAndGetAndDelete extends BaseAPIclass
{
	@Test
	public void createAndGetTest() throws SQLException
	{
		
	
		
		ProjectLibrary poj=new ProjectLibrary("raju", "tyss1234"+jlib.getRandomNumber(), "on going", 20);
		
		Response projid = given().body(poj)
				.contentType(ContentType.JSON).when()
				.post(EndPointsLibrary.createProject);
		
		//String pi = projid.jsonPath().get("projectId");
		String pi = rlib.getJsnData(projid, "projectId");
		System.out.println(pi);
		
		
		String q="select * from project;";
		
		String actData = dlib.readDataFormDBAndValidate(q, 1,pi );
		
		
		
		ProjectLibrary poj1=new ProjectLibrary("sss", "tyss1234"+jlib.getRandomNumber(), "delete", 20);
		
		
	}
	

}
