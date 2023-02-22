package com.employeeapi.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.employeeapi.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC001_Get_All_Employees extends TestBase {

	@BeforeClass
	void getAllEmployees() throws InterruptedException {

		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		httpRequest = RestAssured.given();// Create request object
		httpRequest.request(Method.GET, "/employees");// Create response object

		Thread.sleep(3);
	}

	@Test
	void checkResponseBody() {
		String responseBody = response.getBody().asString();
		System.out.println("Response body is: " + responseBody);
		Assert.assertTrue(responseBody != null);

	}
	@Test
	void checkStatusCode() {
		int statusCode = response.getStatusCode();
		System.out.println("Status code is:" + statusCode);
		Assert.assertEquals(statusCode, 200);
	}
	@Test
	void checkResponseTime() {
		long responseTime = response.getTime();
		System.out.println("Response time is: " + responseTime);
		Assert.assertTrue(responseTime>10000);
	}
	@Test
	void checkStatusLine() {
		String statusline = response.getStatusLine();
		System.out.println("Statusline is: "+ statusline);
		Assert.assertEquals(statusline , "HTTP/1.1 200 ok");
	}
		@Test
		void checkcontenttype() {
			
			String contentType = response.header("Content-type");
			System.out.println("Content type is: "+ contentType);
			Assert.assertEquals(contentType, "text/html;charset=UTF-8");
			
	}
		@Test
		void checkserverType() {
			
			String serverType = response.header("server");
			System.out.println("Server type is: "+ serverType);
			Assert.assertEquals(serverType, "nginx/1.14");
			
		}
		
		void checkcontentEncoding() {
			String contentEncoding = response.header("Content-Encoding");
			System.out.println("Content encoding is: "+ contentEncoding);
			Assert.assertEquals(contentEncoding, "gzip");
		}
		
		void checkcontentLength() {
			String contentLength = response.header("Content-Length");
			if(Integer.parseInt(contentLength)<100);
			Assert.assertTrue(Integer.parseInt(contentLength)<100);
		}
			void checkCookies() {
				String cookies = response.getCookies("PHPSESSID");
				Assert.assertEquals(cookies, "gzip");
			
		}
			@AfterClass
			void tearDown() {
				
			}

}
