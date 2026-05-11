package com.sweetshop.listeners;

import com.sweetshop.utils.ScreenshotUtil;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        ScreenshotUtil.captureScreenshot(
                result.getName()
        );

        System.out.println(
                "Test Failed : " + result.getName()
        );
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println(
                "Test Passed : " + result.getName()
        );
    }
}