package com.tests;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutPatchDelete {
	
	@Test
	public void testPut() {

		// Request payload sending along with POST request so need to create request payload.
		// JSONObject is a class that represents a Simple JSON.
		// We can add Key - Value pairs using the put method

		JSONObject request = new JSONObject();
		request.put("name", "Raghav");
		request.put("job", "Teacher");

		System.out.println(request.toJSONString());

		baseURI = "https://reqres.in/api";

		given().
		// Add a header stating the Request body is a JSON.It is also going to send as a part of post request
		  header("Content-Type", "application/json").
		  contentType(ContentType.JSON).
		  accept(ContentType.JSON).
		  body(request.toJSONString()).
		when().
		  put("/users/2").
		then().
		  statusCode(200).
		  log().all();
	}
	
	@Test
	public void testPatch() {

		// Request payload sending along with POST request so need to create request payload.
		// JSONObject is a class that represents a Simple JSON.
		// We can add Key - Value pairs using the put method

		JSONObject request = new JSONObject();
		request.put("name", "Raghav");
		request.put("job", "Teacher");

		System.out.println("Request is " + " " + request.toJSONString());

		baseURI = "https://reqres.in/api";

		given().
		// Add a header stating the Request body is a JSON.It is also going to send as a part of post request
		  header("Content-Type", "application/json").
		  contentType(ContentType.JSON).
		  accept(ContentType.JSON).
		  body(request.toJSONString()).
		when().
		  patch("/users/2").
		then().
		  statusCode(200).
		  log().all();
	}
	
	@Test
	public void testDelete() {

		baseURI = "https://reqres.in/api";

		when().
		  delete("/users/2").
		then().
		  statusCode(204).
		  log().all();
	}



}
