package com.subhasishMishra;

//Complex JSON object
/*{
 * "name", "Morpheous",
 * "job", "leader"
 * 
 * }
 * 
 * */

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class PostAPIComplexJSON {

	@Test
	void postAPI() {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "Morpheous");
		map.put("job", "leader");
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("C");
		
		HashMap<String, Object> det = new HashMap<String, Object>();
		det.put("CompanyName", "XYZ");
		det.put("emailID", "morpheus@xyz.com");
		
		map.put("details", det );
		

		Response response = given().auth().none().header("content-type", "application/json").body(map)
				.when()
				.post("https://reqres.in/api/users");

		System.out.println("Response is " + response.asString());
		System.out.println("Status code is " + response.statusCode());
		System.out.println("Response time is " + response.getTime());

		System.out.println("Executed successfully");

	}

}
