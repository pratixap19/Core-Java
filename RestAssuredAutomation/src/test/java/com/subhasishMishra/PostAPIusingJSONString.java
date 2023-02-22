package com.subhasishMishra;

//In post request sending body in form of JSON string.(Pass JSON body as a String}.
//for Post request we don't need to use query parameters.
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class PostAPIusingJSONString {
	//In java anything you write in "" double quote you face issue with escapesequence. We can resolve it by using \.
	@Test
	void postAPI() {
		
		String payload = "{\"name\": \"Morpheous\", \"job\": \"leader\"}";
		
		Response response = given().auth().none().header("content-type", "application/json").body(payload)
				.when()
				.post("https://reqres.in/api/users");

		System.out.println("Response is " + response.asString());
		System.out.println("Status code is " + response.statusCode());
		System.out.println("Response time is " + response.getTime());

		System.out.println("Executed successfully");
		
    	
    }
}
