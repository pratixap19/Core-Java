import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//How to capture values of all nodes from the response
public class TC005_GET_ExtractValuesOfEachNodesInJSON {
	@Test
	public void getWeatherDetails() {
		
		//Specify baseURI
		RestAssured.baseURI = "http://demoqa.com/utilities/weather/city";
		
		//Create request
		RequestSpecification httpRequest = RestAssured.given();
		
		//response object
		Response response = httpRequest.request(Method.GET,"/Hyderabad");
		
		//With the help of JsonPath class we can extract all the values on nodes in the response
		JsonPath jsonpath = response.jsonPath();
		System.out.println(jsonpath.get("City"));
		System.out.println(jsonpath.get("Temprature"));
		System.out.println(jsonpath.get("Humidity"));
		System.out.println(jsonpath.get("WeatherDescription"));
		System.out.println(jsonpath.get("WindSpeed"));
		System.out.println(jsonpath.get("WindDirectionDegree"));
		
		Assert.assertEquals(jsonpath.get("City"), "Hyderabad");
		
		
	}

}
