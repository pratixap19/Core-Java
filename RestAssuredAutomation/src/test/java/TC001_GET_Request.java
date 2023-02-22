import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request {
	
	    @Test
		void getWeatherDetails() 
		
		{
			
			//Specify base URI
			RestAssured.baseURI = "http://demoqa.com/utilities/weather/city";
			
			//Create request object - we are sending request to the server by this code
			RequestSpecification httpRequest = RestAssured.given();
			
			//We need to create response object
			Response response = httpRequest.request(Method.GET,"/Hyderabad");
			
			//Print response in console window
			String responseBody = response.getBody().asString();
			System.out.println("Response Body is:" + responseBody);
			
			//status code validation
			int statusCode = response.getStatusCode();
			System.out.println("Status code is:" + statusCode);
			Assert.assertEquals(statusCode, 200);
			
			//status line validation
			String statusLine = response.getStatusLine();
			System.out.println("Status line is:" + statusLine);
			Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		}

	}


