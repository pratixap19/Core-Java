package com.subhasishMishra;

//In post request sending body in form of an external file.

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class PostAPIUsingExternalFile {
	
	public class PostAPIusingHashMap {
		@Test
		void postAPI() {
			
			Response response = given().auth().none().header("content-type", "application/json").body(new File("./Payload.json"))
					.when()
					.post("https://reqres.in/api/users");

			System.out.println("Response is " + response.asString());
			System.out.println("Status code is " + response.statusCode());
			System.out.println("Response time is " + response.getTime());

			System.out.println("Executed successfully");
			

}
	}
}
