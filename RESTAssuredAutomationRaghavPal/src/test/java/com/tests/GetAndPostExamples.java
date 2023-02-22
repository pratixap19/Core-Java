package com.tests;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class GetAndPostExamples {
	@Test
	public void testGet() {

		baseURI = "https://reqres.in/api";
		given().
		get("/users?page=2").
		then().
		statusCode(200).
		body("data[4].first_name", equalTo("George")).
		log().
		all();

	}

	@Test
	public void testPost() {

		// Request payload sending along with POST request so need to create request
		// payload.
		// JSONObject is a class that represents a Simple JSON.
		// We can add Key - Value pairs using the put method

		JSONObject request = new JSONObject();
		request.put("name", "Raghav");
		request.put("job", "Teacher");

		System.out.println("Request payload is" + request.toJSONString());

		baseURI = "https://reqres.in/api";

		given().
		// Add a header stating the Request body is a JSON.It is also going to send as a
		// part of post request
				header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).
				when().post("/users").then().statusCode(201).log().all();
	}

}
