package com.sweetshop.utils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    public static ExtentReports extent;
    public static ExtentReports getReportObject() {
        String path =
                "reports/ExtentReport.html";
        ExtentSparkReporter reporter =
                new ExtentSparkReporter(path);
        reporter.config().setReportName(
                "SweetCart Automation Report"
        );
        reporter.config().setDocumentTitle(
                "Automation Test Results"
        );
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        return extent;
    }
}