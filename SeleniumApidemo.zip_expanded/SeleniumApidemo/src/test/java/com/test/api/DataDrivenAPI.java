package com.test.api;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.apitest.datadriven.DataProviders;
import com.framework.constant.GlobalConstant;
import com.framework.util.BaseAPITest;
import com.framework.util.HttpStatusCode;
import com.framework.util.MethodType;
import io.restassured.response.Response;


public class DataDrivenAPI extends BaseAPITest {

	@Test(dataProvider = "UserData", dataProviderClass = DataProviders.class)
	public void createUser(String userName, String password) {

		JSONObject requestParams = new JSONObject();
		requestParams.put("userName", userName);
		requestParams.put("password", password);

		reportLog("Started execution of test create user");
		logRquestUrl("/Account/v1/User");
		logMethodType(MethodType.HTTP_POST);

		Response response = given().auth().preemptive().basic(userName, password).headers(getAllHeaders())
				.body(requestParams.toJSONString()).post("/Account/v1/User");
		super.logPostBody(requestParams.toJSONString());	
		super.reportResponseLog(response.asString());

		verifyResponseCodeAndContentType(response, HttpStatusCode.HTTP_Created, GlobalConstant.Application_JSON);
		response.then().body("username", equalTo(userName));
		super.reportLog("Verify user name is response body");		
	}
}
