package com.api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PetsAPI {
	//Type URL
	@BeforeClass
	public void setBaseUrl() {
		
		RestAssured.baseURI = "https://petstore.swagger.io";
	}
	
	@Test
	public void getPetsDetails() {
		Response response  = given().when().get("/v2/pet/findByStatus?status=pending");
		System.out.println(response.asString());
		Assert.assertEquals(response.statusCode(),200);
		Assert.assertEquals(response.contentType(), "application/json");
		}

	private RestAssured given() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
