package RequestChaning;

import org.testng.annotations.Test;

import POJOClass.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectAndGetProjectTest 
{
	@Test
	public void createProjAndDeletePOrojTest()
	{
		Random r=new Random();
				int num = r.nextInt(100);
				
		baseURI ="http://localhost:8084";
		
		//Step 1 create the data
		ProjectLibrary poj=new ProjectLibrary("nikhil","tyss"+num,"on going",20); 
		
		//step2 send the post req
		Response res = given().body(poj).contentType(ContentType.JSON).when().post("/addProject");
		
		//step 3 capture project id from the responce body using json path
		String pid =res.jsonPath().get("projectId");
		//step 4 use the captured proj id in get request
		
		given().pathParam("projid", pid)
		 .when().get("/projects/{projid}")
		 .then().assertThat().statusCode(200).log().all();
		
		//step 5 use the proj id in delete req
		given().pathParam("projid", pid)
		 .when().delete("/projects/{projid}")
		 .then().assertThat().statusCode(204).log().all();
	}
}
