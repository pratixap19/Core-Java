import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_POST_Request {
	
	@Test
	void registrationSuccessful() 
	{
		
		//Specify base URI
		RestAssured.baseURI  = "http://demoqa.com/customer";
		
		//Create request object - we are sending request to the server by this code
		RequestSpecification httpRequest = RestAssured.given();
		
		
		//Request payload sending along with POST request
		// JSONObject is a class that represents a Simple JSON.
		// We can add Key - Value pairs using the put method
		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "Virender"); 
		requestParams.put("LastName", "Singh");
		requestParams.put("UserName", "simpleuser001");
		requestParams.put("Password", "password1");
		requestParams.put("Email",  "someuser@gmail.com");
		
		// Add a header stating the Request body is a JSON.It is also going to send as a part of post request
		httpRequest.header("Content-Type", "application/json");
		 
		// Attach above data to the request. You can get the String representation of JSONObject by calling toJSONString()
		httpRequest.body(requestParams.toJSONString());
		 
		// Response object
		Response response = httpRequest.request(Method.POST,"/register");
		
		
		//Print response in console window
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is:" + responseBody);
		
		//status code validation
		int statusCode = response.getStatusCode();
		System.out.println("Status code is:" + statusCode);
		Assert.assertEquals(statusCode, 201);
		
		//Success code validation
		String successCode = response.jsonPath().get("SuccessCode");
		Assert.assertEquals( "Correct Success code was returned",  "OPERATION_SUCCESS");
		
		//Response body
		
		System.out.println("Response body:" + response.body().asString());
	}
	
}
