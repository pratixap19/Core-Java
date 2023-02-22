package com.subhasishMishra;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class PostAPIUsingPOJO {
	
	Employee emp = new Employee("Morpheus", "leader", new String[] {"Java", "C"});
	
	Response response = given().auth().none().header("content-type", "application/json").body(emp)
			.when()
			.post("https://reqres.in/api/users");

	System.out.println("Response is " + response.asString());
	System.out.println("Status code is " + response.statusCode());
	System.out.println("Response time is " + response.getTime());

	System.out.println("Executed successfully");
	

}
