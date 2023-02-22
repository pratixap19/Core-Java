import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//How to verify headers
public class TC003_GET_Request {
	@Test
	void googleMapTest() 
	{
		//Specify base URI
		RestAssured.baseURI = "https://maps.googleapis.com";
		
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Response object
		Response response = httpRequest.request(Method.GET, "");
		
		//Print response in console window
		String responseBody = response.getBody().asString();
		System.out.println("Response body is:" + responseBody);
		
		//Validating headers
		String contentType = response.header("content-type");
		System.out.println("Content type is" + contentType);
		Assert.assertEquals(contentType, "application/xml; charset=UTF-8");
		
		
		String contentEncoding = response.header("content-Encoding");
		System.out.println("Content encoding is: " + contentEncoding);
		Assert.assertEquals(contentEncoding, "gzip");
	}
	
	}

