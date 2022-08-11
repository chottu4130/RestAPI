package GenericLibrari;

import io.restassured.response.Response;

/**
 * this class contains rest assured specific reusable method
 * @author NIKHIL RAJ
 *
 */
public class RestAssuredLibrary 
{
	public String getJsnData( Response response,String path)
	{
		String jsonData = response.jsonPath().get(path);
		return jsonData;
		
	}

}
