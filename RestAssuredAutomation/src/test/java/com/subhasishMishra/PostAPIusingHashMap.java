package com.subhasishMishra;

//In post request sending body in form of a JSON object.(Pass JSON body as an object}.

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.response.Response;


public class PostAPIusingHashMap {
	@Test
	void postAPI() {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name","Morpheous");
		map.put("job", "leader");
		
		Response response = given().auth().none().header("content-type", "application/json").body(map)
				.when()
				.post("https://reqres.in/api/users");

		System.out.println("Response is " + response.asString());
		System.out.println("Status code is " + response.statusCode());
		System.out.println("Response time is " + response.getTime());

		System.out.println("Executed successfully");
		
    	
		
		
	}

}
