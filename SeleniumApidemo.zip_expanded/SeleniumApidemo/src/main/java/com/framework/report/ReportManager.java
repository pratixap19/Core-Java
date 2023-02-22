package com.framework.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportManager {
	
	private static String path;
	private static ExtentReports extent;
	private static String url;

	//reports
	public static ExtentReports getInstance() {
		if (extent == null)
			createInstance();
		return extent;
	}

	/*
	 * public synchronized static ExtentReports getReporter(){
	 * 
	 * return extent; }
	 */
	public static ExtentReports createInstance() {		
		if (extent == null) {
			String workingDir = System.getProperty("user.dir");		
			String reportName = "Report.html";			

			if (System.getProperty("os.name").toLowerCase().contains("mac")
					|| System.getProperty("os.name").toLowerCase().contains("linux")) {
				path = "//target//" + reportName;
			} else {
				path = "\\target\\" + reportName;
			}
			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(workingDir + path);		
			htmlReporter.config().setTheme(Theme.STANDARD);
			htmlReporter.config().setDocumentTitle("Demo report");
			htmlReporter.config().setEncoding("utf-8");
			htmlReporter.config().setReportName("Demo Automated Tests - " + url);
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
		}
		return extent;
	}

}
