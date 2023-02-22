import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//validate response body
public class TC004_GET_ValidatingResponseBody {
	@Test
	public void getWeatherDetails() {
		
		//Specify baseURI
		RestAssured.baseURI= "http://demoqa.com/utilities/weather/city";
		
		//Create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Create response object
		Response response = httpRequest.request(Method.GET, "/Delhi");
		
		//Convert JSON response into String
		String responseBody = response.getBody().asString();
		System.out.println("Response body is:"+ responseBody);
		
		Assert.assertEquals(responseBody.contains("Delhi"), true);
		
	}

}
