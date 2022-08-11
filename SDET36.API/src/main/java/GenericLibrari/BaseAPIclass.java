package GenericLibrari;

import java.sql.SQLException;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

/**
 * 
 * @author NIKHIL RAJ
 *
 */

public class BaseAPIclass 
{
	  	public DataBaseLibrary dlib=new DataBaseLibrary();
	    public JavaLibrary jlib=new JavaLibrary();
	    public RestAssuredLibrary rlib=new RestAssuredLibrary();
	    
	   
	    @BeforeSuite
	    public void bsConfig() throws SQLException
	    {
	    	dlib.connectDB();
	    	Reporter.log("========connection successful=========");
	    	
	    	baseURI ="http://localhost:8084";
	    	//port =8084;
	    	System.out.println("hiii");
	    }
	    
	    @AfterSuite
	    public void asConfig() throws SQLException
	    {
	    	dlib.closeDB();
	    	Reporter.log("========connection closed=========");
	    }
	  	

}
