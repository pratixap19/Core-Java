package com.test.api;

import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import com.framework.constant.GlobalConstant;
import com.framework.util.BaseAPITest;
import com.framework.util.HttpStatusCode;
import com.framework.util.MethodType;
import com.framework.util.Utilities;

import io.restassured.response.Response;

public class Account extends BaseAPITest {

	String userId;
	
	@Test
	public void getAth() {
		super.reportLog("Started execution of test get auth");
		super.logRquestUrl("/Account/v1/Authorized");
		super.logMethodType(MethodType.HTTP_POST);

		Response response = given().auth().preemptive().basic(userName, password).headers(getAllHeaders())
				.body(getAuthJSON()).when().post("/Account/v1/Authorized");
		super.reportResponseLog(response.asString());

		super.verifyResponseCodeAndContentType(response, HttpStatusCode.HTTP_OK, GlobalConstant.Application_JSON);
		Assert.assertEquals("true", response.asString());
		super.reportLog("Verify response is true");
	}

	@Test
	public void verifyUnAuthUser() {	
		super.reportLog("Started execution of test create user without body");
		super.logRquestUrl("/Account/v1/User");	
		super.logMethodType(MethodType.HTTP_POST);

		Response response = given().headers(getAllHeaders()).post("/Account/v1/User");
		super.reportResponseLog(response.asString());
		
		response.then().body("message", equalTo("UserName and Password required."));
		super.reportLog("Verify user name is response body");
	}

	
	@Test
	public void createUser() {

		JSONObject requestParams = new JSONObject();
		String testuserName = "test"+Utilities.getTimeStamp();
		requestParams.put("userName", testuserName);
		requestParams.put("password", "P@ssw0rd");
		
		reportLog("Started execution of test create user");
		logRquestUrl("/Account/v1/User");	
		logMethodType(MethodType.HTTP_POST);

		Response response = given().auth().preemptive().basic(userName, password).headers(getAllHeaders())
				.body(requestParams.toJSONString()).post("/Account/v1/User");
		super.logPostBody(requestParams.toJSONString());	
		super.reportResponseLog(response.asString());
	
		verifyResponseCodeAndContentType(response, HttpStatusCode.HTTP_Created, GlobalConstant.Application_JSON);	
		response.then().body("username", equalTo(testuserName));
		super.reportLog("Verify user name is response body");
		
		userId = response.then().extract().path("userID");
	}

	@Test(dependsOnMethods = {"createUser"})
	public void getUserById() {
		
		reportLog("Started execution of test get user details for id "+userId);
		logRquestUrl("/Account/v1/User");	
		logMethodType(MethodType.HTTP_GET);

		Response response = given().auth().preemptive().basic(userName, password).headers(getAllHeaders())
				.get("/Account/v1/User/"+userId);

		super.reportResponseLog(response.asString());	
		verifyResponseCodeAndContentType(response, HttpStatusCode.HTTP_OK, GlobalConstant.Application_JSON);
	}
	
	@Test(dependsOnMethods = {"getUserById"}, alwaysRun = true)
	public void deletetUser() {		
		reportLog("Started execution of test delete user for id "+userId);
		logRquestUrl("/Account/v1/User");	
		logMethodType(MethodType.HTTP_DELETE);

		Response response = given().auth().preemptive().basic(userName, password).headers(getAllHeaders())
				.delete("/Account/v1/User/"+userId);

		super.reportResponseLog(response.asString());	
		verifyResponseCodeAndContentType(response, HttpStatusCode.HTTP_OK, GlobalConstant.Application_JSON);
	}
}
