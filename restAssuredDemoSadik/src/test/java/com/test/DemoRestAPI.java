package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.given;

public class DemoRestAPI {
    
	
	@BeforeClass
	public void setUp() {
		RestAssured.baseURI = "https://petstore.swagger.io";
	}
	
	@Test
	public void testAPI() {
		
		
		Response response = given().header("accept", "application/json").
		 when().get("/v2/pet/findByStatus?status=pending");
		System.out.println(response.prettyPrint());
		
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.contentType(), "application/json");
		
		}
	
	@Test
	public void postPets() {
		String json = "{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"doggie\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"available\"\r\n"
				+ "}";
		//System.out.println(json);
		
		Response response = given().header("accept", "application/json").header("Content-Type", "application/json").body(json).
		when().post("/v2/pet");
		
		System.out.println(response.asPrettyString());
		
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.contentType(), "application/json");
		
	}
	
	@Test
	public void putPets() {
		String json = "{\r\n"
				+ "  \"id\": 9223372000000033846,"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"doggieYoshi\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"available\"\r\n"
				+ "}";
		//System.out.println(json);
		
		Response response = given().header("accept", "application/json").header("Content-Type", "application/json").body(json).
		when().put("/v2/pet");
		
		System.out.println(response.asPrettyString());
		
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.contentType(), "application/json");
		
	}
	
	@Test
	public void delete() {
		
		Response response = given().header("accept","application/json").
		when().delete("/v2/pet/111");
		
	}
}

