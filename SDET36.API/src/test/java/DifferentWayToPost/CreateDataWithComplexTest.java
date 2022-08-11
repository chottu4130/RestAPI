package DifferentWayToPost;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateDataWithComplexTest 
{
	@Test
	public void complexData()
	{
		baseURI="https://petstore.swagger.io/v2";
		
		JSONObject j=new JSONObject();
		j.put("id",101);
		j.put("name","raja");
		
		//2 object
		
		
		JSONObject tags=new JSONObject();
	
		tags.put("id", 102);
		tags.put("name","rani");
		
		JSONObject obj=new JSONObject();
		obj.put("id", 1);
		obj.put("category", j);
		obj.put("name", "iyappa");
		String [] photo = {"https://images.news18.com/ibnlive/uploads/2022/07/salman-khan-2.jpg","https://images.news18.com/ibnlive/uploads/2022/07/salman-khan-2.jpg"};
		
		
		obj.put("photoUrls", photo);
		
		
		obj.put("tags",tags);
		obj.put("status", "available");
		
		given().body(obj).contentType(ContentType.JSON).when().post("/pet").then().log().all();
	}

}


