package ResponcrTime;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ResponceTimeValidateWithMatchers 
{
	@Test
	public void responceTime()
	{
		basePath ="http://localhost:8084";
		
		when().get("/projects").then()
		.assertThat().time(Matchers.lessThan(10000l),TimeUnit.MILLISECONDS);
		
	}

}
