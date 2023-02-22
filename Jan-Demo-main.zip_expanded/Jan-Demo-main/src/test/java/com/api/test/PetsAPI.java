package com.api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PetsAPI {

	@BeforeClass
	public void setBaseUrl() {
		RestAssured.baseURI = "https://petstore.swagger.io";
	}
	
	@Test
	public void getPetsDetails() {
		Response response = given().when().get("/v2/pet/findByStatus?status=sold");
		
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.contentType(), "application/json");		
	}
	
	@Test
	public void getPostDetails() {
		
		String json = "{\r\n"
				+ "  \"id\": 1000,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"doggie3333333333333333333333\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"pending\"\r\n"
				+ "}";
		
		Response response = given().header("Content-Type", "application/json").header("Accept", "application/json")
				.body(json).when().post("/v2/pet");
		
		System.out.println(response.asString());
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.contentType(), "application/json");
		response.then().body("id", Matchers.equalTo(1000)).body("status", equalTo("pending"))
			.body("category.id", equalTo(0));	
	}
	
	@Test
	public void getPutDetails() {
		
		String json = "{\r\n"
				+ "  \"id\": 1000,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"doggie3333333333333333333333\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"pending\"\r\n"
				+ "}";
		
		Response response = given().header("Content-Type", "application/json").header("Accept", "application/json")
				.body(json).when().put("/v2/pet");
		
		System.out.println(response.asString());
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.contentType(), "application/json");
		response.then().body("id", Matchers.equalTo(1000)).body("status", equalTo("pending"))
			.body("category.id", equalTo(0));	
	}
	
	@Test(dependsOnMethods = {"getPostDetails"})
	public void getPetsDetailsById() {
		Response response = given().when().get("v2/pet/1000");
		
		System.out.println(response.asString());
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.contentType(), "application/json");
		response.then().body("id", Matchers.equalTo(1000)).body("status", equalTo("pending"))
		.body("category.id", equalTo(0));	
	}
	
	@Test(dependsOnMethods = {"getPetsDetailsById"})
	public void deletePet() {
		Response response = given().when().delete("v2/pet/1000");
		
		System.out.println(response.asString());
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.contentType(), "application/json");
	}
	
	@Test
	public void baiscAuth() {
		RestAssured.baseURI = "https://postman-echo.com";
		Response response = given().auth().basic("postman", "password").when().get("/basic-auth");
		System.out.println(response.asPrettyString());
		System.out.println(response.statusCode());
	}
}
