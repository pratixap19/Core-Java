package com.framework.util;

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.framework.constant.GlobalConstant;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import junit.framework.Assert;

abstract public class BaseAPITest {

	public static ExtentTest test;
	public static ExtentReports extent;
	
	protected static String endPointUrl;
	protected static String password;
	protected static String userName;

	@BeforeSuite
	public void before() throws Exception {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("target/APIReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		endPointUrl = Configuration.readConfigFile("URL");
		password = Configuration.readConfigFile("Password");
		userName = Configuration.readConfigFile("UserName");
	}

	@AfterSuite
	public void tearDownSuite() {
		extent.flush();
	}

	public void reportLog(String message) {
		test.log(Status.INFO, message);
		Reporter.log(message);
	}

	public void reportResponseLog(String message) {
		test.log(Status.INFO, "Below are response ");
		test.log(Status.INFO, message);
		Reporter.log(message);
	}

	public void logRquestUrl(String url) {
		test.log(Status.INFO, endPointUrl + "/" + url);
		Reporter.log(url);
	}

	public void logMethodType(String method) {
		test.log(Status.INFO, "Request method :" + method);
	}

	public void logPostBody(String body) {
		test.log(Status.INFO, "Post method Request body :");
		test.log(Status.INFO, body);
	}

	@BeforeMethod
	public void setupMethod(Method method) throws Exception {
		test = extent.createTest(method.getName(), this.getClass().getName());
		test.assignAuthor("QA");
		test.assignCategory(this.getClass().getSimpleName());
	}

	@BeforeClass
	public void setup() {
		RestAssured.baseURI = endPointUrl;
	}

	@AfterMethod
	public void testAfterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE)
			test.log(Status.FAIL, result.getThrowable());
		if (result.getStatus() == ITestResult.SKIP)
			test.log(Status.SKIP, result.getThrowable());
	}
	
	/**
	 * Convert JSON Object or JSON Array into String type
	 * 
	 * @param jsonObject
	 * @return
	 */
	public String jsonTOString(Object jsonObject) {
		String jsonString = null;
		if (jsonObject instanceof JSONArray) {
			jsonString = ((JSONArray) jsonObject).toJSONString();
		} else if (jsonObject instanceof JSONObject) {
			jsonString = ((JSONObject) jsonObject).toJSONString();
		}
		return jsonString;
	}

	/**
	 * Get Headers
	 * 
	 * @param ssid
	 * @param beToken
	 * @param httpReferer
	 * @return
	 */
	public Headers getAllHeaders() {
		Header header1 = new Header("Content-Type", "application/json");
		Header header2 = new Header("accept", "application/json");	
		List<Header> list = new LinkedList<Header>();
		list.add(header1);
		list.add(header2);	
		Headers headers = new Headers(list);
		return headers;
	}

	public String getAuthJSON() {
		String json = "{\"userName\": \""+userName+"\", \"password\": \""+password+"\" }";
		System.out.println(json);
		return json;
	}
	
	public Header getContentTypeJsonHeader() {
		return new Header("Content-Type", GlobalConstant.Application_JSON);
	}

	public Header getAcceptJsonHeader() {
		return new Header("accept", GlobalConstant.Application_JSON);
	}

	public void verifyResponseCodeAndContentType(Response response, int code, String contentType) {
		reportLog("Verified response code " + code);
		Assert.assertEquals(code, response.getStatusCode());

		reportLog("Verified content type " + contentType);
		response.then().contentType(contentType);
	}


}
