package com.subhasishMishra;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetAPI {

	@Test
	void getAPI() {

		System.out.println("1st APT TC");

		Response response = given().param("page", "2").auth().none().header("content-type", "application/json").
				when().get("https://reqres.in/api/users");

		int num = response.then().extract().path("page");
		System.out.println("Page number is " + num);

		System.out.println("Response is " + response.prettyPrint());
		System.out.println("Status code is " + response.statusCode());
		System.out.println("Response time is " + response.getTime());

		System.out.println("Executed successfully");
	}
}
