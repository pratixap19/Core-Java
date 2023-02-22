package com.RahulShetty;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class AddPlacePostMethod {

	public static void main(String[] args) {
	String payload = "{\r\n"
			+ "  \"location\": {\r\n"
			+ "    \"lat\": -38.383494,\r\n"
			+ "    \"lng\": 33.427362\r\n"
			+ "  },\r\n"
			+ "  \"accuracy\": 50,\r\n"
			+ "  \"name\": \"Frontline house\",\r\n"
			+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
			+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
			+ "  \"types\": [\r\n"
			+ "    \"shoe park\",\r\n"
			+ "    \"shop\"\r\n"
			+ "  ],\r\n"
			+ "  \"website\": \"http://google.com\",\r\n"
			+ "  \"language\": \"French-IN\"\r\n"
			+ "}\r\n"
			+ " ";
       RestAssured.baseURI = "https://rahulshettyacademy.com";
       given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").body(payload)
	.when().post("/maps/api/place/add/json")
	.then().log().all().assertThat().statusCode(200);
	
	}
	

}
